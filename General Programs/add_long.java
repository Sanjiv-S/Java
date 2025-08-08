public class add_long {
        static void add(){
            String num1="2345678";
            String num2="9765435";
            int carry=0;
            int sum=0;
            int i=num1.length()-1,j=num2.length()-1;
            int remainder=0;
            String str="";
            while(i>0){                
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
                i--;
            }
    
        public static void main(String args[]){
            add();
        }
    }
    

