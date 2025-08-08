public class conversion {
    static void octal_conversion(){
        double a=345;
        String rem="";
        double quo=a;
        while(quo>0){
            double reminder =quo%8;
            rem=(int)reminder+rem;
            quo =(int)quo/8;
        } 
        System.out.print(rem);
    }
    static void hexadecimal_conversion(){
        double a=345;
        String rem="";
        double quo=a;
        while(quo>0){
            double reminder =quo%16;
            rem=(int)reminder+rem;
            if(rem ==)
            quo =(int)quo/16;
        } 
    }
    
    public static void main(String args[]){
        octal_conversion();
    }
}
