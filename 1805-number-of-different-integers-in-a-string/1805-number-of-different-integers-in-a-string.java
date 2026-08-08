class Solution {
    public int numDifferentIntegers(String word) {

        Set<String> s1 = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : word.toCharArray()) {

            if (Character.isDigit(c)) {
                sb.append(c);
            } 
            else {
                if (sb.length() != 0) {

                    int i = 0;

                    while (i < sb.length() - 1 && sb.charAt(i) == '0') {
                        i++;
                    }

                    s1.add(sb.substring(i));
                    sb.setLength(0);
                }
            }
        }

        if (sb.length() != 0) {

            int i = 0;

            while (i < sb.length() - 1 && sb.charAt(i) == '0') {
                i++;
            }

            s1.add(sb.substring(i));
        }

        return s1.size();
    }
}