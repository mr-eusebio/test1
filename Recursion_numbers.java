// The "Recursion_triangle" class.
import java.awt.*;
import hsa.Console;
//displays all numbers from 1 to a digit entered by the user. 
public class Recursion_numbers
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.println("Enter an integer");
	int num = c.readInt();
	display (num);

    } // main method


    public static void display (int n)
    {
	if (n < 1)
	    return;
	else
	    display (n - 1);
	c.print (n+" ");
    }
} 
