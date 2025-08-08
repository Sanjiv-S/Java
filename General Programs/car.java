public class car {
    String brand;
    car(String brand){
        this.brand =brand;
        System.out.println(brand);
    }
    public void Setbrand(){
        brand ="audi";
        System.out.print("Brand:"+brand);
    }
    public static void main(String[] args) {
        car obj =new car("benz");
        obj.Setbrand();
    }
}
