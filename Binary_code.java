public class Binary_code {
    public static int binary_code(int[] arr, int ele){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = (s + e) / 2;
            if(arr[mid] == ele){
                return mid;
            }else if(arr[mid] > ele){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(binary_code(arr, 8));
    }
}
