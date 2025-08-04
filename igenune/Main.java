public class Main {
    public static void main(String[] args) {
        // Owner detail = new Owner(
        //     "Four Wheeler",      
        //     "BMW",            
        //     "X5",            
        //     "Diesel",           
        //     "Automatic",       
        //     4,                  
        //     "Sanjiv",          
        //     "9876543210",        
        //     "TN123456"          
        // );
        // detail.fuelType();
        // detail.Display(); 

        Borrowed_Book details=new Borrowed_Book("The Death Note","Yagami","Horror","Sanjiv","30/9/2025");
        Borrowed_Book arr[] =new Borrowed_Book[3];
        arr[0]=new Borrowed_Book("god of war","kratos","Action","Sanjiv","30/9/2025");
        arr[1]=new Borrowed_Book("The Death Note","Yagami","Horror","Sanjiv","30/9/2025");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                arr[i].display();
            }
            System.err.println("");
        }
        
        ITEM value[]=new ITEM[2];
        value[0]=new BOOK("thunder","Sanjiv","Action");
        value[0].display();

        borrowable.instruction();


    }
}
