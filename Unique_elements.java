import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class Unique_elements{

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