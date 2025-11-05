import java.util.Arrays;

public class q10 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 3, 2, 7, 1, 8};
        mergesortinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortinplace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergesortinplace(arr, s, mid);
        mergesortinplace(arr, mid, e);

        mergein(arr, s, mid, e);
    }

    private static void mergein(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        // ✅ fixed loop condition here
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
