public class car {
    String brand;
    car(){
        brand = "unknown";
        System.out.println(brand);
    }
    public void Setbrand(){
        brand ="audi";
        System.out.print("Brand:"+brand);
    }
    public static void main(String[] args) {
        car obj =new car();
        obj.Setbrand();
    }
}
