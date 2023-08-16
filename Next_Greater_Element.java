import java.util.*;
import java.io.*;

public class Next_Greater_Element{
    public static void main(String[] args)throws IOException{
        //Input Format
        // n -> No. of elements in the array
        // next line contains a list of n integers
        
        FastIO fio = new FastIO();
        //Reading Integer
        Integer n = fio.readInt();
        //Reading Array
        ArrayList<Integer> a = fio.readArray();

        Stack<Integer> s = new Stack<>();

        ArrayList<Integer> ans = new ArrayList<>(n);

        for(int i = 0;i < n;++i){
            ans.add(-1);
        }

        for(int i = 0;i < a.size();++i){
            while(s.empty() == false && a.get(i) > a.get(s.peek())){
                ans.set(s.peek() , i);
                s.pop();
            }
            s.push(i);
            
        }

        //-1 indicates that there is no next element that is greater than the current element
        //0 based indexing is
        //Prints the index of the element that is greater than it
        System.out.println(ans);

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