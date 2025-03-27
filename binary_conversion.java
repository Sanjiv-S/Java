public class binary_conversion {
    static void conversion(){
        String s="1010";
        String b="1011";
        while (s.length() > b.length()) {
            b = "0" + b;
        }
        while (b.length() > s.length()) {
            s = "0" + s;
        }
        char arr[]=s.toCharArray();
        char arr1[]=b.toCharArray();
        int carry=0;
        int val=0;
        StringBuilder sb =new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            int n=arr[i]-'0';
            int m=arr1[i]-'0';
            if(m==1 && n==1){
                if(i==0 && carry!=1){
                    sb.append(0);
                    sb.append(1);
                }
                else if(i==0 && carry==1){
                    sb.append(1);
                    sb.append(1);
                }
                else{
                    sb.append(0);
                    carry=1;
                }
            }
            else if((m==0 && n==1) ||(m==1 && n==0)){
                if(carry==1 && i!=0){
                    val=val+carry;
                    sb.append(val);
                    carry=1;
                }
                else if(carry==1 && i==0){
                    sb.append(0);
                    sb.append(1);
                }
                else{
                    sb.append(1);
                }
            }
            else if(m==0 && n==0){
                if(carry==1){
                    val=val+carry;
                    sb.append(val);
                    carry=0;}
                else{
                    sb.append(0);
                }
            }
    } System.out.print(sb.reverse().toString());
}
    public static void main(String args[]){
        conversion();
    }
}
