
interface testinterface {
  
    final int a = 10;
    void display();
}
class TestClass implements testinterface {
    public void display(){ 
      System.out.println("Hello!"); 
    }
}
class Geeks
{
    public static void main(String[] args){
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }

}


