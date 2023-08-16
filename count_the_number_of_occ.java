import java.util.*;
import java.io.*;
import java.util.concurrent.*;


public class count_the_number_of_occ{
    public static void main(String[] args) throws IOException {
        //Input Format
        // n -> No. of elements in the array
        // next line contains a list of n integers

        FastIO fio = new FastIO();
        //Reading Integer
        Integer n = fio.readInt();
        //Reading Array
        ArrayList<Integer> a = fio.readArray();

        //Creating map for counting the frequency of elements
        TreeMap<Integer , Integer> freq = new TreeMap<Integer , Integer>();

        for(Integer x : a){
            //Checking wether the key is already present or not
            if(freq.containsKey(x) == true){
                //updating the value(if key present)
                freq.put(x , freq.get(x) + 1);
            }
            else{
                //Inserting new entry in Map if key 'x' is not present
                freq.put(x , 1);
            }
        }

        //Printing Results
        for(Map.Entry e : freq.entrySet())  {
            System.out.print("Element: " + e.getKey() + "    ");
            System.out.println("Frequency: " + e.getValue());
        }
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