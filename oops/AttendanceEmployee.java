
class AttendanceEmployee extends Employee implements Markable {
    private int[] attendanceArray= new int[7];

    public AttendanceEmployee(String Name,int id,String department) {
        super(Name,id,department);
    }
      @Override
    public void markAttendance(int[] attendanceInput) {
        if (attendanceInput.length == 7) {
            for (int i = 0; i < 7; i++) {
                attendanceArray[i] = attendanceInput[i];
            }
        }
    }

    @Override
    public int calculatePresentDays(int[] attendanceArray) {
        int count = 0;
        for (int day : attendanceArray) {
            if (day == 1) count++;
        }
        return count;
    }

    public void displayAttendance() {
        System.out.print("Attendance for 7 days: ");
        for (int day : attendanceArray) {
            System.out.print(day + " ");
        }
        System.out.println("\nTotal Present Days: " + calculatePresentDays(attendanceArray));
    }
}
