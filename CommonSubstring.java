/*
public class CommonSubstring {
    public static void main(String[] args)
    {
        String text1 = "gears of war";
        String text2 = "history of warriors";
        CommonSubstring start = new CommonSubstring();
        System.out.println("The number of common subsequence is " + start.find(text1, text2));
    }

    public static String[] find(String text1, String text2)
    {
        String[] num = new String[text1.length() + text2.length()];


        for(int i = 0; i < text1.length(); i++)
        {
            for(int j = 0; j < text2.length(); j++)
            {
                if (text1.charAt(i) == text2.charAt(j))
                {
                    num[i] = text1.charAt(i);
                    break;
                }
            }
        }

        return num;

    }
}

 */