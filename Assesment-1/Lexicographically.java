public class Lexicographically {
    static void check_lexicography(String str,int k){
        String smallest=str.substring(0,k);
        String largest =str.substring(0,k);
        for(int i=0;i<=str.length()-k;i++){
            String Substring = str.substring(i,i+k);
            if(Substring.compareTo(smallest)<0){
                smallest=Substring;
            }
            if(Substring.compareTo(largest)>0){
                largest=Substring;
            }
        }
        System.out.println("The smallest substring is "+smallest);
        System.out.println("The largest substring is "+largest);
    }
    public static void main(String args[]){
        String str="hacker";
        int  k=3;
        check_lexicography(str, k);
    }
}
