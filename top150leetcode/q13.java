// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
class q13 {
    public String reverseWords(String s) {

        String[] parts = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            if (parts[i].length() == 0) continue; // skip multiple spaces
            sb.append(parts[i]).append(" ");
        }

        return sb.toString().trim();
    }
}
