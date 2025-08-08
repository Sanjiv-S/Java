import java.util.Scanner;
import java.util.ArrayList;
public class cognizant{

static void magicboard(){
Scanner sc=new Scanner(System.in);
int arr[]=new int [4];
char arr1[]=new char[4];
System.out.println("Enter the digits:");
for(int i=0;i<4;i++){
int input=sc.nextInt();
char Character=(char)input;
arr1[i]=Character;
arr[i]=input;
}
System.out.println("Output:");
for(int j=0;j<arr.length;j++){
System.out.println(arr[j]+"-"+arr1[j]);
}
}

static void FOE(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of students placed in CSE:");
int cse=sc.nextInt();
System.out.println("Enter the no of students placed in ECE:");
int ece=sc.nextInt();
System.out.println("Enter the no of students placed in MECH:");
int mech=sc.nextInt();
if(cse==0 && ece==0 && mech==0){
System.out.print("None of the department has the highest placement");
}
else if(cse<0 || ece<0 || mech<0){
System.out.print("INVALID INPUT");
}
else{
if(cse>=ece && cse>=mech){
System.out.print("Highest palcement:");
System.out.println("CSE");
	if(cse==ece){
		System.out.println("ECE");
}
if(cse==mech){
		System.out.println("MECH");
}
}
else if(ece>=cse && ece>=mech){
System.out.print("Highest palcement:");
System.out.println("ECE");
if(cse==ece){
		System.out.println("CSE");
}
if(ece==mech){
		System.out.println("MECH");
}
}
else if(mech>=cse && mech>=ece){
System.out.print("Highest palcement:");
System.out.println("MECH");
if(mech==ece){
		System.out.println("ECE");
}
if(cse==mech){
		System.out.println("CSE");
}
}
}}
static void theater(){
Scanner sc=new Scanner(System.in);
int amount=0;
System.out.print("Enter the no of tickets:");
int tickets=sc.nextInt();
System.out.print("Do you want refreshment:");
char refreshment=sc.next().charAt(0);
System.out.print("Do you have coupon code:");
char coupon=sc.next().charAt(0);
System.out.print("Enter the circle:");
char circle =sc.next().charAt(0);
if(tickets>=5 && tickets<=40){
	if(circle=='k'){
		if(refreshment=='y'){
			if(coupon=='y'){
				amount=75*tickets+(50*tickets);
				amount=amount-(amount%2)-(amount%10);
				}
			else{
				amount=75*tickets+(50*tickets);
				amount=amount-(amount%10);
				}
}
		else{
			if(coupon=='y'){
				amount=75*tickets;
				amount=amount-((amount%2)+(amount%10));
				}
			else{
				amount=75*tickets;
				amount=amount-(amount%2);
				}
		}
}
	else if(circle=='q'){
		
		if(refreshment=='y'){
			if(coupon=='y'){
				amount=150*tickets+(150*tickets);
				amount=amount-((amount%2)+(amount%10));
				}
			else{
				amount=150*tickets+(150*tickets);
				amount=amount-(amount%10);
				}
}
		else{
			if(coupon=='y'){
				amount=150*tickets;
				amount=amount-((amount%2)+(amount%10));
				}
			else{
				amount=150*tickets;
				amount=amount-(amount%2);
				}
		}
}
}
System.out.print("Ticket cost:"+amount);
}

static void season(){
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
if(month>=3 && month<=5){
System.out.print("Season:Spring");
}
else if(month>=6 && month<=8){
System.out.print("Season:Summer");
}
else if(month>=9 && month<=11){
System.out.print("Season:Autumn");
}
else if(month==12 || (month<=2 && month>0))
{
System.out.print("Season:Winter");
}
else{
System.out.print("INVALID INPUT");
}
}

static void findprime(int a, int b){
int count=0;
if(a>b || (a-b)==0){
System.out.print("Provide valid input");
}
while(a<b){
count=0;
for(int i=2;i<=a/2;i++)
if(a%i==0){
	count++;
}
if(count==0){
	System.out.print(a+" ");
}
a++;
}
}

static void palindrome(int a){
int count=0;
int temp=a;
int org=a;
int val=0;
while(a>0){
a=a/10;
count++;
}
for(int i=1;i<=count;i++){
val=temp%10*(int)Math.pow(10,count-i)+val;
temp=temp/10;
}
if(val==org){
System.out.print("Palindrome");
}
else{
System.out.print("Not a Palindrome");
}
}

static void increment(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Salary:");
int salary=sc.nextInt();
System.out.print("Enter the Salary appraisal:");
double appraisal=sc.nextDouble();
if(appraisal>5 || appraisal<=0 || salary<0){
System.out.print("Invalid Input");
}
else{
if(appraisal>=1 && appraisal<=3){
salary=salary+(salary/10);
}
else if(appraisal>=3.1 && appraisal<=4){
salary=salary+(salary*25/100);
}
else if(appraisal>=4.1 && appraisal<=5){
salary=salary+(salary*30/100);
}
System.out.print(salary);
}
}

static void iihm(){
Scanner sc=new Scanner(System.in);
ArrayList<String> list=new ArrayList<>();
System.out.print("Enter no of course");
int num=sc.nextInt();
for(int i=0;i<=num;i++){
String input=sc.nextLine();
list.add(input);
}
System.out.print("Enter the course to be searched:");
String search=sc.nextLine();
if(list.contains(search)){
System.out.print(search+" is Available");
}
else{
System.out.print(search+" is  NotnAvailable");
}
}

public static void main(String args[]){
//magicboard();
//FOE();
//theater();
//season();
//findprime(2,15);
//palindrome(6186);
//increment();
iihm();
}
}