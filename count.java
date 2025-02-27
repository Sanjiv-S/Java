public class count {
    
    static void calc_count(){
        int n=97;
        int count=1;
        while(n/10!=0){
            n=n/10;
            count++;
        }
        System.out.print(count);
    }
public static void main(String args[]){
    calc_count();
}
}
