public class Automorphic{
	static Boolean isAutomorphic(int n){
		if(n<0){
		n=-n;
}
		int sqr= n*n;
		while(n>0){
			if(n%10 != sqr%10){
				return false;
				
}
		n=n/10;
		sqr=sqr/10;}
		return true;	

}
	 public static void main(String args[]){
		System.out.print(isAutomorphic(6));
}
}