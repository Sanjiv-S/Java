class single {
    void dispA(){
        System.out.println("most of the people");
    }
}
class me extends single{
    void dispB(){
        System.out.println("suffer mostly in their imagination");
    }
}
class alone extends me{
    void sanjiv(){
        System.out.print("than in reality");
    }
    public static void main(String[] a){
        alone r=new alone();
        r.dispA();
        r.dispB();
        r.sanjiv();
    }
}