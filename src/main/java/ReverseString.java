public class ReverseString {
    String text;
    public ReverseString(String text) {
        if(text.isEmpty()){
            throw new IllegalArgumentException("String length is equal to 0");
        }
        this.text = text;
    }

    public String reversePassedString() {

        StringBuilder reversedString = new StringBuilder();

        for (int i = text.length(); i > 0; i--) {
            reversedString.append(text.charAt(i - 1));
        }

        return reversedString.toString();
    }
}
