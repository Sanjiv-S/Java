public class Patterns{

static void right_angled_triangle(int n){
for(int i=1;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print("*");
}
System.out.println();
}
}

static void Inverted_Right_Angled_Triangle(int n){
for(int i=1;i<=n;i++){
for(int j=n;j>=i;j--){
System.out.print("*");
}
System.out.println();
}
}

static void pyramid(int n){
for(int i=1;i<=n;i++){
for(int j=n;j>i;j--){
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++){
System.out.print("*");
}
System.out.println();
}
}

static void Inverted_Pyramid(int n){
for(int i=n;i>=1;i--){
for(int k=i;k<n;k++){
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
System.out.print("*");
}
System.out.println();
}
}

static void diamond(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

static void Floyd_Triangle(int n){
int count=1;
for(int i=1;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print(count +" ");
count++;
}
System.out.println();
}
}

static void number_pyramid(int n){
for(int i=1;i<=n;i++){
for(int j=n;j>i;j--){
System.out.print(" ");
}
for(int k=0;k<2*i-1;k++){
System.out.print(i);
}
System.out.println();
}
}

static void pascal_triangle(int n){
for(int i=1;i<=n;i++){
for(int j=n;j>i;j--){
System.out.print(" ");
}
int x=1;
for(int k=1;k<=i;k++){
System.out.print(x+" ");
x=x*(i-k)/k;
}
System.out.println();
}
}

static void butterfly_pattern(int n){
for(int i=1;i<=n;i++){
for(int j=0;j<i;j++){
System.out.print("*");
}
for(int j=n;j>i;j--){
if(i==n && j==n){
    System.out.print("*");
}
else{
    System.out.print("  ");
}
}
for(int j=0;j<i;j++){
System.out.print("*");
}
System.out.println();
}


for(int i=1;i<=n;i++){
for(int j=n;j>i;j--){
System.out.print("*");
}
for(int j=0;j<i;j++){
System.out.print("  ");
}
for(int j=n;j>i;j--){
System.out.print("*");
}
System.out.println();
}

}
public static void main(String args[]){
right_angled_triangle(5);
System.out.println();
Inverted_Right_Angled_Triangle(5);
System.out.println();
pyramid(5);
System.out.println();
Inverted_Pyramid(5);
System.out.println();
diamond(4);
System.out.println();
Floyd_Triangle(5);
System.out.println();
number_pyramid(5);
System.out.println();
pascal_triangle(5);
System.out.println();
butterfly_pattern(6);
}
}