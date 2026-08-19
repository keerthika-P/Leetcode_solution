class Solution {
    public int divide(int dividend, int divisor) {
      

        // handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // convert to long
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {

            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // handle sign
        if ((dividend > 0) ^ (divisor > 0)) {
            result = -result;
        }

        return result;
    }
}
