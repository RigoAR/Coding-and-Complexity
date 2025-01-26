import java.util.Arrays;

public class WhereInSequence {
        public static void main(String[] args)
        {
            WhereInSequence start = new WhereInSequence();
            int[] nums = {0,1};
            int times = 10;
            int target = 1;
            long result = start.fib(nums,times, target);
            System.out.println(result);
        }

        public long fib(int[] nums, int times, int target)
        {
            long[] arr = new long[times]; // O(1)
            arr[1] = nums[1]; // O(1)
            arr[0] = nums[0]; // O(1)


            for (int k = 2; k < times; k++) // O(n)
            {

                arr[k] = (3 * arr[k - 1]) + (2 * arr[k - 2]); // O(1)
            }

            for(int i = 0; i < arr.length; i++) // O(n)
            {
                if(arr[i] == target) // O(1)
                {
                    return arr[i]; // O(1)
                }
                else if(arr[i] > target) // O(1)
                {
                    return arr[i - 1]; // O(1)
                }
            }
            return arr[arr.length - 1]; // O(1)

        }
    }