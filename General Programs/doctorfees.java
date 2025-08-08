import java.util.Scanner;
public class doctorfees{
static void patients(){
Scanner sc=new Scanner(System.in);
int fees=0;
int count=0;;
int age=0;
int patient_arr[]=new int[20];
System.out.print("Enter the Age of the patients:");
while(true){
String input= sc.nextLine();
age = (int)input;
if(input.isEmpty()){
break;
}
else{
patient_arr[count]=age;
count++;
}
}

for(int i=0;i<patient_arr.length;i++){
if(patient_arr[i]<17){
fees+=200;
}
else if(patient_arr[i]>=17 && patient_arr[i]<40){
fees+=400;
}
else if(patient_arr[i]>=40){
fees+=300;
}
}
System.out.print("TOTAL INCOME:"+fees+" INR");
}

public static void main(String args[]){
patients();
}
}
