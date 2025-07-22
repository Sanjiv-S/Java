import java.util.Scanner;
public class mark {
    static int [] input_marks(Scanner sc){
        int marks[]=new int[5];
        String subject[]={"DBMS","JAVA","PYTHON","DSA","DEVOPS"};
        System.out.println("Enter each Subject Marks");
        for(int i=0;i<marks.length;i++){
            System.out.print(subject[i]+ " :");
            marks[i] =sc.nextInt();
        }
        return marks;
    }
    static char[] calculate_grade(Scanner sc,int marks[],int total_avg){
        char [] grade=new char[5];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>=85 && marks[i]<=100){
                grade[i]='A';
            }
            else if(marks[i]>=65 && marks[i]<=84){
                grade[i]='B';
            }
            else if(marks[i]>=50 && marks[i]<=64){
                grade[i]='C';
            }
            else{
                grade[i]='F';
            }
        }
        return grade;
    }
    static int avg_mar(int marks[]){
        int total_avg=0;
        for(int i=0;i<marks.length;i++){
            total_avg=marks[i]+total_avg;
        }
        return total_avg;
    }
    static void print_result(Scanner sc){
        int marks[]=input_marks(sc);
        int total_avg=avg_mar(marks);
        char grades[]=calculate_grade(sc, marks, total_avg);
        System.out.println(grades);
        System.out.println(total_avg+" ");
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the student Name:");
        String name= sc.nextLine();
        System.out.print("Enter thr Rollnumber:");
        int Rollnum=sc.nextInt();
        System.out.println("");
        
        print_result(sc);
        
    }
}
