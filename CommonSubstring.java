
public class CommonSubstring {
    public static void main(String[] args) {
        String text1 = "gears of war";
        String text2 = "history of warriors";
        System.out.println("Common substring: " + find(text1, text2));
    }

    public static String find(String text1, String text2)
    {
        String result = ""; // O(1) initialization
        int maxLength = 0; // O(1) initialization

        for (int i = 0; i < text1.length(); i++) // O(n)
        {
            for (int j = 0; j < text2.length(); j++) // O(m)
            {
                int length = 0;
                while (i + length < text1.length() && j + length < text2.length() && text1.charAt(i + length) == text2.charAt(j + length))
                {
                    length++; // O(1)
                }
                if (length > maxLength) // O(1)
                {
                    maxLength = length; // O(1)
                    result = text1.substring(i, i + length); // O(1)
                }
            }
        }

        return result; // O(1)
    }
}


