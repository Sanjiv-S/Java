public class tcs_3{
static void getfare(int path[],String busstop[],String Source,String Destination){
int str_index=-1;
for (int i = 0; i < busstop.length; i++) {
if (busstop[i].equals(Source)) {
str_index = i;
break;
}
}
int end_index=-1;
for (int i = 0; i < busstop.length; i++) {
if (busstop[i].equals(Destination)) {
end_index = i;
break;
}
}
int sum=0;
double fare=0;
double first_sum=0;
double second_sum=0;
double first=0;
int total=0;
double rem=0;
if(str_index<end_index){
for(int i=str_index+1;i<=end_index;i++){
sum=path[i]+sum;
}
first=(sum/1000)*5;
rem=(sum%1000)*0.005;
fare=first+rem;
}
else{
for(int i=str_index+1;i<busstop.length;i++){
first_sum=path[i]+first_sum;
}
for(int j=0;j<=end_index;j++){
second_sum=path[j]+second_sum;
}
total=(int)first_sum+(int)second_sum;
first=(double)(total/1000)*5;
rem=(double)(total%1000)*0.005;
fare=first+rem;
}
System.out.print(fare);
}

public static void main(String args[]){
int path[]={800, 600, 750, 900, 1400, 1200, 1100, 1500};
String busstop[]={"TH", "GA", "IC", "HA", "TE", "LU", "NI","CA" };
String Source="NI";
String Destination="HA";
getfare(path,busstop,Source,Destination);
}
}