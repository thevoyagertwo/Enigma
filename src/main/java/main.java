import Enigma.PlugBoard;
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


        //array of char/int where {{a,b},{c,d}} a swaps with c and b swaps with d
        char[][] plugBoardArray_char = {{'A', 'B'}, {'D', 'C'}};
        PlugBoard plugBoard = new PlugBoard(plugBoardArray_char);

        System.out.println(plugBoard.plugs.get(1).getPlug_in_char() + " s");


    }

}
