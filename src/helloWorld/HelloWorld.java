package helloWorld;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class HelloWorld {
    public static void main(String [] args){
        String hilse,wish;

        hilse = "Hello World!";
        wish = "Hope you have a nice day!";

        String ut = hilse+"\n"+wish;
        System.out.print(ut);

        String innNavn = showInputDialog("Skriv inn navnet ditt");
        String innAdresse = showInputDialog("Skriv inn adressen din");
        String innBy = showInputDialog("Hvilken by bor du i?");
        String innPostNr = showInputDialog("Skriv inn Postnummer ditt");
        String innEpost = showInputDialog("Skriv inn Epost din");
        String innTelefon = showInputDialog("Skriv inn telefonnummeret ditt");

       // showMessageDialog(null,innNavn+" Har adressen "+innAdresse);

        String Ut = "Navn    : "+innNavn+"\n"+
                    "Adresse : "+innAdresse+" "+innPostNr+" "+innBy+"\n"+
                    "E-post  : "+innEpost+"\n"+
                    "Mobil   : "+innTelefon;

                showMessageDialog(null,Ut);


    }

}
