import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowSum {

    private static Map<Integer, Boolean> resultMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("This is my how sum program..");
        int sum = 7000;
        int[] result = howSum(sum, new int[] { 5, 3, 4, 7 });
        System.out.println("Result for sum [" + sum + "] -> " + Arrays.toString(result));
    }

    private static int[] howSum(int sum, int[] args) {

        if (resultMap.containsKey(sum))
            return resultMap.get(sum);

        if (sum == 0)
            return true;
        if (sum < 0)
            return false;

        for (int key : args) {
            int diff = sum - key;
            boolean result = howSum(diff, args);
            if (result) {
                resultMap.put(sum, result);
                return true;
            }
        }

        resultMap.put(sum, false);
        return false;
    }
}
