class Solution {
    public boolean isAnagram(String s, String t) {
          // If lengths are different, not anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert to char arrays
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        // Sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare sorted arrays
        return Arrays.equals(a, b);
    }
}