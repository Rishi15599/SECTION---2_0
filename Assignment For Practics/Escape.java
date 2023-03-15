class Escape {
    static int longest_subarray(int arr[], int d) {
        int i = 0, j = 1, e = 0;

        for (i = 0; i < d - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                j = j + 1;
            } else {

                j = 1;
            }
            if (e < j) {
                e = j;
            }
        }
        return e;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int N = arr.length;
        System.out.print(longest_subarray(arr, N));
    }
}