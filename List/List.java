import java.util.LinkedList;
import java.util.Scanner;
 public class List {
    static void example(int k){
        LinkedList <Integer> list=new LinkedList<>();
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(6);
        list.add(10);
        list.add(5);
        list.add(12);
        LinkedList<Integer> rotate=new LinkedList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                rotate.add(list.get(i));
                list.set(i, -1);
            }
        }
        int in=0;
        if(k>rotate.size()){
            k%=rotate.size();
        }
        while(in<k){
            int last=rotate.removeLast(); 
            rotate.addFirst(last);
            in++;
        }
        for(int j=0;j<list.size();j++){
            if(list.get(j)<0){
                list.set(j, rotate.removeFirst());
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//         LinkedList<Integer> list=new LinkedList<>();
//         list.add(4);
//         list.add(2);
//         list.add(4);
//         list.add(9);
//         System.out.println("Enter the value of K:");
//         int k=sc.nextInt();
//         int sum=0;
//         int first_greatest=list.get(0);
//         int sec=0;
//         int count=0;
//         for(int i:list){
//             sum+=i;
//             count++;
//         }
//         for(int i:list){
//             if(i>first_greatest){
//                 first_greatest=i;
//             }
//         }
//         for(int i:list){
//             if(i>sec && i<first_greatest){
//                 sec=i;
//             }
//         }
//         if((sum/count)>sec){
//             Collections.reverse(list);
//             System.out.println(list);
//             Collections.reverse(list);
//         }
//         else{
//              System.out.println(list);
//         }
//         if(!list.contains(k))list.clear();
//         for(int i=0;i<list.size();i++){
//             if(list.get(i)==k){
//                 list.remove(i);
//             }
//         }
//         String s="Better the yesterday";
//         LinkedList<String> list1=new LinkedList<>();
//         int start=0;
        
//         for (int i = 0; i <= s.length(); i++) {
//             if (i == s.length() || s.charAt(i) == ' ') {
//                 list1.add(s.substring(start, i));
//                 start = i + 1;
//             }
// }
//         Collections.reverse(list1);
//         System.out.println(list1);
//         System.out.println(sum);
//         System.out.println(first_greatest);
//         System.out.println(sec);
//         System.out.println(list);
        example(5);
    }
}
