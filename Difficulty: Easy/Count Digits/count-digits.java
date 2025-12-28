class Solution {
    static int evenlyDivides(int n) {
        int count = 0;
        int temp = n; // Store the original number
        
        while (temp != 0) {
            int rem = temp % 10; // extract last digit

            // Check that rem is not 0 and divides n evenly
            if (rem != 0 && n % rem == 0) {
                count++;
            }

            temp /= 10; // move to next digit
        }

        return count;
    }
}
