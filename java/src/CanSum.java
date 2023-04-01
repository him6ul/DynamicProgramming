import java.util.ArrayList;
import java.util.*;

public class CanSum {

    private static Map<Integer, Boolean> resultMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("This is my can sum program..");
        int sum = 7000;
        boolean result = canSum(sum, new int[] { 5, 3, 4, 7 });
        System.out.println("Result for sum [" + sum + "] -> " + result);
    }

    private static boolean canSum(int sum, int[] args) {

        if (resultMap.containsKey(sum))
            return resultMap.get(sum);

        if (sum == 0)
            return true;
        if (sum < 0)
            return false;

        for (int key : args) {
            int diff = sum - key;
            boolean result = canSum(diff, args);
            if (result) {
                resultMap.put(sum, result);
                return true;
            }
        }

        resultMap.put(sum, false);
        return false;
    }
}
