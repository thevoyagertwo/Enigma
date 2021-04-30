package utility;

public class Char_Int_changer {

    // converts Int to upper case char using: Int +64 so that A = 1, B=2 ...
    public static char charToInt(int i) {
        return (char) (i+64) ;
    }

    // converts char to upper case then returns ASCII value -64 so that A = 1, B=2 ...
    public static int IntToChar(char character){
        return  (int) Character.toUpperCase(character) -64;
    }

    public static int[] charArrayToIntArray(char[] cypher_char){
        int[] cypher_int = new int[cypher_char.length];
        for (int i = 0 ; i < cypher_char.length ; i++){
            cypher_int[i] = IntToChar(cypher_char[i]);
        }
        return cypher_int;
    }

    public static char[] intArrayToCharArray(int[] cypher_int){
        char[] cypher_char = new char[cypher_int.length];
        for (int i = 0 ; i < cypher_char.length ; i++){
            cypher_char[i] = (char) charToInt(cypher_int[i]);
        }
        return cypher_char;
    }

}
