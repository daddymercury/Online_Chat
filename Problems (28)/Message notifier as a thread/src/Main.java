class MessageNotifier extends Thread {

    String inputString;
    int countOfRepeats;

    public MessageNotifier(String msg, int repeats) {
        inputString = msg;
        countOfRepeats = repeats;
    }

    @Override
    public void run() {
        for (int i = 0; i < countOfRepeats; i++) {
            System.out.println(inputString);
        }
    }
}