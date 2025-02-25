
interface test {
  
    final int a = 10;
    void display();
}
class TestClass implements test {
    public void display(){ 
      System.out.println("Hello!"); 
    }
}
class testinterface 
{
    public static void main(String[] args){
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }

}


