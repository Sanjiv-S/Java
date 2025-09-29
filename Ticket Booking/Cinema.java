import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Cinema {
    private List<City> cities;
    private List<Movie> movies;
    private List<Theater> theaters;
    private List<Showtime> showtimes;
    private List<User> users;
    private Admin admin;
    private Scanner scanner;
    private User currentUser;

    public Cinema() {
        cities = new ArrayList<>();
        movies = new ArrayList<>();
        theaters = new ArrayList<>();
        showtimes = new ArrayList<>();
        users = new ArrayList<>();
        admin = new Admin("hari", "hari123");
        users.add(admin);
        scanner = new Scanner(System.in);
        initializeData();
    }
    
    private void initializeData() {
        City coimbatore = new City("Coimbatore");
        City chennai = new City("Chennai");
        cities.add(coimbatore);
        cities.add(chennai);
        
        Movie movie1 = new Movie("The Martian", "Sci-Fi", 144);
        Movie movie2 = new Movie("Interstellar", "Sci-Fi", 169);
        Movie movie3 = new Movie("Pulp Fiction", "Crime", 154);
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);

        Theater theater1 = new Theater("Brooke Fields Cinemas", coimbatore, 5, 8);
        Theater theater2 = new Theater("Fun Cinemas", coimbatore, 6, 10);
        Theater theater3 = new Theater("PVR Cinemas", chennai, 8, 12);
        theaters.add(theater1);
        theaters.add(theater2);
        theaters.add(theater3);

        showtimes.add(new Showtime(movie1, theater1, "10:00 AM", 150.00));
        showtimes.add(new Showtime(movie1, theater2, "01:30 PM", 180.00));
        showtimes.add(new Showtime(movie2, theater1, "04:00 PM", 200.00));
        showtimes.add(new Showtime(movie3, theater3, "07:30 PM", 220.00));
    }

    public static void main(String[] args) {
        new Cinema().run();
    }

    public void run() {
        while (true) {
            System.out.println("\n--- Welcome to the Cinema Booking System ---");
            System.out.println("1. Login as User");
            System.out.println("2. Register as User");
            System.out.println("3. Login as Admin");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1": userLogin(); break;
                case "2": registerUser(); break;
                case "3": adminLogin(); break;
                case "4": System.out.println("Thank you for visiting."); return;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // --- User & Admin Login/Registration ---
    private void userLogin() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        currentUser = findUser(username, password);
        if (currentUser != null && !(currentUser instanceof Admin)) {
            System.out.println("Login successful!");
            userMenu();
        } else {
            System.out.println("Invalid credentials or account does not exist.");
        }
    }
    
    private void registerUser() {
        System.out.print("Enter new username: ");
        String username = scanner.nextLine();
        for (User u : users) {
            if (u.getUsername().equals(username)) {
                System.out.println("Username already exists. Please choose another.");
                return;
            }
        }
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        users.add(new User(username, password));
        System.out.println("Registration successful! You can now log in.");
    }
    
    private void adminLogin() {
        System.out.print("Enter admin username: ");
        String username = scanner.nextLine();
        System.out.print("Enter admin password: ");
        String password = scanner.nextLine();
        if (admin.getUsername().equals(username) && admin.authenticate(password)) {
            System.out.println("Admin login successful!");
            adminMenu();
        } else {
            System.out.println("Invalid admin credentials.");
        }
    }
    
    private User findUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                return user;
            }
        }
        return null;
    }

    // --- User Menu ---
    private void userMenu() {
        while (true) {
            System.out.println("\n--- User Menu ---");
            System.out.println("1. Find movies in your city");
            System.out.println("2. Search for a movie by title or genre");
            System.out.println("3. Book a ticket");
            System.out.println("4. View my booking history");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1": findMoviesInCity(); break;
                case "2": searchMovie(); break;
                case "3": bookTicket(); break;
                case "4": viewBookingHistory(); break;
                case "5": System.out.println("Logged out."); return;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    private void findMoviesInCity() {
        System.out.println("Available Cities:");
        cities.forEach(c -> System.out.println("- " + c.getName()));
        System.out.print("Enter city name: ");
        String cityName = scanner.nextLine();

        List<Showtime> cityShowtimes = showtimes.stream()
            .filter(st -> st.getTheater().getCity().getName().equalsIgnoreCase(cityName))
            .collect(Collectors.toList());

        if (cityShowtimes.isEmpty()) {
            System.out.println("No movies found in " + cityName + ".");
            return;
        }

        System.out.println("\n--- Movies in " + cityName + " ---");
        cityShowtimes.stream()
            .collect(Collectors.groupingBy(st -> st.getMovie().getTitle()))
            .forEach((title, list) -> {
                System.out.println("\n- " + title);
                list.forEach(st -> System.out.println("  " + st.getTheater().getName() + " | " + st.getTime() + " | $" + st.getPricePerSeat()));
            });
    }

    private void searchMovie() {
        System.out.print("Enter movie title or genre: ");
        String query = scanner.nextLine().toLowerCase();
        
        List<Showtime> searchResults = showtimes.stream()
            .filter(st -> st.getMovie().getTitle().toLowerCase().contains(query) || st.getMovie().getGenre().toLowerCase().contains(query))
            .collect(Collectors.toList());

        if (searchResults.isEmpty()) {
            System.out.println("No movies found matching your search.");
            return;
        }

        System.out.println("\n--- Search Results ---");
        searchResults.forEach(System.out::println);
    }
    
    private void bookTicket() {
        if (showtimes.isEmpty()) {
            System.out.println("No shows available."); return;
        }
        
        System.out.println("\n--- Available Showtimes ---");
        for (int i = 0; i < showtimes.size(); i++) {
            System.out.println((i + 1) + ". " + showtimes.get(i));
        }

        System.out.print("Select a show by number: ");
        try {
            int showtimeIndex = Integer.parseInt(scanner.nextLine()) - 1;
            if (showtimeIndex < 0 || showtimeIndex >= showtimes.size()) {
                System.out.println("Invalid showtime number."); return;
            }
            Showtime selectedShowtime = showtimes.get(showtimeIndex);
            
            selectedShowtime.displaySeating();
            
            System.out.print("Enter seats to book (e.g., A1,A2,B3): ");
            String seatInput = scanner.nextLine().toUpperCase();
            List<String> seatsToBook = List.of(seatInput.split(","));

            double totalPrice = selectedShowtime.getPricePerSeat() * seatsToBook.size();

            if (selectedShowtime.bookSeats(seatsToBook)) {
                Booking newBooking = new Booking(currentUser, selectedShowtime, seatsToBook, totalPrice);
                currentUser.getBookingHistory().add(newBooking);
                System.out.println("\nBooking successful!");
                System.out.println(newBooking);
            } else {
                System.out.println("Booking failed. Please try again with different seats.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
    
    private void viewBookingHistory() {
        System.out.println("\n--- Your Booking History ---");
        if (currentUser.getBookingHistory().isEmpty()) {
            System.out.println("You have no past bookings.");
        } else {
            currentUser.getBookingHistory().forEach(System.out::println);
        }
    }

    // --- Admin Menu ---
    private void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add a new city");
            System.out.println("2. Add a new movie");
            System.out.println("3. Add a new theater");
            System.out.println("4. Add a new showtime");
            System.out.println("5. View all data");
            System.out.println("6. Logout");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "1": addCity(); break;
                case "2": addMovie(); break;
                case "3": addTheater(); break;
                case "4": addShowtime(); break;
                case "5": displayAllData(); break;
                case "6": System.out.println("Admin logged out."); return;
                default: System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCity() {
        System.out.print("Enter city name: ");
        String name = scanner.nextLine();
        cities.add(new City(name));
        System.out.println("City added successfully.");
    }
    
    private void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter duration (in minutes): ");
        try {
            int duration = Integer.parseInt(scanner.nextLine());
            movies.add(new Movie(title, genre, duration));
            System.out.println("Movie added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid duration. Please enter a number.");
        }
    }
    
    private void addTheater() {
        if (cities.isEmpty()) { System.out.println("Please add a city first."); return; }
        System.out.println("Available Cities:");
        for (int i = 0; i < cities.size(); i++) System.out.println((i + 1) + ". " + cities.get(i).getName());
        System.out.print("Select city by number: ");
        try {
            int cityIndex = Integer.parseInt(scanner.nextLine()) - 1;
            if (cityIndex < 0 || cityIndex >= cities.size()) { System.out.println("Invalid city number."); return; }
            City city = cities.get(cityIndex);
            System.out.print("Enter theater name: ");
            String name = scanner.nextLine();
            System.out.print("Enter number of rows: ");
            int rows = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter number of seats per row: ");
            int seatsPerRow = Integer.parseInt(scanner.nextLine());
            theaters.add(new Theater(name, city, rows, seatsPerRow));
            System.out.println("Theater added successfully.");
        } catch (NumberFormatException e) { System.out.println("Invalid input. Please enter a number."); }
    }
    
    private void addShowtime() {
        if (movies.isEmpty() || theaters.isEmpty()) {
            System.out.println("Cannot add showtime. Please add movies and theaters first."); return;
        }
        try {
            System.out.println("Available Movies:");
            for (int i = 0; i < movies.size(); i++) System.out.println((i + 1) + ". " + movies.get(i).getTitle());
            System.out.print("Select movie by number: ");
            int movieIndex = Integer.parseInt(scanner.nextLine()) - 1;
            Movie selectedMovie = movies.get(movieIndex);

            System.out.println("Available Theaters:");
            for (int i = 0; i < theaters.size(); i++) System.out.println((i + 1) + ". " + theaters.get(i));
            System.out.print("Select theater by number: ");
            int theaterIndex = Integer.parseInt(scanner.nextLine()) - 1;
            Theater selectedTheater = theaters.get(theaterIndex);
            
            System.out.print("Enter showtime (e.g., 03:00 PM): ");
            String time = scanner.nextLine();
            System.out.print("Enter price per seat: ");
            double price = Double.parseDouble(scanner.nextLine());
            
            showtimes.add(new Showtime(selectedMovie, selectedTheater, time, price));
            System.out.println("Showtime added successfully.");
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }

    private void displayAllData() {
        System.out.println("\n--- All Cities ---"); cities.forEach(c -> System.out.println("- " + c));
        System.out.println("\n--- All Movies ---"); movies.forEach(m -> System.out.println("- " + m));
        System.out.println("\n--- All Theaters ---"); theaters.forEach(t -> System.out.println("- " + t));
        System.out.println("\n--- All Showtimes ---"); showtimes.forEach(s -> System.out.println("- " + s));
        System.out.println("\n--- All Users ---"); users.forEach(u -> System.out.println("- " + u.getUsername()));
    }
}