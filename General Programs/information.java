public class information {
    static  int startingRegNumber=1000;
    int regnumber;
    String name;
    String dept;
    information(String name,String dept){
        regnumber=startingRegNumber++;
        this.name=name;
        this.dept=dept;
    }
    void print(){
        System.out.println("Reg no:"+regnumber);
        System.out.println("Name:"+name);
        System.out.println("dept:"+ dept); 

    }
}
