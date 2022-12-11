//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class RuckSacks {
//    public static void main(String[] args){
//
//        ArrayList<String> stuff = new ArrayList<String>();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What's in your bag? :)");
//
//        while(scan.hasNextLine()) {
//
//            String temp = scan.nextLine();
//            if (temp.equals("")) {
//                break;
//            }
//            else
//                stuff.add(temp);
//        }
//
//        String[] stuffInBag= stuff.toArray(new String[0]);
//        ArrayList<String> letters = new ArrayList<String>();
//
//        for(int i = 0; i < stuffInBag.length; i++){
//            String leftHalf = stuffInBag[i].substring(0, stuffInBag[i].length()/2);
//            String rightHalf = stuffInBag[i].substring(stuffInBag[i].length()/2);
//            for(int j = 0; j < leftHalf.length(); j++) {
//
//                if (rightHalf.contains(leftHalf.charAt(j)+"")) {
//                    letters.add(leftHalf.charAt(j)+"");
//                    break;
//                }
//            }
//        }
//
//        String[] commonLetters= letters.toArray(new String[0]);
//        ArrayList<Integer> lowerCaseLetterValues = new ArrayList<Integer>();
//        ArrayList<Integer> upperCaseLetterValues = new ArrayList<Integer>();
//
//        int sum = 0;
//
//        for(int i = 0; i < commonLetters.length; i++){
//            if(commonLetters[i].equals(commonLetters[i].toLowerCase())){
//                lowerCaseLetterValues.add(commonLetters[i].hashCode()-96);
//                sum += commonLetters[i].hashCode() - 96;
//            }
//            else if(commonLetters[i].equals(commonLetters[i].toUpperCase())){
//                upperCaseLetterValues.add(commonLetters[i].hashCode()-38);
//                sum += commonLetters[i].hashCode()-38;
//            }
//        }
//
//        System.out.println("These are the letters in common " + letters);
//        System.out.println("Values of the lower case letters "+lowerCaseLetterValues);
//        System.out.println("Values of the upper case letters "+upperCaseLetterValues);
//        System.out.println("Final value "+sum);
//    }
//}

//PART II of the puzzle

import java.util.ArrayList;
import java.util.Scanner;

public class RuckSackReorganization {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("What's in your bag? :)");
        ArrayList<String> letters = new ArrayList<String>();

        while(scan.hasNextLine()) {

            String line1 = scan.nextLine();
            String line2 = scan.nextLine();
            String line3 = scan.nextLine();

            if(line1 != "" && line2 != "" && line3 != ""){
                for(int i = 0; i < line1.length(); i++){
                    if (line2.contains(line1.charAt(i)+"") && line3.contains(line1.charAt(i)+"")){
                        letters.add(line1.charAt(i)+"");
                        break;
                    }
                }
            }
            else
                break;
        }

        String[] commonLetters= letters.toArray(new String[0]);
        ArrayList<Integer> lowerCaseLetterValues = new ArrayList<Integer>();
        ArrayList<Integer> upperCaseLetterValues = new ArrayList<Integer>();

        int sum = 0;

        for(int i = 0; i < commonLetters.length; i++){
            if(commonLetters[i].equals(commonLetters[i].toLowerCase())){
                lowerCaseLetterValues.add(commonLetters[i].hashCode()-96);
                sum += commonLetters[i].hashCode() - 96;
            }
            else if(commonLetters[i].equals(commonLetters[i].toUpperCase())){
                upperCaseLetterValues.add(commonLetters[i].hashCode()-38);
                sum += commonLetters[i].hashCode()-38;
            }
        }

        System.out.println("These are the letters in common " + letters);
        System.out.println("Values of the lower case letters "+lowerCaseLetterValues);
        System.out.println("Values of the upper case letters "+upperCaseLetterValues);
        System.out.println("Final value "+sum);
    }
}
