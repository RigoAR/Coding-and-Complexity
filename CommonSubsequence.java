
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
        int num = 0;
        boolean[] used = new boolean[text2.length()];

        for(int i = 0; i < text1.length(); i++)
        {
            for(int j = 0; j < text2.length(); j++)
            {
                if (text1.charAt(i) == text2.charAt(j) && !used[j])
                {
                    num++;
                    used[j] = true;
                    break;
                }
            }
        }

            return num;

    }
}
