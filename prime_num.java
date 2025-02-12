public class prime_num {
    public static void main(String args[]){
        int num=2; 
        while(num<=100){
            boolean isPrime = true;
            for(int j=2; j <= Math.sqrt(num); j++){
                if(num % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(num);
            }
            num++;
        }
    }
}
