public class College {
    static int code=1000;
    String CollegeName;
    College(String CollegeName){
        this.CollegeName=CollegeName;
    }
    void Display(){
        System.out.println("College code:"+code);
        System.out.println("College Name:"+CollegeName); 
        code++;
    }
}

