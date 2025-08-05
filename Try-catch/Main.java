
public class Main {
    static void checkEligibility(int i)throws Exception{
        if(i<=18){
            throw new Exception("less than 18 years");
        }
        else{
            System.out.println("Accepted");
        }
    }
    public static void main(String[] args) {
        try{
        int [] arr={1,2,3};
        checkEligibility(16);
        int b=10/0;
        int a=arr[3];
        }
        // catch(ArithmeticException e){
        //     System.out.println("Cannot divide by zero");
        // }
        
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Array Index out of bound");
        // }
        catch(Exception e){
            System.out.println("General error "+e.getMessage());
        }
        // finally{
        //     System.out.println("Finally block runs here");
        // }
        // System.out.println("out of try catch block");
    }
}
