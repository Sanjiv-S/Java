public class pallindrom {
    static void Stringbuilder_builtin(String str){
        String rev =new StringBuilder(str).reverse().toString();
        if(rev.equals(str)){
            System.out.println("its a pallindrom");
        }
        else{
            System.out.println("its not a pallindrom");
        }
        String substring1 =rev.substring(0,4);
        System.out.println(substring1);
    }
    static void without_builtin(String str){
        char arr[]=new char[str.length()];
        arr=str.toCharArray();
        char newArray[]=new char[str.length()];
        int count=0;
        int new_count=0;
        for(int i=str.length()-1;i>=0;i--){
           newArray[count]=arr[i];
           count++;
        }
        for(int j=0;j<str.length();j++){
            if(arr[j]==newArray[j]){
                new_count++;
        }}
        if(new_count==str.length()){
            System.out.println("its a pallindrom");
        }
        else{
            System.out.println("its not a pallindrom");
        }
       
    }
    static void buffer_builtin(String str){
        String rev =new StringBuilder(str).reverse().toString();
        if(rev.equals(str)){
            System.out.println("its a pallindrom");
        }
        else{
            System.out.println("its not a pallindrom");
        }
        String substring1 =rev.substring(0,4);
        System.out.println(substring1);
    }
    public static void main(String[] args) {
        String str="racecar";
        Stringbuilder_builtin(str);
        without_builtin(str);
        buffer_builtin(str);
    }
}
