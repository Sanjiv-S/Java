import java.util.*;
public class find_possible_ways {
    public static int minmoves(long h, long w, long h1, long w1){
        int count= 0;

        while(h>h1){
            count++;
            h = (h+1)/2;
        }
        while(w>w1){
            count++;
            w = (w+1)/2;
        }
        return count;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       
            
        }
    }

