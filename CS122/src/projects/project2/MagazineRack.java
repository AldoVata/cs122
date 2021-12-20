package projects.project2;
import java.util.Scanner;
//*******************************************************************
//  MagazineRack.java       Author: Lewis/Loftus
//
//  Driver to exercise the MagazineList collection.
//*******************************************************************

import projects.project1.IntegerList;

public class MagazineRack {
	// ----------------------------------------------------------------
	// Creates a MagazineList object, adds several magazines to the
	// list, then prints it.
	// ----------------------------------------------------------------
	static MagazineList rack = new MagazineList();
    static Scanner scan = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		printMenu();
        int choice = scan.nextInt();
        while (choice != 0)
        {
            dispatch(choice);
            printMenu();
            choice = scan.nextInt();
        }
	}
	public static void dispatch(int choice)
    {
        switch(choice)
        {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
            	System.out.println("Enter a Title: ");
            	String title = scan.nextLine();
            	rack.addToFront(new Magazine(title));
            	break;
            case 2:
            	String title2 = scan.nextLine();
            	rack.addToEnd(new Magazine(title2));
            	break;
            case 3:
            	rack.removeFirst();
            	break;
            case 4:
            	rack.removeLast();
            	break;
            case 5:
            	System.out.println("Enter the Title of a Magazine and a New Magazine, Seperated by a *");
            	String title3 = scan.nextLine();
            	String oldMag = title3.substring(0, title3.indexOf("*"));
            	String newMag = title3.substring(title3.indexOf("*"));
            	rack.replace(new Magazine(oldMag), new Magazine(newMag));
            	break;
            case 6:
                rack.print();
                break;
            default:
                System.out.println("Sorry, invalid choice");
        }
    }
    // ----------------------------
    // Prints the user's choices.
    // ----------------------------
    public static void printMenu()
    {
        System.out.println("\n Menu ");
        System.out.println(" ====");
        System.out.println("0: Quit");
        System.out.println("1: Add A Magazine Title To The Front");
        System.out.println("2: Add A Magazine Title To The End");
        System.out.println("3: Remove The First Node");
        System.out.println("4: Remove The Last Node");
        System.out.println("5: Replace A Node");
        System.out.println("6: Print");
        System.out.print("\nEnter your choice: ");
    }
}
