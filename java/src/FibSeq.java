

public class FibSeq {
    public static void main(String[] args) {
        System.out.println("This is my Feb Seq for learning Dynamic Programming..");


        int n = 10;
        int an = getNthNumber(n + 2);
        System.out.println(n + "th number in my Feb Seq  -> " + an);

    }

    private static int getNthNumber(int n) {

        if (n == 1 || n == 2)
            return 1;
 
        return getNthNumber(n - 1) + getNthNumber(n - 2);
    }
}