import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class Unique_elements{
    public static void main(String[] args) throws IOException{
        //Input Format
        // n -> No. of elements in the array
        // next line contains a list of n integers
        
        FastIO fio = new FastIO();
        //Reading Integer
        Integer n = fio.readInt();
        //Reading Array
        ArrayList<Integer> a = fio.readArray();

        TreeSet<Integer> s = new TreeSet<>();

        //Putting elements in a BST(repitions not allowed)
        for(Integer x : a){
            s.add(x);
        }
        
        //Printing results
        System.out.println("The Unique Elements are: ");
        for(Integer x : s){
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
}


class FastIO{
    BufferedReader bfr;

    public FastIO()throws IOException{
        bfr = new BufferedReader(new InputStreamReader(System.in));
    }

    public Integer readInt() throws IOException{
        return Integer.parseInt(bfr.readLine());
    }

    public ArrayList<Integer> readArray() throws IOException{
        String s = bfr.readLine();
        String[] nos = s.trim().split("\\s+");
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for(String ss : nos){
            ret.add(Integer.parseInt(ss));
        }
        return ret;
    }
}