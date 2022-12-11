import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class CalorieCounting {
    public static void main(String args[]) {

        ArrayList<Integer> allCalories = new ArrayList<Integer>();// Initializing arrayList
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Calories, when done please hit enter and add a negative number to get find your answer :)");
        while(scan.hasNextLine()){
            String temp = scan.nextLine();
            int i = 0;
            if(temp != ""){
                i = Integer.parseInt(temp);
            }
            if (i > 0){
                allCalories.add(i);
            }
            else if(i < 0){
                break;
            }
            else
                allCalories.add(0);
        }

        Integer[] allCaloriesInput= allCalories.toArray(new Integer[0]);// Converting from arrayList to Array
        ArrayList<Integer> EachElfCaloriesCount = new ArrayList<Integer>();// Initializing arrayList

        int overallCalorieCount = 0;
        for(int i = 0; i < allCaloriesInput.length; i++){
            overallCalorieCount += allCaloriesInput[i];
            if(allCaloriesInput[i] == 0) {
                EachElfCaloriesCount.add(overallCalorieCount);
                overallCalorieCount = 0;
            }
            if(allCaloriesInput.length == i+1){
                EachElfCaloriesCount.add(overallCalorieCount);
            }
        }

        Integer[] EachElfCaloriesCountArray = EachElfCaloriesCount.toArray(new Integer[0]);// Converting from arrayList to Array

        int maxVal = 0;
        for(int i = 0; i < EachElfCaloriesCount.size(); i++){
            if(EachElfCaloriesCountArray[i] > maxVal){
                maxVal = EachElfCaloriesCountArray[i];
            }
        }

        System.out.println("The Elf with the most calories in his goodies has "+maxVal+" calories :)");

        Arrays.sort(EachElfCaloriesCountArray, Collections.reverseOrder());

        int CalorieSumOfTopThree = 0;
        for(int i = 0; i < 3;i++){
            CalorieSumOfTopThree += EachElfCaloriesCountArray[i];
        }
        System.out.println("Total calories for the top 3 elves is "+CalorieSumOfTopThree+ " calories :)");

    }
}
