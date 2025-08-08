import java.util.ArrayList;
public class good_number{

static void isgood(int n){
int temp=n;
int rem=0;
int sum=0;
while(temp>0){
rem=temp%10;
sum+=rem;
temp=temp/10;
}
if(n%sum==0){
System.out.print("Its a good number");
}
else{
System.out.print("Its not a good number");
}
}

static void non_repeating(int arr[]){
int index=0;
ArrayList<Integer> list =new ArrayList<>();
for(int i=0;i<arr.length;i++){
if(!list.contains(arr[i])){
list.add(arr[i]);
}
else{
index=list.indexOf(arr[i]);
list.remove(index);
}
}
System.out.print(list.get(0));
}

static void subset(int a[],int b[]){
int count=0;
for(int i=0;i<b.length;i++){
for(int j=0;j<a.length;j++){
if(b[i]==a[j]){
count++;
}
}
}
if(count==b.length){
System.out.print("true");
}
else{
System.out.print("false");
}
}

static void identify_row(int arr1[][]){
int count=0;
int max=0;
int index=0;
for(int i=0;i<arr1.length;i++){
count=0;
for(int j=0;j<arr1[0].length;j++){
if(arr1[i][j]==1){
count++;
}
}
if(count>max){
max=count;
index=i;
}
}
System.out.print(index);
}

static void rotate_right(int arr2[],int k){
        int arr1[]=new int[arr2.length];
        int count=0;
        for(int i=k;i>0;i--){
            arr1[count]=arr2[arr2.length-i];
            count++;
        }
        for(int j=0;j<arr2.length-k;j++){
            arr1[count]=arr2[j];
            count++;
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }


static void rotate_left(int arr2[],int k){
        int arr1[]=new int [arr2.length];
        int count=0;
        for(int i=k;i<arr2.length;i++){
            arr1[count]=arr2[i];
            count++;
        }
        for(int j=0;j<k;j++){
            arr1[count]=arr2[j];
            count++;
        }
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }


static void symmetric(int n[][]){
    for(int i=0;i<n.length;i++){
	for(int j=0;j<n.length;j++){
	if(n[i][0]==n[j][1]){
		if(n[i][1]==n[j][0]){
			System.out.print(n[i][0]+",");
			System.out.print(n[i][1]);
			System.out.println();
		}
	}
}
}
}


static void equilibrium_index(int arr3[]){
int n=arr3.length/2;
int left_sum=0;
int right_sum=0;
for(int k=0;k<arr3.length;k++){
for(int i=0;i<k;i++){
left_sum+=arr3[i];
}
for(int j=k+1;j<arr3.length;j++){
right_sum+=arr3[j];
}
if(left_sum==right_sum){
System.out.print(k);
break;
}
else{ 
left_sum=0;
right_sum=0;}
}
if(left_sum==0 && right_sum==0){
System.out.print("-1");
}
}


static void chocolate_factory(int arr4[]){
int new_arr[] =new int[arr4.length];
int count=0;
for(int i=0;i<arr4.length;i++){
if(arr4[i]>0){
new_arr[count]=arr4[i];
count++;
}
}
for(int i:new_arr){
System.out.print(i+" ");
}
}

 
static void vechile_manufacture(int v,int w){
int f=0;
int t=0;int flag=0;
for(int i=0;i<v/2;i++){
w=w-4;
t=w/2;
f++;
if(f+t==v){
System.out.print(t+","+f);
flag=1;
}
}
if(flag==0){
System.out.print("-1");
}

}

public static void main(String args[]){
int arr[]={9, 4, 9, 6, 7, 4};
int a[] = {10, 5, 2, 23, 19};
int b[] = {19, 5, 3};
int arr1[][]={{0,1,0,0},{1,1,0,0},{0,1,0,1},{1,1,1,1}};
int arr2[] = {1, 2, 3, 4, 5, 6};
int arr3[] = {1, 2, 0, 3};
int arr4[]={6,0,1,8,0,2};
int n[][] = {{11,20},{30, 40}, {5, 10}, {40, 30}, {10, 5}};
int k = 2;
int v=15;
int w=34;
isgood(19);
System.out.println();
non_repeating(arr);
System.out.println();
subset(a,b);
System.out.println();
identify_row(arr1);
System.out.println();
rotate_right(arr2,k);
System.out.println();
rotate_left(arr2,k);
System.out.println();
symmetric(n);
System.out.println();
equilibrium_index(arr3);
System.out.println();
chocolate_factory(arr4);
System.out.println();
vechile_manufacture(v,w);
}
}