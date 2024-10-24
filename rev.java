public class rev {
    public static void rev(int arr[]){
        int si = 0;
        int ei = arr.length - 1;
        while(si <= ei){
            // int temp = arr[si];
            // arr[si] = arr[ei];
            // arr[ei] = temp;
            if(si == ei){
                break;
            }
            arr[si] = arr[si] ^ arr[ei];
            arr[ei] = arr[si] ^ arr[ei];
            arr[si] = arr[si] ^ arr[ei];
            si++;
            ei--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
    }
}
