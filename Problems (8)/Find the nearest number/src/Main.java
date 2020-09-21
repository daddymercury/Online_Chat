import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String inputArrey = scanner.nextLine();
    int numberN = scanner.nextInt();
    String[] arrayOfStringDigits = inputArrey.split(" ");
    int size = arrayOfStringDigits.length;
    int[] arrayOfDigits = new int[size];
    for(int i = 0; i < size; i++) {
        arrayOfDigits[i] = Integer.parseInt(arrayOfStringDigits[i]);
    }

        int min = getMin(arrayOfDigits);
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        for(int i = 0; i < arrayOfDigits.length; i++) {
            if(Math.abs(numberN - arrayOfDigits[i]) == min) {
           listOfIntegers.add(arrayOfDigits[i]);
            }
        }

        Collections.sort(listOfIntegers);

        for (int value : listOfIntegers) {
            System.out.print(value + " ");
        }

    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }


}
