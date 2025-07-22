// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class juspay {
//     static void findstar(String s,int n,int startind[],int endind[]){
//         char arr[]=s.toCharArray();
//         ArrayList<Integer> list=new ArrayList<>();
//         int val=0;
//         int result[]=new int[n];
//         for(int j=0;val < n; val++) {
//         for(int i=startind[val];i<=endind[val];i++){
//             if(arr[i]=='|'){
//                 list.add(i);
//             }
//         }
//     }
//     for(int i=0;i<list.size()-1;i++){
//        result[val]=(list.get(i+1)-list.get(i))-1;
//        val++;
//     }
//     for(int x:list){
//        System.out.print(list.get(x));
//    }
//     System.out.println(list.size());
// }


//     static char[] findpower(int initial,String power){
//         char arr[]=power.toCharArray();
//         char temp;
//         for(int j=0;j<arr.length;j++){
//             for(int i=j+1;i<arr.length;i++){
//                 if(arr[j]>arr[i]){
//                     temp= arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//         }
//     }
//         return arr;
//     }
//     static int loop(int initial,String power){
//         int sum1=maxpower(power,initial);
//         char arr[]=findpower(initial, power);
//         int count=1;
//         int finalpower=0;
//         if(sum1>arr[initial-1]){
//             count++;
//             loop(initial, power);
//         }
//         else{
//             for(int i=(initial-1)-count;i<initial-1;i++){
//                 finalpower+=finalpower;
//             }
//         }
//         return finalpower;
//     }
//         static int maxpower(String arr,int initial){
//             char arr1[]=findpower(initial, arr);
//             int sum=0;
//             for(int i=0;i<initial-1;i++){
//                 sum+=arr1[i];
//             }
//             return sum;
//         }




//     public static void main(String args[]){
//         int startind[]={0,0};
//         int endind[]={4,5};
//         String s="|**|*|";
//         int n=2;
//         int initial=6;
//         String power="093212";
//         //findstar(s, n, startind, endind);
        
//         System.out.print(loop(initial, power));
//     }


static void findpower(int initial,String powers){
    char arr[]=powers.toCharArray();
    char temp;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
    }
    int sum=0;
    int max=arr.length-1;
    for(int i=0;i<arr.length;i++){
        sum+=arr[i]-'0';
    }
    
    int stephan=arr[max]-'0';
    System.out.println(stephan);
    sum=sum-stephan;
    for(int i=0;i<arr.length;i++){
        if(sum>stephan){
            max--;
            stephan+=arr[max]-'0';
            sum= sum-arr[max]-'0';
    }
        else{
            System.out.println(sum);
            System.out.println(stephan);
            break;
    }
    }
   
}

static void findduplicate(int email[],int n){
    HashMap<Integer,Integer> map=new HashMap<>();
    int totalduplicate=0;
    for (int i=0;i<email.length;i++){
        if (map.get(email[i])==null) {
            map.put(email[i],1);
        }               
        else{
            map.put(email[i],map.get(email[i])+1);
        } 
        }
    for (Map.Entry<Integer, Integer> e : map.entrySet()){
        if(e.getValue()>1){
            totalduplicate += e.getValue()-1;
        }
    }
        
    System.out.println(map);
    System.out.println(totalduplicate);
}

static void lexicographic(String idgen){
    ArrayList<String> list =new ArrayList<>();
    StringBuilder sb =new StringBuilder(idgen);
    for(int i=0;i<idgen.length();i++){
        list.add(sb.substring(i));
        for(int j=i+1;j<idgen.length();j++){
            list.add(sb.substring(i, j));
        }
    }
    Collections.sort(list);
    int last=list.size();
    System.out.println(list.get(last-1));
    System.out.println(list);
}

static void minimumbalance(int numsteps,int outcomes[]){
    int min_balance=0;
    int value=0;
    for(int i=0;i<numsteps;i++){
        value+=outcomes[i];
        if(value<min_balance){
            min_balance=value;
        }
    }
    System.out.println(min_balance);
}
public static void main(String args[]){
    int initial=6;
    int n=6;
    int email[]={1,3,3,4,4,4,4,3,3};
    int numsteps=4;
    int outcomes[]={2,-9,15,2};
    String idgen="abdc";
    String powers="09765421";
    findpower(initial,powers);
    findduplicate(email, n);
    lexicographic(idgen);
    minimumbalance(numsteps,outcomes);
}
}
