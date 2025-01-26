
public class CommonSubsequence
{
    public static void main(String[] args)
    {
        String text1 = "albatross";
        String text2 = "almanacs";
        CommonSubsequence start = new CommonSubsequence();
        System.out.println("The number of common subsequence is " + start.find(text1, text2));
    }

    public static int find(String text1, String text2)
    {
        int num = 0; // O(1)
        boolean[] used = new boolean[text2.length()]; //O(1) initialization

        for(int i = 0; i < text1.length(); i++)// O(n) for text1
        {
            for(int j = 0; j < text2.length(); j++) // O(m) for text2
            {
                if (text1.charAt(i) == text2.charAt(j) && !used[j])
                {
                    num++;  // O(1)
                    used[j] = true;  // O(1)
                    break; //O(1) break
                }
            }
        }

            return num; // O(1)

    }
}
