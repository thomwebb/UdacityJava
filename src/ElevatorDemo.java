// lesson 5.2 - Decisions

import java.util.Scanner;

public class ElevatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        if (in.hasNextInt())
        {
            // Now we know that the user entered an integer

            int floor = in.nextInt();

            if (floor == 13)
            {
                System.out.println("Error: There is no thirteenth floor.");
            }
            else if (floor < 1 || floor > 18)
            {
                System.out.println("Error: The floor must be between 1 and 18.");
            }
            else
            {
                // Now we know that the input is valid

                int actualFloor = floor;
                if (floor > 13)
                {
                    actualFloor = floor - 1;
                }

                System.out.println("The elevator will travel to the actual floor "
                                   + actualFloor);
            }
        }
        else
        {
            System.out.println("Error: Not an integer.");
        }
	}

}
