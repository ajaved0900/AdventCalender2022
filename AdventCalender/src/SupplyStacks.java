import java.lang.reflect.Array;
import java.util.Scanner;

public class SupplyStacks {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the rearrangement procedure :)");
        String[] one = {"V", "J", "B", "D"};
        String[] two = {"F", "D", "R", "W", "B", "V", "P"};
        String[] three = {"Q", "W", "C", "D", "L", "F", "G", "R"};
        String[] four = {"B", "D", "N", "L", "M", "P", "J", "W"};
        String[] fifth = {"Q", "S", "C", "P", "B", "N", "H"};
        String[] sixth = {"G", "N", "S", "B", "D", "R"};
        String[] seventh = {"H", "S", "F", "Q", "M", "P", "B", "Z"};
        String[] eighth = {"F", "L", "W"};
        String[] ninth = {"R", "M", "F", "V", "S"};

        while (scan.hasNextLine()) {
            String temp = scan.nextLine();
            if (temp.equals("")) {
                break;
            } else {
                String temp2 = temp.replace("move ", "").replace("from ", "").replace("to ", "");
                Scanner scan2 = new Scanner(temp2);
                Integer move = Integer.parseInt(scan2.next());
                Integer from = Integer.parseInt(scan2.next());
                Integer to = Integer.parseInt(scan2.next());
            }
        }
    }
