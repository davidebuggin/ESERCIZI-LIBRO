package EserciziLibro;


import prog.io.*;
//import prog.utili.*;

public class ex3_2 {
 
    public static void main(String[] args) {

        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();

        String nome = in.readLine("Inserisci il tuo nome ");
        String cognome = in.readLine("Inserisci il tuo cognome ");

        out.println("**********");
        out.println("*" + "        " + "*");
        out.println("* " + nome + " *");
        out.println("*" + "        " + "*");
        out.println("* " + cognome + " *");
        out.println("**********");

    }   
}
