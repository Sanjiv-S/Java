public class palindrome_1 {
    static void check_palindrome(String str){
        char ch[]=str.toCharArray();
        String rev =new StringBuilder(str).reverse().toString();
        char ch1[]=rev.toCharArray();
        int count=0;
        if(rev.equals(str)){
            System.out.print("0");
        }
        else{
            for(int i=0;i<str.length()-1;i++){
                if(i<str.length()/2){
                    if(ch[i]!=ch1[i]){
                        ch1[i]=ch[i];
                        count++;
                    }
                }
                }
            }
            System.out.print(count);
        }
    static String check(String s){
        int len=s.length();
        String result="";
        if(s.length()==1){
            result=s;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                String substring=s.substring(i,j);
                StringBuilder sb = new StringBuilder(substring);
                if(substring.equals(sb.reverse().toString())){
                    if(substring.length()>result.length()){
                        result=substring;
                        System.out.print(substring.length());
                    }
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        String str="abcde";
        //check_palindrome(str);
        String s="bb";
        System.out.print(check(s));
    }
}
