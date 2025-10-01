/*
__________        _____                           ___________            .__
\______   \ _____/ ____\____  ______ ____  ____   \_   _____/ ___________|__| ____  ____
 |       _// __ \   __\/  _ \/  ___// ___\/  _ \   |    __)_ /    \_  __ \  |/ ___\/  _ \
 |    |   \  ___/|  | (  <_> )___ \\  \__(  <_> )  |        \   |  \  | \/  \  \__(  <_> )
 |____|_  /\___  >__|  \____/____  >\___  >____/  /_______  /___|  /__|  |__|\___  >____/
        \/     \/                \/     \/                \/     \/              \/
Studente: Refosco Enrico
Classe: 5BII
Materia: TPSIT
Data: 01/10/2025
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci sequenza: ");
        String sequence = input.nextLine();

        System.out.print("Inserisci chiave: ");
        String chiave = input.nextLine();

        String[] Skeys = chiave.split(" ");
        int[] keys = new int[Skeys.length];                 // keys lo passo a Lettera
        for(int i = 0; i < Skeys.length; i++){
            keys[i] = Integer.parseInt(Skeys[i]);
        }

        String crypted = new String();
        int j = 0;
        for(int i = 0; i < sequence.length(); i++) {
            Lettera LetteraOriginale = new Lettera(sequence.codePointAt(i), keys[j]);
            Lettera LetteraCriptata = LetteraOriginale.trasla('+');
            crypted += (char)LetteraCriptata.code;
            if(j == Skeys.length - 1){
                j = 0;
            } else {
                j++;
            }
        }
        System.out.println(crypted);
    }
}