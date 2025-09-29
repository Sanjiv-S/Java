import java.util.List;

public class Booking {
    private static int nextBookingId = 1001;
    private int bookingId;
    private User user;
    private Showtime showtime;
    private List<String> seats;
    private double totalPrice;

    public Booking(User user, Showtime showtime, List<String> seats, double totalPrice) {
        this.bookingId = nextBookingId++;
        this.user = user;
        this.showtime = showtime;
        this.seats = seats;
        this.totalPrice = totalPrice;
    }

    public int getBookingId() { return bookingId; }
    public User getUser() { return user; }
    public Showtime getShowtime() { return showtime; }
    public List<String> getSeats() { return seats; }
    public double getTotalPrice() { return totalPrice; }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId +
               "\n  Movie: " + showtime.getMovie().getTitle() +
               "\n  Theater: " + showtime.getTheater().getName() + " (" + showtime.getTheater().getCity().getName() + ")" +
               "\n  Showtime: " + showtime.getTime() +
               "\n  Seats: " + String.join(", ", seats) +
               "\n  Total Price: $" + String.format("%.2f", totalPrice) + "\n";
    }
}