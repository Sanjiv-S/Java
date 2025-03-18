public class repeating_substring {
        public static void main(String args[]) {
            String s="bwf";
            char arr[]=s.toCharArray();
            int n=arr.length;
            int count=0;
            for(int i=count;i<n;i++){
                if(arr[i]==' ' || arr.length==1){
                    count=1;
                    break;
                }
                for(int j=1;j<n;j++){
                    
                        if(arr[i]==arr[j]){
                            if(j>count){
                                if(i>0){
                                    count=j-(count-1);
                                }
                                else{
                                    count=j-count;
                                }
                            }
                            break;
                        }
                    }
                }
                System.out.println(count);
            }
           
        }
    

