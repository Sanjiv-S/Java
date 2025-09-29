import java.util.ArrayList;
import java.util.List;

public class User {
    protected String username;
    protected String password;
    private List<Booking> bookingHistory;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.bookingHistory = new ArrayList<>();
    }

    public String getUsername() { return username; }
    public boolean authenticate(String pass) { return this.password.equals(pass); }
    public List<Booking> getBookingHistory() { return bookingHistory; }
}