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
            long[] arr = new long[times];
            arr[1] = nums[1];
            arr[0] = nums[0];


            for (int k = 2; k < times; k++)
            {

                arr[k] = (3 * arr[k - 1]) + (2 * arr[k - 2]);
            }

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == target)
                {
                    return arr[i];
                }
                else if(arr[i] > target)
                {
                    return arr[i - 1];
                }
            }
            return arr[arr.length - 1];

        }
    }