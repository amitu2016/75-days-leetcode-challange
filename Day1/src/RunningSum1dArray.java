public class RunningSum1dArray {

    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i == 0){
                arr[i] = nums[i];
            }else{
                arr[i] = arr[i-1] +  nums[i];
            }

        }
            return arr;
    }

    public static void main(String[] args) {
        RunningSum1dArray obj = new RunningSum1dArray();
        int[] a = {1,2,3,4};

        int[] res = obj.runningSum(a);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

}
