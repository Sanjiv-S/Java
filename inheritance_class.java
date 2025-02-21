public class inheritance_class {
    private int a=567;
    private int b=67;
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
    public static void main(String args[]){
        sub_class obj=new sub_class();
        obj.display();
    }
}
class sub_class extends inheritance_class{
    public void display(){
        int c = get_a()+get_b();
        System.out.print(c);
    }
    
}