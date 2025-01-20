public class CommonSubstring {



        public static void main(String[] args)
        {
            String text1 = "gears of war";
            String text2 = "history of warriors";
            CommonSubstring start = new CommonSubstring();
            System.out.println("The number of common subsequence is " + start.find(text1, text2));
        }

        public static int find(String text1, String text2)
        {
            if(text1.length() < text2.length())
            {
                int[] num = new int[text2.length()];
            }
            else
            {
                int[] num = new int[text1.length()];
            }

            for(int i = 0; i < text1.length(); i++)
            {
                for(int j = 0; j < text2.length(); j++)
                {
                    if (text1.charAt(i) == text2.charAt(j))
                    {
                        num[i] = j;
                        break;
                    }
                }
            }

            return num;

        }


}
