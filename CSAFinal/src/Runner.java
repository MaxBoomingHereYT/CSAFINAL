//COMMENTS!!!!!!! (Needed imports to use ArrayLists for storing user-created objects and Scanner for user input)
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        
        //MEANINGFUL VARIABLE NAMES!!!!!!! (Sets up variables for use later in code)
        boolean novel;
        boolean loop;
        String a;
        String t;
        String r;
        //Opens scanner to allow for user input later
        Scanner input = new Scanner(System.in);
        //ARRAYLIST!!!!!!! (Used to store Press objects to be physically printed);
        ArrayList<Press> printing = new ArrayList();

        /*BELOW ARE TEST CASES
        Press Dictionary = new Press("Webster", "Dictionary", "01-01-2000");
        Novel JurassicPark = new Novel("Michael Crichton", "Jurassic Park", "11-20-1990");
        Newspaper NewYorkTimes = new Newspaper("Ismaeel Naar and Enjoli Liston", "Trump Meets Ex-Jihadist Who Now Leads Syria", "05-14-2025");
        System.out.println(Dictionary.getAuthor());
        System.out.println(JurassicPark.getGenre());
        System.out.println(JurassicPark.getAuthor());
        System.out.println(NewYorkTimes.getPurpose());
        System.out.println(NewYorkTimes.getTitle()); */

        //USER INPUT!!!!!!! (Main section of code, taking user input to create a novel or newspaper object using instance variables)
        //May be a better way to do this loop, but allows user to decide if they want to keep adding Press objects to the printing queue
        for (int i = 1; i > 0; i++) {
            System.out.println("Would you like to print a novel or a newspaper? Please input true for novel or false for newspaper.");
            novel = input.nextBoolean();
            input.nextLine();
            System.out.println("Please input the author of what you want printed:");
            a = input.nextLine();
            System.out.println("And now its title:");
            t = input.nextLine();
            System.out.println("As well as its release date, formatted as 'MM-DD-YYYY':");
            r = input.nextLine();
            //Adds the created object to the ArrayList
            if (novel) {
                printing.add(Novel.createNovel(a, t, r));
                System.out.println(Novel.createNovel(a, t, r));
            } else {
                printing.add(Newspaper.createNewspaper(a, t, r));
                System.out.println(Newspaper.createNewspaper(a, t, r));
            }
            //Allows for loop to work with user input
            System.out.println("Would you like to add something else to print? Please input true to add something else or false to end the program");
            loop = input.nextBoolean();
            input.nextLine();
            if (loop) {
                i++;
            } else {
                i = -1;
            }
        }
        
        //Closes scanner to save resources and ends code after printing the final list of things to print
        input.close();
        System.out.println(printing);
        return;

    }

}