import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {

    private static final int DEFAULT_CHECK_INT = -999;

    private static Map<Integer, List<Integer>> resultMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("This is my how sum program..");
        int sum = 7;

        List<Integer> arrayList = new ArrayList<>();

        howSum(sum, new int[] { 5, 3, 4, 7 }, DEFAULT_CHECK_INT, arrayList);

        System.out.println("Result for sum [" + sum + "] -> " + arrayList);
    }

    private static List<Integer> howSum(int sum, int[] args, int checkInt, List<Integer> arrayList) {

        if (resultMap.containsKey(sum))
            return resultMap.get(sum);

        if (sum == 0 && checkInt != DEFAULT_CHECK_INT) {
            arrayList.add(checkInt);
            return arrayList;
        }
        if (sum < 0)
            return arrayList;

        for (int key : args) {
            int diff = sum - key;

            List<Integer> result = howSum(diff, args, key, arrayList);
            if (result.size() > arrayList.size()) {
                resultMap.put(sum, result);
                return result;
            }
        }

        resultMap.put(sum, arrayList);
        return arrayList;
    }
}
