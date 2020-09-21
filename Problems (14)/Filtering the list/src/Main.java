import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .collect(Collectors.toList());

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerModerList = new ArrayList<>();

        for (String tmp:list) {
            integerList.add(Integer.parseInt(tmp));
        }

        for (int i = 0; i < integerList.size(); i++) {
            if (i == 0 || i % 2 == 0) {
                continue;
            }
            integerModerList.add(integerList.get(i));
        }
        for (int i = integerModerList.size() - 1; i >= 0; i--) {
            System.out.print(integerModerList.get(i) + " ");
        }
    }
}