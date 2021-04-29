import Enigma.Rotors;

public class main {

    public static void main(String[] args){

        Rotors rotorI = new Rotors("I");
        System.out.println(rotorI.getCypher()[2]);
        System.out.println(getCharForNumber(2));

    }

    private static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 64)) : null;
    }

}
