public class Department extends Student {
    String dept;
    Department(String CollegeName,String StudentName,int RegNo,String dept){
        super(CollegeName, StudentName, RegNo);
        this.dept=dept;
    }
    void Display(){
        super.Display();
        System.out.println("dept:"+dept);
    }
}
