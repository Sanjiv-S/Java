import java.util.Scanner;
public class vendingmachine{
static void order(){
String c[]={"Espresso Coffee","appuccino Coffee","Latte Coffee"};
String t[]={"Plain Tea","Assam Tea","Ginger Tea","Cardamom Tea","Masala Tea","Lemon Tea","Green Tea","Organic Darjeeling Tea"};
String s[]={"Hot and Sour Soup","Veg Corn Soup","Tomato Soup","Spicy Tomato Soup"};
String b[]={"Hot Chocolate Drink","Badam Drink","Badam-Pista Drink"};
Scanner sc=new Scanner(System.in);
char input = sc.next().charAt(0);
int value=sc.nextInt();
System.out.println("Welcome to CCD!");

if(input=='c'){
System.out.println("Enjoy your "+c[value-1]);
	if(value-1>c.length){
		System.out.println("INVALID INPUT");
}
}
else if(input=='t'){
System.out.println("Enjoy your "+t[value-1]);
	if(value-1>t.length){
		System.out.println("INVALID INPUT");
}
}
else if(input == 's'){
System.out.println("Enjoy your "+s[value-1]);
	if(value-1>s.length){
		System.out.println("INVALID INPUT");
}
}
else if(input =='b'){
System.out.println("Enjoy your "+b[value-1]);
	if(value-1>b.length){
		System.out.println("INVALID INPUT");
}
}
}
public static void main(String args[]){
order();
}
}

