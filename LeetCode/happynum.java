import java.util.HashSet;
public class happynum {
    HashSet<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
        
        int value=calc(n);
        
        if(set.contains(value)){
            return false;
        }
        if(value==1){
            return true;
        }
        set.add(value);
            
        return isHappy(value);
    }
    static int calc(int n){
        int sum=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            sum+=(int)Math.pow(rem,2);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        happynum obj=new happynum();
        System.out.println(obj.isHappy(19));
        System.out.println(obj.set);
        
    }
}
