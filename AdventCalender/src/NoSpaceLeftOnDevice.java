import java.util.*;
import java.util.Collections;

public class NoSpaceLeftOnDevice {
    public static void main(String args[]) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
    }
}

//    ArrayList<String> files = new ArrayList<String>();// Initializing arrayList
//    Scanner scan = new Scanner(System.in);
//        System.out.println("Give me teminal output :)");
//                int sum = 0;
//                while (scan.hasNextLine()) {
//                String temp = scan.nextLine();
//                if (temp.equals("")) {
//                break;
//                }
//                else
//                files.add(temp);
//                }
//
//                String[] allFiles = files.toArray(new String[0]); // Converting from arrayList to Array
//
//                String allFiles1 = String.join(",", allFiles); // Converting String array to string
//                String allFiles2 = allFiles1.replace(",",", "); //replacing "," with ", " in string
//                String strArray[] = allFiles2.split(" ");// creating new string array by splitting at " "
//
//                ArrayList<String> numsOnly = new ArrayList<String>();// Initializing arrayList
//        String[] numsOnly2 = numsOnly.toArray(new String[0]);// Converting from arrayList to Array
//        ArrayList arrayList = new ArrayList();
//
//        ArrayList<Integer> numsOnlyValue = new ArrayList<Integer>();// Initializing arrayList
//
//        for(int i = 0; i < strArray.length; i++){
//        if(isNumeric(strArray[i])){
//
//        if(Integer.parseInt(strArray[i]) < 100000)
//        {
//        sum += Integer.parseInt(strArray[i]);
//        numsOnly.add(strArray[i]);
//        }
//        else
//        {
//        arrayList.add(strArray[i]);
//        }
//
//        }
//        }
//
//       /* for(int i = 0; i < numsOnly2.length; i++){
//            numsOnlyValue.add(Integer.parseInt(numsOnly2[i]));
//            System.out.println(numsOnly2[i]);
//        }*/
//
//        System.out.println("-------");
//        System.out.println(numsOnly);
//        System.out.println(sum);
//        System.out.println(arrayList);
//        }
//
//public static boolean isNumeric(String strNum) {
//        if (strNum == null) {
//        return false;
//        }
//        try {
//        double d = Double.parseDouble(strNum);
//        } catch (NumberFormatException nfe) {
//        return false;
//        }
//        return true;
//        }
//
//
//public class Directory
//{
//    int value;
//    String directory;
//}
