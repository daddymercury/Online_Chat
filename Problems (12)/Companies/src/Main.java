import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split(" ");
        for(String item : stringArray) {
            arrayList.add(item);
        }
        System.out.println(arrayList);
    }
}