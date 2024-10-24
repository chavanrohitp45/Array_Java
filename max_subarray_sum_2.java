public class max_subarray_sum_2 {
    public static void calc_prfix(int arr[],int prefix[]){
        // int[] prefix = new int[arr.length];
        prefix[0] = arr[0]; 
        // for(int i = 1;i<arr.length;i++){
        //     int sum = 0;
        //     for(int j = 0;j<=i;j++){
        //         sum+=arr[j];
        //     }
        //     prefix[i] = sum;
        // }
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
    }
    public static void print_arr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int subarray_sum(int[] arr, int[] prefix){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i; j<arr.length;j++){
                int sum = i == 0 ? prefix[j] : prefix[j] - prefix[i];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,-2,6,-1,3};
        int[] prefix = new int[arr.length];
        calc_prfix(arr, prefix);
        System.out.println(subarray_sum(arr, prefix));
    }
}
