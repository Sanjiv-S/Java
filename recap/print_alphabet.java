public class print_alphabet {
    static void repeat(String input){
        StringBuilder alph =new StringBuilder();
        for(int i=0;i<input.length();){
            char ch=input.charAt(i);
            if(Character.isLetter(ch)){
                i++;
                if(input.charAt(i)=='['){
                    int j=i+1;
                    StringBuilder number =new StringBuilder();
                     while(input.charAt(j)!=']'){
                        number.append(input.charAt(j));
                        j++;
                }
                int count = Integer.parseInt(number.toString());
                alph.append(String.valueOf(ch).repeat(count));
                i=j+1;
                }
               else{
                i++;
               }
            }
             
        }
        System.out.println(alph.toString());
    }
    public static void main(String args[]){
        String input="a[4]b[6]n[3]";
        repeat(input);
    }
}
