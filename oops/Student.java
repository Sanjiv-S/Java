public class Student {
    private String studentName;
    private int studentId;
    private Department[] department;
    Student(String studentName,int studentId,Department[] department){
        this.studentName=studentName;
        this.studentId=studentId;
        this.department=department;
    }
    void showStudentDetails(){
        System.out.println("Student Name:"+studentName);
        System.out.println("Student Id:"+studentId);
        System.out.println("Department details->");
        for(Department i:department){
            i.showDepartmentDetails();
        }
    }
}
