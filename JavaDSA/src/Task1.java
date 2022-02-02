import java.util.Scanner;

public class Task1 {

    static String changeString(String riddle)
    {
        // Store the given String
        char []s = riddle.toCharArray();

        int N = (int)riddle.length();

        // If the first character is '?'
        if (s[0] == '?')
        {
            s[0] = 'a';
            if (s[0] == s[1])
            {
                s[0]++;
            }
        }

        // Traverse the String [1, N - 1]
        for (int i = 1; i < N - 1; i++)
        {
            // If the current
            // character is '?'
            if (s[i] == '?')
            {
                // Change the character
                s[i] = 'a';

                // Check equality with
                // the previous character
                if (s[i] == s[i - 1])
                {
                    s[i]++;
                }

                // Check equality with
                // the next character
                if (s[i] == s[i + 1])
                {
                    s[i]++;
                }

                // Check equality with
                // the previous character
                if (s[i] == s[i - 1])
                {
                    s[i]++;
                }
            }
        }

        // If the last character is '?'
        if (s[N - 1] == '?')
        {
            // Change character
            s[N - 1] = 'a';

            // Check with previous
            // character
            if (s[N - 1] == s[N - 2])
            {
                s[N - 1]++;
            }
        }

        String ans = "";

        for(int  i = 0; i < s.length; i++)
        {
            ans += s[i];
        }

        // Return the resultant String
        return ans;
    }

    // Driver Code
    public static void main(String[] args)
    {
        // Given String S
        Scanner in=new Scanner(System.in);
        String S = in.nextLine();

        // Function Call
        System.out.print(changeString(S));
    }
}

