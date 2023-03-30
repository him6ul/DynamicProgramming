import java.util.*;

public class GridTraveller {

    private static Map<String, Long> data = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("This is my Grid Traveller to learning Dynamic Programming..");

        long result = gridTraveller(18, 18);
        System.out.println("Number of ways to travel the grid is " + result);

    }

    private static long gridTraveller(int m, int n) {

        String key = m + "_" + n;

        if (data.containsKey(key))
            return data.get(key);

        if (m == 0 || n == 0)
            return 0;

        if (m == 1 || n == 1)
            return 1;

        long x = gridTraveller(m - 1, n);
        long y = gridTraveller(m, n - 1);

        long z = x + y;
        data.put(key, z);
        return z;
    }

}