public class Department {
    private String departmentName;
    private int deptCode;
    Department(String departmentName,int deptCode){
        this.departmentName=departmentName;
        this.deptCode=deptCode; 
    }
    void showDepartmentDetails(){
        System.out.println("Department Name:"+departmentName);
        System.out.println("Department Code:"+deptCode);
    }
}
