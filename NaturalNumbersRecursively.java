public class NaturalNumbersRecursively {

    private static final int RECURSION_END = 0;

    public int successor(int recursionCounter, int recursionFinalNumber) {

        if (recursionCounter == RECURSION_END) {

            return recursionFinalNumber;

        } else {

            return successor(recursionCounter - 1, recursionFinalNumber) + 1;
        }
    }

    public static void main(String[] args) {

        NaturalNumbersRecursively naturalNumbersRecursively = new NaturalNumbersRecursively();

        int n = naturalNumbersRecursively.successor(5, 0);

        System.out.println(n);
    }
}