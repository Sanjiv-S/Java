public class Decimal_conversion{
	static void convert(int n){
	int arr[] = new int[100];
	int i=0;
	while(n>0){
	arr[i]=n%2;
	n=n/2;
	i++;
	}	
for(int j=i-1;j>=0;j--){
	System.out.print(arr[j]);
}
}
	static int gcd(int a ,int b){
		if(b==0){
			return a;
		}
		else{
			return gcd(b,a%b);
}
	}
	
	static void lcm(int a,int b){
	int gcd1=gcd(a,b);
	int lcm=a*b/gcd1;
	System.out.print(lcm);
}
	static void amstrong(int n){
		int temp=n;
		int org=n;
		int count=0;
		int rem=0;
		int sum=0;
		while(temp>0){
			temp=temp/10;
			count++;
}
		for(int i=0;i<count;i++){
			rem=n%10;
			sum =(int) Math.pow(rem,count)+sum;
			n=n/10;
}
		if(sum == org){
			System.out.print("amstrong");
}
		else{
			System.out.print("not amstrong");
}
}
	static void dec_to_octal(int n){
		int arr[]=new int[100];
		int i=0;
		while(n!=0){
		arr[i]=n%8;
		n=n/8;
		i++;
}
		for(int j=i-1;j>=0;j--){
		System.out.print(arr[j]);
}
}
	static void perfectnumber(int n){
	int sum=0;
	for(int i=1;i<=n/2;i++){
		if(n%i==0)
			sum+=i;
}
System.out.println(n+(sum==n?" is a perfect number":" is not a perfect number"));
}
	static void harshadnumber(int n){
		int sumofdigits=0;	
		int temp=0;
		int org=n;
		while(n>0){
			temp =n%10;
			sumofdigits+=temp;
			n=n/10;
}		if(org % sumofdigits ==0){
			System.out.print("harshad number");
}
		else{
			System.out.print("not a harshad number");
}
}
	public static void main(String args[]){
		convert(33);
		System.out.println();
		System.out.print(gcd(36,18));
		System.out.println();
		lcm(30,14);
		System.out.println();
		amstrong(153);
		System.out.println();
		dec_to_octal(33);
		System.out.println();
		perfectnumber(28);
		System.out.println();
		harshadnumber(15);
}
}
