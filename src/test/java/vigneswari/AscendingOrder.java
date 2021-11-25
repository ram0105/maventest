package vigneswari;

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner sObj = new Scanner(System.in);
        System.out.println("Enter the number ");
        int givenNumber = sObj.nextInt();

        String n = Integer.toString(givenNumber);
        int numberOfDigit = n.length();
        //System.out.print(n);
        int[] tempArray = new int[numberOfDigit];
        int k = 0;
        while (givenNumber != 0) {
            int tempNumber = givenNumber % 10;
            tempArray[k++] = tempNumber;
            givenNumber = givenNumber / 10;
        }
        //BEFORE SORTING
       /* for(int j : tempArray){
            System.out.print(j + ",");
        }*/

        // SORTING IN ASCENDING ORDER
        for (int i = 0; i < numberOfDigit; i++)
            for (int j = i + 1; j < numberOfDigit; j++) {
                if (tempArray[i] > tempArray[j]) {
                    int tempVar = tempArray[j];
                    tempArray[j] = tempArray[i];
                    tempArray[i] = tempVar;
                }

            }
        //AFTER SORTING
        /*for(int i : tempArray){
        System.out.println(i);
        }*/

        StringBuffer stringObj = new StringBuffer();
        for (int i : tempArray) {
            stringObj = stringObj.append(i);
        }
        int sortedNumber = Integer.parseInt(stringObj.toString());

        System.out.println("The sorted ascending number is " + sortedNumber);
    }
}