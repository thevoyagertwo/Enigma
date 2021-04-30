package Enigma;

import java.io.Serializable;

import static utility.Char_Int_changer.charArrayToIntArray;

public class Rotors {

    private String name;     // name of the rotor cypher: https://en.wikipedia.org/wiki/Enigma_rotor_details
    private char[] cypher_char; // contains the scrambled alphabet as char
    private int[] cypher_int;   // contains the scrambled alphabet as int

    public Rotors(String name) {
        this.name = name;
        switch (name) {
            case "I":
                this.cypher_char = new char[]{'E', 'K', 'M', 'F', 'L', 'G', 'D', 'Q', 'V', 'Z', 'N', 'T', 'O', 'W', 'Y', 'H', 'X', 'U', 'S', 'P', 'A', 'I', 'B', 'R', 'C', 'J'};
                break;

            case "II":
                this.cypher_char = new char[]{'A', 'J', 'D', 'K', 'S', 'I', 'R', 'U', 'X', 'B', 'L', 'H', 'W', 'T', 'M', 'C', 'Q', 'G', 'Z', 'N', 'P', 'Y', 'F', 'V', 'O', 'E'};
                break;

            case "III":
                this.cypher_char = new char[]{'B' ,'D', 'F', 'H', 'J', 'L', 'C', 'P', 'R', 'T', 'X', 'V', 'Z', 'N', 'Y', 'E', 'I', 'W', 'G', 'A', 'K', 'M', 'U', 'S', 'Q', 'O'};
                break;

            case "IV":
                this.cypher_char = new char[]{'E', 'S', 'O', 'V', 'P', 'Z', 'J', 'A', 'Y', 'Q', 'U', 'I', 'R', 'H', 'X', 'L', 'N', 'F', 'T', 'G', 'K', 'D', 'C', 'M', 'W', 'B'};
                break;

            case "V":
                this.cypher_char = new char[]{'V', 'Z', 'B', 'R', 'G', 'I', 'T', 'Y', 'U', 'P', 'S', 'D', 'N', 'H', 'L', 'X', 'A', 'W', 'M', 'J', 'Q', 'O', 'F', 'E', 'C', 'K'};
                break;

            default:
                this.cypher_char = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                break;
        }

        this.cypher_int = charArrayToIntArray(cypher_char);

    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getCypher_char() {
        return this.cypher_char;
    }

    public void setCypher_char(char[] cypher_char) {
        this.cypher_char = cypher_char;
    }
    public int[] getCypher_int() {
        return this.cypher_int;
    }

    public void setCypher_int(int[] cypher_int) {
        this.cypher_int = cypher_int;
    }
}
