class max_min_ele{
    public static int min_ele(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int max_ele(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3};
        System.out.println("max ele : " + max_ele(arr));
        System.out.println("min ele : " + min_ele(arr));
    }
}