public class num_char {
    static void builtin(String str){
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            char prev='0';
            StringBuilder pri = new StringBuilder();
            if(i>0){
                prev=str.charAt(i-1);
                pri.append(prev);
            }
        if(Character.isDigit(ch)){
            int ne=ch-'0';
            if(Character.isAlphabetic(prev)){
                for(int j=0;j<ne-1;j++){
                    result.append(pri);
                }
            }
        } 
        else{
            result.append(ch);
        }
    }
System.out.print(result);
}
    public static void main(String args[]){
        String str="t6hj7ui";
        builtin(str);
    }
}

