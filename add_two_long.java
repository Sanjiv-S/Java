public class add_two_long {
    static void add(){
        String num1="999999999999";
        String num2="4444444";
        int carry=0;
        int sum=0;
        int remainder=0;
        String str="";
        while (num1.length() < num2.length()) {
            num1 = "0" + num1;
        }
        while (num2.length() < num1.length()) {
            num2 = "0" + num2;
        }
        for(int i=num1.length()-1;i>=0;i--){
                int digit1=num1.charAt(i)-'0';
                int digit2=num2.charAt(i)-'0';
                sum=digit1+digit2+carry;
                carry=sum/10;
                if(i!=0){
                    remainder=sum%10;
                } 
                else{
                    remainder=sum;
                }
                str=remainder+str;
            }
            System.out.print(str);
        }
    public static void main(String args[]){
        add();
    }
}
