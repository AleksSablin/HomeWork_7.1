public class MainString {
    private char[] characters;
    private int length;

    public MainString() {
        characters = new char[0];
        length = 0;
    }

    public MainString(String str) {
        characters = str.toCharArray();
        length = characters.length;
    }

    public MainString(char c) {
        characters = new char[]{c};
        length = 1;
    }

    public int getLength() {
        return length;
    }

    public void clear() {
        characters = new char[0];
        length = 0;
    }

    public boolean contains(char c) {
        for (char character : characters) {
            if (character == c) {
                return true;
            }
        }
        return false;
    }
}
