package utility;

public class Char_Int_changer {

    // converts Int to upper case char using: Int +64 so that A = 1, B=2 ...
    public static String getCharForInt(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }

    // converts char to upper case then returns ASCII value -64 so that A = 1, B=2 ...
    public static int getIntForChar(char character){
        return  (int) Character.toUpperCase(character) -64;
    }
}
