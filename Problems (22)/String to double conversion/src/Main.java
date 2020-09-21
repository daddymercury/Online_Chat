class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        double answer = 0;
        try {
            answer = Double.parseDouble(input);
        } catch (Exception e) {
            answer = 0;
        }
        return answer;
    }


}