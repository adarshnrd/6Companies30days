package Microsoft;

public class RotateFunction {
    public static void main(String[] args) {
int arr[]={1,2,3,4};
        System.out.println(maxRotateFunction(arr));
    }
    public static int maxRotateFunction(int[] nums) {
        int n = nums.length;

        int sum = 0;
        int indexSum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            indexSum += i * nums[i];
        }

        int max = indexSum;
        for (int k = 1; k < n; k++) {
            int f = indexSum + sum - n * nums[n - k];
            max = Math.max(max, f);
            indexSum = f;
        }

        return max;
    }
}