public class square_modulas {
    static void square(){
        int n=376;
        int value =n*n;
        int new_value=0;
        int first_value=0;
        int next_value =0;
        int count=0;
        while(n>0){
            int last=value%10;
            first_value=n%10;
            new_value+=last*10;
            next_value+=first_value*10;
            if(new_value ==next_value){
                count++;
            }
            else{
                count--;
                break;
            }
            n/=10;
            value/=10;
        }
        if(count>=1){
            System.out.println("its an Automorphic number");
        }
        else{
            System.out.println("its not an Automorphic number");
        }

    }
    static void new_square(){
        for(int n=1;n<1000;n++){
        int tempN =n;
        int value =n*n;
        int new_value=0;
        int first_value=0;
        int next_value =0;
        int count=0;
        while(value>0){
            int last=value%10;
            first_value=tempN%10;
            new_value+=last*10;
            next_value+=first_value*10;
            if(new_value ==next_value){
                count++;
            }
            else{
                count--;
                break;
            }
            tempN/=10;
            value/=10;
        }
        if(count>1){
            System.out.println(n);
        }
        }
    }
    
    public static void main(String args[]){
        square();
        new_square();
    }
}
