// public class reverse_sentance {
//     static void Sentence(String str){
//         String rev =new StringBuilder(str).reverse().toString();
//         char arr[]=new char[str.length()];
//         arr=str.toCharArray();
//         int index[]=new int [5];
//         int count=0;
//         int value=0;
//         for(int i=0;i<str.length();i++){
//             if(Character.isAlphabetic(arr[i])){
//                 value++;
//                 if(arr[i+1]==' '){
//                     index[count]=value;
//                     value=0;
//                     count++;
//                 }
//             }
//         }
//         for(int i=0;i<str.length();i++){
//             if(arr[i]==' '){
//                 continue;
//             }
//             else{
//                 System.out.print(arr[i]);
//             }
//         }

//         for(int i:index){
//             System.out.print(i);
//         }
//     }
   
//     public static void main(String[] args) {
//         String str="   I    like  Gaming ";
//         Sentence(str);
//     }
// }
public class ReverseSentence {
    static void Sentence(String str){
        String[] words = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            result.append(" ").append(words[i]);
        }
        
        System.out.print(result.toString());
    }    public static void main(String[] args) {
        String str = "   I    like  Gaming ";
        Sentence(str);
    }
}
