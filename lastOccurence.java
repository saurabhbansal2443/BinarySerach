public class lastOccurence {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 20, 20, 20, 20, 30, 40, 50 };

        int k = 10;

        int ans = lastOccurence(arr, k);

        System.out.println(ans);
    }

    public static int lastOccurence(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                ans = mid;
                start = mid + 1;
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else if (k > arr[mid]) {
                start = mid + 1;
            }
        }

        return ans;
    }

    
}
