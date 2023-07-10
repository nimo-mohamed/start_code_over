import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll");


        System.out.println(scottishIslands.indexOf("Skye"));
        scottishIslands.remove("Tresco");

        System.out.println(scottishIslands);

        scottishIslands.remove(scottishIslands.indexOf("Arran"));

        String firstscottishIslands = scottishIslands.get(0);
        System.out.println("first scottish Islands:" + firstscottishIslands);
        System.out.println("number of scottish Islands:" + scottishIslands.size() );

        Collections.sort(scottishIslands, String.CASE_INSENSITIVE_ORDER);


        ArrayList<String> allIslands = new ArrayList<>();
        for (String allIsland : allIslands){

        }
        System.out.println(scottishIslands);



//        1. Add "Coll" to the end of the list✅
//        2. Add "Tiree" to the start of the list✅
//        3. Add "Islay" after "Jura" and before "Mull"✅
//        4. Print out the index position of "Skye"✅
//        5. Remove "Tresco" from the list by name✅
//        6. Remove "Arran" from the list by index✅
//        7. Print the number of islands in your arraylist✅
//        8. Sort the list alphabetically✅
//        9. Print out all the islands using a for loop✅

                System.out.println(scottishIslands);

//        NUMBERS
            List<Integer> numbers = new ArrayList<>();
            Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

            System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//        2. Print the difference between the largest and smallest value
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.

        }

    }

