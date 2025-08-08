public class divide {
    public static void main(String args []){
        int divident=0;
        int divisor =1;
        int count=0;
        int min_value=-((int)Math.pow(2,31));
        if(divident==0){
            System.out.print(0);
        }
        while(divident>0){
            if(divisor>0){
                divident=divident-divisor;
                ++count;
            }
            else{
                divident=divident+divisor;
                count++;
            }
            
        }
        System.out.println(count);
        if(divident == divisor){
            System.out.print(1);
        }
        System.out.print(count-1);
    }
}
