import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> integerList = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
        List<String> numberOfSwaps = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
        List<String> indexes1 = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
        List<String> indexes2 = Arrays.asList(new Scanner(System.in).nextLine().split(" "));

        Collections.swap(integerList, Integer.parseInt(indexes1.get(0)),
                Integer.parseInt(indexes1.get(1)));

        Collections.swap(integerList, Integer.parseInt(indexes2.get(0)),
                Integer.parseInt(indexes2.get(1)));

        for(String tmp:integerList) {
            System.out.print(tmp + " ");
        }

    }
}