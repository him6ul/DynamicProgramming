import java.util.ArrayList;
import java.util.*;



public class CanSum {

    private static Map<Integer, Boolean> resultMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("This is my can sum program..");
        boolean result = canSum(70000, new int[] { 5, 3, 4, 7 });
        System.out.println("Result -> " + result);
    }

    private static boolean canSum(int sum, int[] args) {

        if (resultMap.containsKey(sum)) {
            boolean result = resultMap.get(sum);
            if (result)
                return true;
        }

        if (sum == 0)
            return true;
        if (sum < 0)
            return true;

        for (int key : args) {
            int diff = sum - key;
            boolean result = canSum(diff, args);
            resultMap.put(diff, result);
            if (result)
                return true;
        }
        return false;
    }

    private static boolean canSum0(int sum, int[] args) {
        List<Integer> dataResult = new ArrayList<>();
        canSum1(sum, args, dataResult);
        System.out.println("dataResult -> " + dataResult);
        return dataResult.size() > 0;
    }

    private static void canSum1(int sum, int[] args, List<Integer> dataResult) {

        for (int key : args) {
            int diff = sum - key;
            if (diff == 0) {
                dataResult.add(1);
                return;
            } else if (diff > 0) {
                canSum1(diff, args, dataResult);
            }
        }
    }
}
