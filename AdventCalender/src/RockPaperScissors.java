import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Help me cheat. Give me the game winning strategy :)");
        int points = 0;

        while(scan.hasNextLine()){

            Object i = scan.nextLine();
            if(i.equals("")){
                break;
            }
            if(scan.hasNextLine()){
                if(i.equals("A X")){
                    points += 4;
                }
                else if(i.equals("A Y")){
                    points += 4;
                }
                else if(i.equals("A Z")){
                    points += 3;
                }
                else if(i.equals("B X")){
                    points += 1;
                }
                else if(i.equals("B Y")){
                    points += 5;
                }
                else if(i.equals("B Z")){
                    points += 9;
                }
                else if(i.equals("C X")){
                    points += 7;
                }
                else if(i.equals("C Y")){
                    points += 6;
                }
                else if(i.equals("C Z")){
                    points += 6;
                }
            }
        }
        System.out.println(points);
    }
}

//PART II of the puzzle

//import java.util.Scanner;
//
//public class RockPaperScissors {
//    public static void main(String[] args){
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Help me cheat. Give me the game winning strategy :)");
//        int points = 0;
//
//        while(scan.hasNextLine()){
//
//            Object i = scan.nextLine();
//            if(i.equals("")){
//                break;
//            }
//            if(scan.hasNextLine()){
//                if(i.equals("A X")){
//                    points += 3;
//                }
//                else if(i.equals("A Y")){
//                    points += 4;
//                }
//                else if(i.equals("A Z")){
//                    points += 8;
//                }
//                else if(i.equals("B X")){
//                    points += 1;
//                }
//                else if(i.equals("B Y")){
//                    points += 5;
//                }
//                else if(i.equals("B Z")){
//                    points += 9;
//                }
//                else if(i.equals("C X")){
//                    points += 2;
//                }
//                else if(i.equals("C Y")){
//                    points += 6;
//                }
//                else if(i.equals("C Z")){
//                    points += 7;
//                }
//            }
//        }
//        System.out.println(points);
//    }
//}
