public class Theater {
    private String name;
    private City city;
    private int rows;
    private int seatsPerRow;
    private String[][] seatingPlan;

    public Theater(String name, City city, int rows, int seatsPerRow) {
        this.name = name;
        this.city = city;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.seatingPlan = new String[rows][seatsPerRow];
        initializeSeatingPlan();
    }

    private void initializeSeatingPlan() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                char rowChar = (char) ('A' + i);
                seatingPlan[i][j] = String.valueOf(rowChar) + (j + 1);
            }
        }
    }

    public String getName() { return name; }
    public City getCity() { return city; }
    public int getRows() { return rows; }
    public int getSeatsPerRow() { return seatsPerRow; }
    public String[][] getSeatingPlan() { return seatingPlan; }

    @Override
    public String toString() {
        return "Name: " + name + " | Location: " + city.getName();
    }
}