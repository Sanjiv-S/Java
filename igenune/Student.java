public class Student extends College {
    String StudentName;
    int RegNo;
    Student(String CollegeName,String StudentName,int RegNo){
        super(CollegeName); 
        this.StudentName=StudentName;
        this.RegNo=RegNo;
    }
    void Display(){
        super.Display();
        System.out.println("Student Name:"+StudentName);
        System.out.println("Reg No:"+RegNo);
    }
}
