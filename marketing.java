import java.util.Scanner;
import java.util.ArrayList;
public class marketing{
static Scanner sc=new Scanner(System.in);
static void commission(){
String name="";

ArrayList<String> list=new ArrayList<>();
int count=0;
System.out.print("Enter the name of the member:");
String parent=sc.nextLine();
System.out.print("does the member has child members Y/N:");
char choice= sc.next().charAt(0);
if(choice=='Y'){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the child members:");
String child= sc.nextLine();
char arr[]=child.toCharArray();
for(int i=0;i<arr.length;i++){
if(arr[i]==','){
list.add(name);
count++;
name="";
}
else if(i==arr.length-1){
name=name+arr[i];
list.add(name);
count++;
name="";
}
else{
name=name+arr[i];
}}
}
int commission_parent=5000/10*count;
int commission_child=5000/5;
System.out.println("Total Members:"+count);
System.out.println("Commision Details:");
System.out.println(parent +": "+commission_parent+" INR");
for(int i=0;i<list.size();i++){
System.out.println(list.get(i)+ ": "+commission_child+" INR");
}
}
public static void main(String args []){
commission();
}
}