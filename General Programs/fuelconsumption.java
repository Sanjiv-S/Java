import java.util.Scanner;
import java.util.ArrayList;
public class fuelconsumption{

static void findvalue(){
double value=0;
double value1=0;
Scanner sc=new Scanner(System.in);
double fuel=sc.nextDouble();
double distance=sc.nextDouble();
if(fuel<0 || distance<0){
System.out.print("INVALID INPUT");
}
else{
value=(fuel/distance)*100;
double fuel1=fuel*0.2642;
double distance1=distance*0.6214;
value1=(distance1/fuel1);
System.out.printf("Liters/100KM:%.2f%n",value);
System.out.printf("Miles/gallons: %.2f%n",value1);
}
}
static void billdetails(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of pizza bought:");
int pizza=sc.nextInt();
System.out.print("Enter the number of puffs bought:");
int puffs=sc.nextInt();
System.out.print("Enter the number of cool drinks bought:");
int drinks=sc.nextInt();
System.out.println();
System.out.println("Bill Details");
System.out.println("No of Pizzas:"+pizza);
System.out.println("No of puffs:"+puffs);
System.out.println("No of cooldrinks:"+drinks);
int total=pizza*100+puffs*20+drinks*10;
System.out.println("Total Price: "+total);
System.out.println("ENJOY THE SHOW!!!");
}

static void repeat(String s){
char arr[]=s.toCharArray();
ArrayList<Character> list=new ArrayList<>();
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]==arr[j]){
if(!list.contains(arr[i])){
list.add(arr[i]);
}
}
}
}
for(int i=0;i<list.size();i++){
System.out.print(list.get(i));
}
}


public static void main(String args[]){
String s="abcccdefghaabc";
//findvalue();
//billdetails();
repeat(s);
}
}