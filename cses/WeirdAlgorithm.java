import java.io.*;
import java.util.*;

public class WeirdAlgorithm{
    public static void main(String args[]){
        FastReader sc = new FastReader();
        
        long n = sc.nextLong();
        System.out.print(n+" ");
        while(n != 1){
            if((n&1) == 0){
                n = n / 2;
            }else{
                n = n*3 + 1;
            }
            System.out.print(n+" ");
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}