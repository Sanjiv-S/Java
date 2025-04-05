public class hexadecimal{
static void convert(int n){
int remainder=0;
String hex=" ";
char arr[]={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
while(n>0){
remainder=n%16;
hex=arr[remainder-1]+hex;
n=n/16;
}
System.out.print(hex);
}

static int  octaltodecimal(int n){
int decimal=0;
int base=1;
int octal=n;
while(octal>0){
decimal+=(octal%10)*base;
octal/=10;
base*=8;
}
return decimal;
}

static String decimaltooctal(int sum){
String rem=" ";
while(sum>0){
rem=sum%8+rem;
sum/=8;
}
return rem;
}
static void octal_addition(int a ,int b){
int value1=octaltodecimal(a);
int value2=octaltodecimal(b);
//System.out.println(value1);
//System.out.println(value2);
int sum=value1+value2;
System.out.println(decimaltooctal(sum));
}

public static void main(String[] args){
convert(17);
octal_addition(1234,5670);
System.out.println(decimaltooctal(18));
}
}
