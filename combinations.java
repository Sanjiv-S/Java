public class combinations {
    static void first(int candidates[],int target,int n,int sum,int val){
        System.out.print("candidates:");
        for(int i=0;i<n;i++){
            sum=candidates[i]+sum;
            if(sum<target){
                System.out.print(candidates[i]+" ");
            }
            else if(sum>target){
                val=target-(sum-candidates[i]);
                System.out.print(val);
                break;
            }
        }
    }
    static void second(int candidates[],int target, int n, int sum,int val){
        System.out.print("candidates:");
        for(int i=0;i<n;i++){
            if(candidates[i]==target){
                System.out.print(candidates[i]);
            }
    }}
    static void third(int candidates[],int target, int n, int sum,int val){
        System.out.print("candidates:");
        for(int i=0;i<n;i++){
            if(candidates[i]!=target && target%candidates[i]==0){
                while(sum!=target){
                    System.out.print(candidates[i]);
                    sum=candidates[i]+sum;
                }
            }
    }
    }
        public static void main(String args[]){
            int sum=0;
            int candidates[] = {2};
            int target=1;
            int n = candidates.length;
            int val=0;
            first(candidates, target, n, sum, val);
            System.out.println();
            second(candidates, target, n, sum, val);
            System.out.println();
            third(candidates, target, n, sum, val);
        }
    }
    
    


