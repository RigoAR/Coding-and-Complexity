
public class CommonSubstring {
    public static void main(String[] args) {
        String text1 = "gears of war";
        String text2 = "history of warriors";
        System.out.println("Common substring: " + find(text1, text2));
    }

    public static String find(String text1, String text2)
    {
        String result = "";
        int maxLength = 0;

        for (int i = 0; i < text1.length(); i++)
        {
            for (int j = 0; j < text2.length(); j++)
            {
                int length = 0;
                while (i + length < text1.length() && j + length < text2.length() && text1.charAt(i + length) == text2.charAt(j + length))
                {
                    length++;
                }
                if (length > maxLength)
                {
                    maxLength = length;
                    result = text1.substring(i, i + length);
                }
            }
        }

        return result;
    }
}


