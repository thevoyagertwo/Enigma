package Enigma;

import static utility.Char_Int_changer.*;

// Is the individual plugs that are used to swap input into a output e.g. changing A->T
public class Plug {

    private char plug_0_char,plug_1_char;
    private int plug_0_int,plug_1_int;

    //constructor
    public Plug(char plug_0_char , char plug_1_char){
    this.plug_0_char  = plug_0_char;
    this.plug_1_char = plug_1_char;
    // converts char to an int
    this.plug_0_int  = charToInt(plug_0_char);
    this.plug_1_int = charToInt(plug_1_char);
}

    // getters and setters
    public char getPlug_0_char() {
        return plug_0_char;
    }

    public void setPlug_in(char plug_0_char) {
        this.plug_0_char = plug_0_char;
    }

    public char getPlug_1_char() {
        return plug_1_char;
    }

    public void setPlug_out(char plug_1_char) {
        this.plug_1_char = plug_1_char;
    }

    public int getPlug_0_int() {
        return plug_0_int;
    }

    public void setPlug_in(int plug_0_int) {
        this.plug_0_int = plug_0_int;
    }

    public int getPlug_1_int() {
        return plug_1_int;
    }

    public void setPlug_out(int plug_1_int) {
        this.plug_1_int = plug_1_int;
    }


}
