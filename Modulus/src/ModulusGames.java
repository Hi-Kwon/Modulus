import java.util.Scanner;
public class ModulusGames
	{

		public static void main(String[] args)
		{

				{
			evenOrOdd();
			leapYear();
				}
		}
		public static void evenOrOdd()
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("Please input a number");
				int number = userIntInput.nextInt();
					{
						if (number % 2 == 0)
							{
								System.out.println("The number is even!");
							}
						else
							{
								System.out.println("The number is Odd!");
							}
					}
			}
		public static void leapYear()
		{
			Scanner userIntInput = new Scanner(System.in);
			System.out.println("Please input a year");
			int year = userIntInput.nextInt();
			
				{
					if (year % 400 == 0)
						{
							System.out.println("This is a leap year!");
						}
					else if (year % 100 == 0)
						{
							System.out.println("This is not a leap year!");
						}
					else if (year % 4 == 0)
						{
							System.out.println("This is a leap year!");
						}
					else
						{
							System.out.println("This is not a leap year!");
						}

				}
		}
	}
