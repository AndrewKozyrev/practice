import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 12345;

        int[] digits = new int[Integer.toString(num).length()];

        int i = digits.length - 1;
        while (num > 0) {
            int nextDigit = num % 10;
            digits[i] = nextDigit;
            i--;
            num = num / 10;
        }
        System.out.println(Arrays.toString(digits));
    }

    //  1
    //   [9 9 9 9],    carry = 0
    // [1 0 0 0 0]
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        boolean flag = true;
        for (int digit : digits) {
            if (digit < 9) {
                flag = false;
                break;
            }
        }

        if (flag) {
            n++;
        }

        int[] result = new int[n];

        if (flag) {
            result[0] = 1;
            return result;
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + carry == 10) {
                carry = 1;
                result[i] = 0;
            } else {
                result[i] = carry + digits[i];
                carry = 0;
            }
        }
        return result;
    }
}