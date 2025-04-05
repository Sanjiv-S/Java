public class matrix_ones{
static void matrix(int arr[][]){
int sum=0;
int temp=0;
int arr1[]=new int[arr.length];
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
	sum=arr[i][j]+sum;
}
arr1[i]=sum;
}
for(int i=0;i<arr1.length;i++){
if(arr1[i]>arr1[i+1]){
temp=arr1[i+1];
arr1[i+1]=arr1[i];
arr1[i]=temp;
}
}
System.out.print(arr1[0]);
}

public static void main(String args[]){
int arr[][]={{1, 1, 1, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 1, 1, 1}};
matrix(arr);
}
}

