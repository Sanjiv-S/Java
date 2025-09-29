import java.util.List;

public class Showtime {
    private Movie movie;
    private Theater theater;
    private String time;
    private double pricePerSeat;
    private boolean[][] seatsOccupied;

    public Showtime(Movie movie, Theater theater, String time, double pricePerSeat) {
        this.movie = movie;
        this.theater = theater;
        this.time = time;
        this.pricePerSeat = pricePerSeat;
        this.seatsOccupied = new boolean[theater.getRows()][theater.getSeatsPerRow()];
    }

    public Movie getMovie() { return movie; }
    public Theater getTheater() { return theater; }
    public String getTime() { return time; }
    public double getPricePerSeat() { return pricePerSeat; }

    public boolean bookSeats(List<String> seatsToBook) {
        // Validation and booking logic
        List<int[]> seatIndices = new java.util.ArrayList<>();
        for (String seat : seatsToBook) {
            char rowChar = seat.charAt(0);
            int row = rowChar - 'A';
            int seatNum = Integer.parseInt(seat.substring(1)) - 1;
            if (row < 0 || row >= seatsOccupied.length || seatNum < 0 || seatNum >= seatsOccupied[0].length || seatsOccupied[row][seatNum]) {
                System.out.println("Error: Seat " + seat + " is invalid or already taken.");
                return false;
            }
            seatIndices.add(new int[]{row, seatNum});
        }
        
        for (int[] indices : seatIndices) {
            seatsOccupied[indices[0]][indices[1]] = true;
        }
        return true;
    }

    public void displaySeating() {
        System.out.println("\n--- Seating Plan ---");
        String[][] seatingPlan = theater.getSeatingPlan();
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[0].length; j++) {
                if (seatsOccupied[i][j]) {
                    System.out.print("[XX]");
                } else {
                    System.out.print("[" + seatingPlan[i][j] + "]");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Movie: " + movie.getTitle() + " | Theater: " + theater.getName() + " | Time: " + time + " | Price: $" + pricePerSeat;
    }
}