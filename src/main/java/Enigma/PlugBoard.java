package Enigma;
import static Enigma.Plug.*;
import static utility.Char_Int_changer.charArrayToIntArray;

import java.util.ArrayList;

public class PlugBoard {

    // List of plug objects
    public ArrayList<Plug> plugs;

    //array of char/int where {{a,b},{c,d}} a swaps with c and b swaps with d
    char[][] plugBoardArray_char;
    int[][] plugBoardArray_int;

    // bare Constructor
    public PlugBoard(char[][] plugBoardArray_char){
        // stores array for easier use later as I am not sure if using the objects will be optimal in actual encryption
        this.plugBoardArray_char = plugBoardArray_char;

        // stores input array as int version using changer
        int[][] plugBoardArray_int = new int[2][plugBoardArray_char[0].length];
        for (int i = 0; i < plugBoardArray_char[0].length ; i++) {
            plugBoardArray_int[i] = charArrayToIntArray(plugBoardArray_char[i]);
        }

        // makes Plug array
        plugs = new ArrayList<Plug>();
        for (int i = 0; i < plugBoardArray_char[0].length ; i++){
            // adds new Plug object to Plug array list, using the data given from the input to the constructor (plugBoardArray_char[][])
            plugs.add(new Plug(plugBoardArray_char[0][i], plugBoardArray_char[1][i]) );

            System.out.println(plugBoardArray_int[0][i] + " " + plugBoardArray_char[1][i] + " " + plugBoardArray_char[0].length);
        }
        System.out.println(plugBoardArray_char[1][1] + " this");
    }

    public int plugBoardSwap_int(int input){
        // sets output as input incase there is no swap made
        int output = input;

        return output;
    }

}
