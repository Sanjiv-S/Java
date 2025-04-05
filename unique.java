import java.util.ArrayList;
public class unique{
static void unique_val(String str1,String str2){
	char arr1[]=str1.toCharArray();
 	char arr[] =str2.toCharArray();
	int count=0;
	ArrayList<Character> list = new ArrayList<>();
	for(int i=0;i<arr.length;i++){
		if(!list.contains(arr[i])){
			list.add(arr[i]);
		}
	}
	for(int i=0;i<list.size();i++){
		for(int j=0;j<arr1.length;j++){
		if(list.get(i) == arr1[j]){
			count++;
		}
		}
}System.out.print(count);
}
 public static void main(String []args){
	String str1="abczcabdz";
	String str2="acza";
	unique_val(str1,str2);
}
}