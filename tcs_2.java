import java.util.Scanner;
import java.util.ArrayList;
public class tcs_2{

static void greater(int arr[]){
Boolean flag=false;
int count=0;
for(int i=0;i<arr.length;i++){
flag=false;
for(int j=0;j<i;j++){
if(arr[j]<arr[i]){
flag=true;
}
else{
flag=false;
}
}
if(flag==true || i==0){
count++;
}
}
System.out.print(count);
}

static void parkinglot(int arr1[][]){
int count=0;
int max=0;
int index=0;
for(int i=0;i<arr1.length;i++){
for(int j=0;j<arr1[0].length;j++){
if(arr1[i][j]==1){
count++;
}
if(count>max){
max=count;
index=i+1;
}
if(j==arr1[0].length-1){
count=0;
}
}
}
System.out.print(index);
}

static void partycruise(int T,int E[],int L[]){
int max_guest=0;
for(int i=0;i<E.length;i++){
T=T+E[i];
T=T-L[i];
if(T>max_guest){
max_guest=T;
}
}
System.out.print(max_guest);
}

static void candies(int N,int K,int candies_sold,int max_value){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of candies:");
int M= sc.nextInt();
candies_sold+=M;
N=N-M;
if(N<=K){
N=max_value;
}
System.out.println("NUMBER OF CANDIES SOLD :"+candies_sold);
System.out.println("NUMBER OF CANDIES LEFT :"+N);
if(M>N){
System.out.println("INVALID INPUT");
}
else{
candies(N,K,candies_sold,max_value);
}
}

static void washing_machine(){
Scanner sc=new Scanner(System.in);
System.out.print("INPUT WEIGHT:");
int input= sc.nextInt();
int est_time=0;
if(input>=0 && input<=2000){
System.out.println("est_time=25 min");
}
else if(input>=2001 && input<=4000){
System.out.println("est_time=35 min");
}
else if(input>=4001 && input<=7000){
System.out.println("est_time=45 min");
}
else{
System.out.println("OVER LOADED");
}
}

static void painting(){
ArrayList<Float> list=new ArrayList<>();
ArrayList<Float> list1=new ArrayList<>();
float int_sum=0;
float ext_sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of interior walls:");
int interior=sc.nextInt();
System.out.print("Enter the number of exterior walls:");
int exterior=sc.nextInt();
for(int i=0;i<interior;i++){
System.out.print("Enter the surface area of interior walls:");
float input=sc.nextFloat();
list.add(input);
}
for(int i=0;i<exterior;i++){
System.out.print("Enter the surface area of exterior walls:");
float input=sc.nextFloat();
list1.add(input);
}
for(int i=0;i<interior;i++){
int_sum=int_sum+list.get(i);
}
for(int i=0;i<exterior;i++){
ext_sum=ext_sum+list1.get(i);
}
float inter_price=int_sum*18;
float exter_price=ext_sum*12;
float total=inter_price+exter_price;
System.out.print("Total Estimated Cost:"+total+" INR");
}

static void MPCS(){
for(int i=0;i<10;i++){
int input=

public static void main(String args[]){
int arr[]={7,4,8,2,9};
int arr1[][]={{0,1,0},{1,1,0},{1,1,1}};
int E[]={7,0,5,1,3};
int L[]={1,2,1,3,4};
int T=0;
greater(arr);
System.out.println();
parkinglot(arr1);
System.out.println();
partycruise(T,E,L);
System.out.println();
candies(10,5,0,10);
System.out.println();
washing_machine();
System.out.println();
painting();
}
}