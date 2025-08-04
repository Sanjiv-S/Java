
public class Employee extends Person {
    private String department;
    private static int employeeCount=0;
    static void showEmployeeCount(){
        System.out.print("total employee count:"+employeeCount);
    }

    Employee(String Name, int id, String department){
        super(Name,id);
        this.department=department;
        employeeCount++;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @Override
    void showDetails(){
        
        System.out.print("Name"+getName());
        System.out.println("ID:"+getId());
        System.out.println("Department:"+department);
    }
    
}
