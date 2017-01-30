
//
// Example use of the Input class:
// String s;
// s = Input.readString();
//
// int count;
// Output.print("Please enter number of values);
// count = Input.readInt();
//

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Integer;

class Input
{
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public Input() {}

    // read a string from the standard input
    public static String readString()
    {
        String s;
	try
        {
	    s = in.readLine();
	    s = s.toUpperCase();
	    return s;
	}
        catch (IOException e)
        {
            return "";
        }
    }

    // read in integer from the standard input
    public static int readInt()
    {
        try
        {
	    String s = in.readLine();
	    if (s.length() > 0)
	    {
	        return Integer.parseInt(s);
	    }
            else
	    {
	        return -1;
            }
        }
        catch (IOException e)
	{
	    return -1;
	}
    }
}
