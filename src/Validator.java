import java.util.Arrays;

public class Validator {
    public static char findClosingParentheses(char i) {
        if (i == '(')
            return ')';
        return Character.MIN_VALUE;
    }

    public boolean validateParenthesis(char[] expr, int n) {
        char closing = findClosingParentheses(expr[0]);
        int i, count = 0;

        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else if (expr[0] == ')') {
            return false;
        }

        for (i = 1; i < n; i++) {
            if (expr[i] == expr[0]) {
                count++;

            } else if (expr[i] == closing) {
                if (count == 0) {
                    break;
                }
                count--;
            }
        }

        if (i == n) {
            return false;
        }

        if (i == 1) {
            return validateParenthesis(Arrays.copyOfRange(expr, i + 1, n), n - 2);
        }

        return validateParenthesis(Arrays.copyOfRange(expr, 1, n), i - 1) && validateParenthesis(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
    }
}
