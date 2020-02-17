import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrayList{

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrl = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int size = sc.nextInt();
            arrl.add(new ArrayList<Integer>());
            for(int j=0;j<size;j++){
                int temp = sc.nextInt();
                arrl.get(i).add(temp);
            }
            
        }
        int size_new = sc.nextInt();
        for(int k=0;k<size_new;k++){
            int f = sc.nextInt();
            int s = sc.nextInt();
            try{
            if(arrl.get(f-1).get(s-1) != null){
                System.out.println(arrl.get(f-1).get(s-1));
            }}
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

