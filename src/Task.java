import java.util.Scanner;
import java.util.Random;
public class Task {
    static void main() {

        //PART ONE

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int [] dataPoints = new int[100];
        int dataSum = 0;
        double dataAvg;
        int dataMax;
        int dataMin;

        //puts everything into array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100)+1;
        }

        //print array
        for(int x : dataPoints) {
            System.out.print(x + " | ");
        }

        //calculating sum, avg, max, and min
        for (int x : dataPoints) {
            dataSum += x;
        }
        dataAvg = (double) dataSum / 100;

        dataMax = dataPoints[0];
        for (int x : dataPoints) {
            if (x > dataMax) {
                dataMax = x;
            }
        }

        dataMin = dataPoints[0];
        for (int x : dataPoints) {
            if (x < dataMin) {
                dataMin = x;
            }
        }

        System.out.println("\nThe sum of the data is " + dataSum);
        System.out.println("The average of the data is " + dataAvg);
        System.out.println("The largest data point is " + dataMax);
        System.out.println("The smallest data point is " + dataMin);

        /*----------------------------------------------------------------------------------------------------
        PART TWO
        ----------------------------------------------------------------------------------------------------*/

        int userInt = InputHelper.getRangedInt(scan, "Pick a number between 1-100 to count how many times that number appears in the data.", 1, 100);
        int timesFound = 0;
        int position = -1;
        boolean intFound = false;

        for (int x : dataPoints) {
            if (x == userInt) {
                timesFound += 1;
            }
        }
        System.out.println("The value " + userInt + " was found " + timesFound + " times in the array.");


        userInt = InputHelper.getRangedInt(scan, "Pick a number between 1-100 to search for the first occurrence of it in the data.", 1, 100);
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInt) {
                intFound = true;
                position = i;
                break;
            }
        }
        if (intFound) {
            System.out.println("The value " + userInt + " was found at array index " + position + ".");
        }
        else {
            System.out.println("The value " + userInt + " doesn't appear in the array.");
        }


    }
}
