import java.util.*;

public class FibSeq {

    private static Map<Integer, Long> data = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("This is my Feb Seq for learning Dynamic Programming..");

        int n = 500;
        long an = getNthNumber(n);
        System.out.println(n + "th number in my Feb Seq  -> " + an);

    }

    private static long getNthNumber(int n) {

        if (data.containsKey(n))
            return data.get(n);

        if (n == 1 || n == 2)
            return 1;

        long x = getNthNumber(n - 1);
        long y = getNthNumber(n - 2);

        long z = x + y;
        data.put(n, z);
        return z;
    }
}