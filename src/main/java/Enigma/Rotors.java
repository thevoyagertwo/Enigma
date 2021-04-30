package Enigma;

import java.io.Serializable;

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

            default:
                this.cypher_char = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
                break;
        }
    }




    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getCypher() {
        return this.cypher_char;
    }

    public void setCypher(char[] cypher) {
        this.cypher_char = cypher;
    }

}
