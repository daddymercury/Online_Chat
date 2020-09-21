package chat;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (scanner.hasNextLine()) {
            Message nextMessage = new Message(scanner.nextLine());
            if ("sent".equals(nextMessage.action)) {
                System.out.println((nextMessage.participantName + ": " + nextMessage.message).trim());
            }
        }
    }
}

class Message {
    String participantName;
    String action;
    String message;

    Message(String rawMessage) {
        List<String> fields = Arrays.stream(rawMessage.split("\\s+")).collect(Collectors.toList());
        participantName = fields.get(0);
        action = fields.get(1);
        StringBuilder messageBuilder = new StringBuilder();
        for (int i = 2; i < fields.size(); i++) {
            messageBuilder.append(fields.get(i)).append(" ");
        }
        message = messageBuilder.toString();
    }
}
