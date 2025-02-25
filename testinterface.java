
interface test {
  
    final int a = 10;
}
interface TestClass extends test {
    void display();
}
class tests implements TestClass{
    public void display(){ 
        System.out.println("inside the interface class"); 
      }
}
class testinterface 
{
    public static void main(String[] args){
        tests t = new tests();
        t.display();
        System.out.println(t.a);
    }

}


