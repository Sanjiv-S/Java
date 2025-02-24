abstract class sub {
    final double PI ;
    static int a;
    sub(){
        this.PI =3.14;
    }
    static void initialization(){
        a=12345;
        System.out.println(a);
    }
}
class fin extends sub{
    public static void main(String[] args) {
        fin obj = new fin();
        System.out.println(obj.PI);
        initialization();
    }
}
   

