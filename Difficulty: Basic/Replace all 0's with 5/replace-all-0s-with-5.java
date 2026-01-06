/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
        // add code here.
        String str = Integer.toString(n);
        str=str.replace("0","5");
        int result = Integer.parseInt(str);
        return result;
    }
}