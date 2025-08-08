
interface V{
    void display();
}
interface R{
    void net();
}
 class fec implements V,R{
    public void display(){
        System.out.print("get ready to feel the thunder");
    }
    public void net()
        {
            System.out.println("I AM IRONMAN");
        }
}
class met extends fec{
    void lec(){
        System.out.print("weapon");
    }
    public static void main(String[] args){
        met M= new met();
        M.display();
        M.net();
        M.lec();
    }

}
