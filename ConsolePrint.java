import java.util.Scanner;


class Console
{
	void console(String phrase)
	{
		
		int le = (phrase.length()+2); //To find the length of the phrase to print the console top
		System.out.println("\n");
		System.out.print("\t\t\t\t"); // To align it to the center
		for(int i=0;i<le;i++)
		{
			System.out.print("*"); // Prints the top of the console
		}
		System.out.println("");
		System.out.print("\t\t\t\t");
		System.out.println("*"+phrase+"*"); // Prints the Sides and  Content of the Console
		System.out.print("\t\t\t\t");
		for(int i=0;i<le;i++)
		{
			System.out.print("*"); // Prints the bottom of the console
		}

		System.out.println("\n");


	}

	void lines()
	{
		for(int i=0;i<50;i++)
		{
			System.out.print("_"); //This Creates lines to display it properly
		}
	}
}
class ConsolePrint
{
	public static void main(String arg[])
	{
		Scanner in = new Scanner(System.in);
		Console C = new Console();
		String phrase;
		C.lines();
		C.console("LET US PRINT IN CONSOLE ");  //First Heading
		C.lines();
		System.out.println("\n\n\n");
		System.out.println("PHRASE ");
		phrase = in.nextLine();	
		C.lines();
		C.console(phrase); // Prints the Console Message into the input
		C.lines();
	}
}
