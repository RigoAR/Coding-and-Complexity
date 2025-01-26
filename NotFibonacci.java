import java.util.Arrays;

public class NotFibonacci
{
    public static void main(String[] args)
    {
        NotFibonacci start = new NotFibonacci();
        int[] nums = {0,1};
        int times = 10;
        long[] result = start.fib(nums,times);
        System.out.println(Arrays.toString(result));
    }

    public long[] fib(int[] nums, int times)
    {
        long[] arr = new long[times]; // O(1)
        arr[1] = nums[1]; // O(1)
        arr[0] = nums[0]; // O(1)


        for (int k = 2; k < times; k++) // O(n)
        {

            arr[k] = (3 * arr[k - 1]) + (2 * arr[k - 2]); // O(1)

        }

        return arr; // O(1)

    }
}

