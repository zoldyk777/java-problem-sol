class q1 {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println(rev(word));
    }

    public static String rev(String word) {

        char[] arr = word.toCharArray();  // convert to char array

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left pointer until vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // move right pointer until vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);   // build and return final string
    }

    public static boolean isVowel(char c) {
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
               c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
