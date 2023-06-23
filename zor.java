public class zor {
    public static void main(String[] args) {
        int[] arr = {20,30,20,30,40,50,10,10,50,25,15,15,25};
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){

             ans = ans^arr[i];
        }

        System.out.println(ans);
    }
}
