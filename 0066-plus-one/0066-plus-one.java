class Solution {
    public int[] plusOne(int[] digits) {
           StringBuilder sb = new StringBuilder();
        for (int d : digits) {
            sb.append(d);
        }
        String str = sb.toString();

        int i = str.length() - 1;
        int carry = 1; // since we want +1
        StringBuilder str2 = new StringBuilder();

        while (i >= 0 || carry > 0) {
            int a = (i >= 0) ? str.charAt(i) - '0' : 0;
            int sum = a + carry;

            str2.append(sum % 10);
            carry = sum / 10;
            i--;
        }

        str2.reverse(); // because we built from last digit

        int n = str2.length();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = str2.charAt(j) - '0';
        }
        return arr;
    }
}