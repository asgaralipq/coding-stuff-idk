import java.io.*;
import java.util.*;

public class B {
    public static void main(String args[]){
        FastReader in = new FastReader();

        int t = in.nextInt();
        while(t-- > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();

            if(a == b && b == c){
                System.out.println("YES");
            }else{

                long secLargest = Long.MIN_VALUE;
                long thirdLargest = Long.MIN_VALUE;
                long largest = Math.max(a,(Math.max(b,c)));

                if(largest == a){
                    secLargest = Math.max(b, c);
                    thirdLargest = Math.min(b, c);
                }else if(largest == b){
                    secLargest = Math.max(a, c);
                    thirdLargest = Math.min(a, c);
                }else{
                    secLargest = Math.max(a, b);
                    thirdLargest = Math.min(a, b);
                }


                System.out.println(largest+" "+secLargest+" "+thirdLargest);


                if(thirdLargest == a){
                    a *= (largest - secLargest)/a;
                }else if(thirdLargest == b){
                    b *= (largest - secLargest)/b;
                }else{
                    c *= (largest - secLargest)/c;
                }


                System.out.println(a+" "+b+" "+c);


                if(Math.abs(a - b) == Math.abs(b - c))
                    System.out.println("YES");
                else
                    System.out.println("NO");

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
