//PART I & II of the puzzle

import java.util.ArrayList;
import java.util.Scanner;

public class TuningTrouble {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the characters :)");
        ArrayList<String> letters = new ArrayList<String>();// Initializing arrayList
        int desiredUniqueLettersAmount = 0;
        while(scan.hasNextLine()) {

            String temp = scan.nextLine();
            if (temp.equals("")) {
                break;
            }
            else {
                for (int i = 0; i < temp.length(); i++) {
                    letters.add(temp.charAt(i)+"");
                }
            }
        }

        String[] letters2= letters.toArray(new String[0]);// Converting from arrayList to Array
        ArrayList<String> uniqueLetters = new ArrayList<String>();// Initializing arrayList

        for(int i = 0; i < letters2.length; i++){
            if(desiredUniqueLettersAmount == 4){// Change int here to whatever number of unique letters you'd like to see
                System.out.println("---------Hit the desired number of unique numbers so we are done---------");
                System.out.println("Solution "+i);
                break;
            }
            else {
                if(!uniqueLetters.contains(letters2[i])){
                    uniqueLetters.add(letters2[i]);
                    System.out.println(uniqueLetters);
                    System.out.println("---------Added letter to array---------");
                    desiredUniqueLettersAmount += 1;
                }
                else{
                    int num = uniqueLetters.indexOf(letters2[i]+"");
                    uniqueLetters.add(letters2[i]);
                    System.out.println(uniqueLetters);
                    System.out.println("---------If letter is contained in array, remove from left until unique letters left---------");
                    if(num >= 0)
                        uniqueLetters.remove(0);
                        System.out.println(uniqueLetters);

                    for(int j = 0; j < num; j++){
                        uniqueLetters.remove(0);
                        desiredUniqueLettersAmount -= 1;
                    }
                    System.out.println(uniqueLetters);
                }
            }
        }
    }
}


