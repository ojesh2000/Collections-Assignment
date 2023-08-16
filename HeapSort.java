import java.util.*;
import java.io.*;

class Reverse implements Comparator<Integer>{
    @Override public int compare(Integer up , Integer down){
        if(up > down)return -1;
        if(up < down)return 1;
        return 0;
    }
}

public class HeapSort{
    public static void main(String[] args)throws IOException{
        //Input Format
        // n -> No. of elements in the array
        // next line contains a list of n integers
        
        FastIO fio = new FastIO();
        //Reading Integer
        Integer n = fio.readInt();
        //Reading Array
        ArrayList<Integer> a = fio.readArray();


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(Integer x : a){
            pq.add(x);
        }

        System.out.println("Sorted Order");
        for(Integer x : a){
            System.out.print(pq.poll());
            System.out.print(" ");
        }
        System.out.println();

        PriorityQueue<Integer> max_pq = new PriorityQueue<>(new Reverse());
        for(Integer x : a){
            max_pq.add(x);
        }

        System.out.println("Reverse Order");
        for(Integer x : a){
            System.out.print(max_pq.poll());
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