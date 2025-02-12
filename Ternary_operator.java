public class Ternary_operator {
   
    public static void main(String args[]){
        int a =10;
        int b =34;
        int c =58;
        int max =(a>b && a>c)?a:(b>c)?b:c;
        System.out.println("Maximum value is :"+max);
    }

    
}
