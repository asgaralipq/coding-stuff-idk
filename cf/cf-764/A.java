import java.io.*;
import java.util.*;
public class A {
    public static void main(String args[]){
        FastReader in = new FastReader();

        int t = in.nextInt();
        while(t-- > 0){
            long n = in.nextLong();
            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;
            for(int i = 0; i < n; i++){
                long arr = in.nextLong();
                if(arr < min)
                    min = arr;
                if(arr > max)
                    max = arr;
            }
            System.out.println(max - min);
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
