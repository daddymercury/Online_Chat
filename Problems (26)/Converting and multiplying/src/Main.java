import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        List<String> stringAfterMethod = new ArrayList<>();
        stringAfterMethod = makeAnArray();
        stringAfterMethod.remove("0");
        for (String tmp : stringAfterMethod) {
            arrayOfString10(tmp);
        }
        }

        static String arrayOfString10 (String str) {
        int digit = 0;
            try {
                digit = Integer.parseInt(str) * 10;
                System.out.println(digit);
            }catch (Exception e) {
                System.out.println("Invalid user input: " + str);
            }
            return "";
        }

        static List<String> makeAnArray() {
            List<String> inputString = new ArrayList<>();
            String elem = "";
            do {
                List<String> inputStrings = Arrays.stream(new Scanner(System.in).nextLine().split("\\s"))
                        .collect(Collectors.toList());
                elem = inputStrings.get(inputStrings.size() - 1).toString();
                inputString.add(elem);
            } while (!elem.equals("0"));
            return inputString;
        }
    }
