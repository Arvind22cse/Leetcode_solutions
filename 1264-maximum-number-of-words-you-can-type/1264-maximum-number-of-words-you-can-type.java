class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
         String[] arr = text.split(" ");
        char[] a = brokenLetters.toCharArray();
        int i = 0, c = 0;

        while (i < arr.length) {
            int k = 0, j = 0;
            boolean canType = true;

            while (j < a.length) {
                k = 0;
                while (k < arr[i].length()) {
                    if (arr[i].charAt(k) == a[j]) {
                        canType = false;
                        break;
                    }
                    k++;
                }
                if (!canType) break; // no need to check further
                j++;
            }

            if (canType) c++;
            i++;
        }
        return c;
    }
}