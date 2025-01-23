public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3, 4, 5};
        int val = 3;
        RemoveElement remover = new RemoveElement();
        System.out.println("The number of elements not equal to " + val + " is " + remover.remove(nums, val));
    }

    public static int remove(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}
