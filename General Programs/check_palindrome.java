public class check_palindrome {
        static void isPalindrome(int x) {
            int count=0;
            double value=0;
            int og_value=x;
            int og1=x;
            while(x>0){
                x=x/10;
                ++count;
            }
            int arr[]=new int[count];
            for(int i=0;i<count;i++){
                arr[i]=og_value%10;
                og_value=og_value/10;
            }
            int power=count-1;
            for(int j=0;j<count;j++){
                value=arr[j]*Math.pow(10,power)+value;
                power--;
            }
            long new_value=(long)value;
           if(og1==new_value){
                System.out.print("Palindrome");
           }
           else{
            System.out.print(" Not Palindrome");
           }
        }
        public static void main(String args[]){
            isPalindrome(2147483647);
    }
    }

