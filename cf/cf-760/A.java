import java.io.*;
import java.util.*;
public class A {
    public static void main(String args[]){
        FastReader in = new FastReader();

        int t = in.nextInt();
        while(t-- > 0){
            long[] arr = new long[7];
            for(int i = 0; i < 7; i++){
                arr[i] = in.nextLong();
            }
            long max = arr[6];
            int n = 6;
            int i = 0;
            while(i < 6){
                if((arr[i] + arr[i+1] + arr[n]) < max){
                    i++;
                }else if((arr[i] + arr[i+1] + arr[n]) > max){
                    n--;
                }else if((arr[i] + arr[i+1] + arr[n]) == max){
                    System.out.println(arr[i] + " " + arr[i+1] + " " + arr[n]);
                    break;
                }
            }
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
