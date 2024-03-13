class Solution {
    /*
    * You are given two strings order and s. All the characters of order are unique and were sorted in some custom order previously.
    * Permute the characters of s so that they match the order that order was sorted.
    * More specifically, if a character x occurs before a character y in order, then x should occur before y in the permuted string.
    * Return any permutation of s that satisfies this property.
    */
    public String customSortString(String order, String s) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        StringBuilder out = new StringBuilder();
        StringBuilder tail = new StringBuilder();

        for (char c : order.toCharArray()) {
            charMap.put(c, 0);
        }

        for (char c : s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                tail.append(c);
            }
        }

        for (char c : order.toCharArray()) {
            int n = charMap.get(c);
            for (int i = 0; i < n; i++) {
                out.append(c);
            }
        }
        out.append(tail);
        return out.toString();
    }
}

