// https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/description/?envType=daily-question&envId=2026-07-19
class q69 {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];

        // Step 1: Record the last occurrence index of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        boolean[] inStack = new boolean[26]; // tracks if a char is currently on the stack

        // Step 2: Walk through the string, building the stack greedily
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (inStack[c - 'a']) {
                continue; // this character is already in our answer, skip it
            }

            // Pop while: stack has something bigger than c, AND that bigger
            // character appears again later (so it's safe to remove now)
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        // Step 3: Build the final string from the stack (bottom to top)
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}