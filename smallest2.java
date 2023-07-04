public class smallest2 {
    public static void main(String[] args) {
        int[] arr = { 70, 80, 90, 10, 20, 30, 40, 50, 60 };
        int ans = find(arr);
        System.out.println(ans);
    }

    public static int find(int[] arr) {
        if(arr.length==0){
            return -1;
        }else if( arr.length==1){
            return arr[0];
        }else if(arr[0]<arr[arr.length-1]){
            return arr[0];
        }else{

            int start=0;
            int end = arr.length-1;

            while(start<=end){
                int mid = (start+end)/2;

                if(mid!=0 && arr[mid]<arr[mid-1]){
                    return arr[mid];
                }else if (mid != arr.length-1 && arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                }else if (arr[start]<=arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }

        return -1;
    }
}
