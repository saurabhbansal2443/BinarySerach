public class rotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = { 70,80,90,10,20,30,40,50,60};

        int k = 10;

        int ans = search(arr, k);

        System.out.println(ans);

    }

    public static int search(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[start] <= arr[mid]) { // left part sorted
                if (k >= arr[start] && k < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[end] >= arr[mid]) { // right part sorted

                if (k > arr[mid] && k <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
