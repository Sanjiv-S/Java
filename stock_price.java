public class stock_price {
    static void buysell(int prices[]){
        int max=0;
        int value=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    value=prices[j]-prices[i];
                    if(value>max){
                        max=value;
                    }
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        int prices[]={2,4,1};
        buysell(prices);
    }
}
