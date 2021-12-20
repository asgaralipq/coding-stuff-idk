import java.io.*;
import java.util.*;
public class MissingNumber {
    public static void main(String args[]){
        FastReader in = new FastReader();

        double n = in.nextDouble();
        double arr = 0;
        double sum = 0;
        for(int i = 0; i <  n - 1; i++){
            arr = in.nextDouble();
            sum += arr;
        }

        double sum1 = n*(n+1)/2;

        System.out.printf("%.0f",sum1-sum);
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
