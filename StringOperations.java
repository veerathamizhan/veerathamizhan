
import java.util.ArrayList;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<String> obj = new ArrayList<String>();

        // Append - add elements at the end
        obj.add("Arun");
        obj.add("Balaji");
        obj.add("Chandru");
        obj.add("David");
        obj.add("Elango");

        System.out.println("Elements in ArrayList:");
        System.out.println(obj);

        // Insert - add elements at a particular index
        obj.add(0, "Arjun");
        obj.add(1, "Barath");

        System.out.println("\nAfter Inserting Elements:");
        System.out.println(obj);

        // Search for an element
        System.out.print("\nEnter the string to search: ");
        String searchStr = in.nextLine();

        boolean found = false;

        for (String str : obj) {
            if (str.equalsIgnoreCase(searchStr)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("ArrayList contains " + searchStr);
        } else {
            System.out.println("ArrayList does not contain " + searchStr);
        }

        // List strings starting with a given letter
        System.out.print("\nEnter the starting letter: ");
        String start = in.nextLine().trim();

        ArrayList<String> obj1 = new ArrayList<String>();

        if (!start.isEmpty()) {
            for (String str : obj) {
                if (str.toLowerCase().startsWith(
                        start.substring(0, 1).toLowerCase())) {
                    obj1.add(str);
                }
            }
        }

        System.out.println("\nStrings starting with the given letter:");
        System.out.println(obj1);

        in.close();
    }
}