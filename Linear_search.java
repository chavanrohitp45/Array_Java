class Linear_search{
    public static int linear_search(int[] arr, int ele){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,4};
        // linear_search(arr, 5);
        System.out.println("ele " + 5 + " is found at index " + linear_search(arr, 5));
    }
}