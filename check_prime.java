import java.util.Scanner;
public class check_prime{
static void check(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int input = sc.nextInt();
if(input<0){
System.out.print("please enter a positive number");
}
else{
prime(input);
}
}
static void prime(int n){
Boolean flag=true;
for(int i=2;i<=n/2;i++){
if(n%i==0){
flag=false;
}
}
if(flag==false){
System.out.print("its not a prime number");
}
else{
System.out.print("its a prime number");
}
}

static void series(int n){
int even_sum=0;
int odd_sum=0;
for(int i=1;i<=n;i++){
if(i%2==0){
System.out.print(even_sum+" ");
even_sum+=6;
}
else{
System.out.print(odd_sum+" ");
odd_sum+=7;
}
}
}

static void newseries(int n){
int even_sum=0;
int odd_sum=0;
for(int i=1;i<=n;i++){
if(i>2 && i%2==0){
even_sum+=1;
}
else if(i>2 && i%2!=0){
odd_sum+=2;
}
}
if(n%2==0){
System.out.print(even_sum);
}
else{
System.out.print(odd_sum);
}
}
public static void main(String args[]){
check();
System.out.println();
series(15);
System.out.println();
newseries(10);
}
}