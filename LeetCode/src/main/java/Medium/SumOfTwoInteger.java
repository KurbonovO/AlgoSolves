package Medium;

//Binary
public class SumOfTwoInteger {

    // Time: O(n) Space: O
    public int sumOfTwoIntegerIterative(int a, int b) {

        if(a == 0) {
            return b;
        }
        if(b == 0) {
            return a;
        }
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    public int sumOfTwoIntegerRecursive(int a, int b) {

        if(a == 0) {
            return b;
        }
        if(b == 0) {
            return a;
        }
        return sumOfTwoIntegerRecursive(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {

        SumOfTwoInteger sumOfTwoInteger = new SumOfTwoInteger();
        System.out.println(sumOfTwoInteger.sumOfTwoIntegerIterative(1, 2));
        System.out.println(sumOfTwoInteger.sumOfTwoIntegerRecursive(1, 2));
    }

}
