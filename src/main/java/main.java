import Enigma.Rotors;
import utility.Char_Int_changer;

import static java.lang.Character.*;
import static utility.Char_Int_changer.*;

public class main {

    public static void main(String[] args){

        Rotors rotorI = new Rotors("I");
        System.out.println(rotorI.getCypher_char()[2]);
        System.out.println(charToInt(2));

        char aa = 'b';
        System.out.println(charArrayToIntArray(rotorI.getCypher_char())[2] );

    }

}
