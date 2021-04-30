package Enigma;

import static utility.Char_Int_changer.*;

// Is the individual plugs that are used to swap input into a output e.g. changing A->T
public class Plug {

    private char plug_in_char,plug_out_char;
    private int plug_in_int,plug_out_int;

    //constructor
    public Plug(char plug_in , char plug_out){
    this.plug_in_char  = plug_in_char;
    this.plug_out_char = plug_out_char;
    this.plug_in_int  = charToInt(plug_in_char);
    this.plug_out_int = charToInt(plug_out_char);
}

    // getters and setters
    public char getPlug_in_char() {
        return plug_in_char;
    }

    public void setPlug_in(char plug_in_char) {
        this.plug_in_char = plug_in_char;
    }

    public char getPlug_out_char() {
        return plug_out_char;
    }

    public void setPlug_out(char plug_out_char) {
        this.plug_out_char = plug_out_char;
    }

    public int getPlug_in_int() {
        return plug_in_int;
    }

    public void setPlug_in(int plug_in_int) {
        this.plug_in_int = plug_in_int;
    }

    public int getPlug_out_int() {
        return plug_out_int;
    }

    public void setPlug_out(int plug_out_int) {
        this.plug_out_int = plug_out_int;
    }


}
