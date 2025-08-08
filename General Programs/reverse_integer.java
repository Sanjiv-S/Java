public class reverse_integer {
    public static void main(String args[]){
                int x=213;
                int reversed = 0;
                while (x != 0) {
                    int digit = x % 10;
                    if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                        System.out.print(0);
                    }
                    if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                        System.out.print(0);
                    }
                    reversed = reversed * 10 + digit;
                }
        
                System.out.print(reversed) ;
            }
        }
        


