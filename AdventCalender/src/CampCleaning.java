import java.util.Scanner;

public class CampCleaning {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("What's in your bag? :)");
        Integer goodPair = 0;
        Integer badPair = 0;

        while(scan.hasNextLine()){
            String temp = scan.nextLine().replace("-", " ");
            if (temp.equals("")) {
                break;
            }
            else{
                String temp2 = temp.replace("-", " ");
                String temp3 = temp2.replace(",", " ");
                Scanner scan2 = new Scanner(temp3);
                Integer first = Integer.parseInt(scan2.next());
                Integer second = Integer.parseInt(scan2.next());
                Integer third = Integer.parseInt(scan2.next());
                Integer fourth = Integer.parseInt(scan2.next());

//              if((third >= first && fourth <= second) || (third<=first && fourth>=second)){ //Part I
                if(first <= fourth && second >= third) { //Part 2
                    badPair += 1;
                }
                else{
                    goodPair += 1;

                }
            }
        }
        System.out.println("Number of paired elves that are good to go " + goodPair);
        System.out.println("Number of paired elves that are not good to go " + badPair);
    }
}
