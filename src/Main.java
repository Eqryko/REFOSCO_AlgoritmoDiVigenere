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
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("ALGORITMO DI VIGENERE \nInserisci sequenza: ");
        String sequence = input.nextLine();

        String chiave = new String();
        String[] Skeys;
        int[] keys;
        try{
            Boolean vero = false;
            do{
                vero = false;
                System.out.print("Inserisci chiave (ogni NUMERO separato da uno SPAZIO): ");
                chiave = input.nextLine();
                Skeys = chiave.split(" ");
                keys = new int[Skeys.length];                 // keys lo passo a Lettera
                for(int i = 0; i < Skeys.length; i++){
                    keys[i] = Integer.parseInt(Skeys[i]);
                    if(keys[i] < 0 || keys[i] > 26) vero = true;
                }
            } while(vero);
        } catch (Exception e) {
            throw new Exception("Inserisci solo numeri.");
        }

        String crypted = new String();
        int j = 0;
        for(int i = 0; i < sequence.length(); i++) {
            Lettera LetteraOriginale = new Lettera(sequence.codePointAt(i), keys[j]);
            Lettera LetteraCriptata = LetteraOriginale.trasla('+');
            crypted += (char)LetteraCriptata.code;
            if(j == Skeys.length - 1) j = 0;
            else j++;
        }
        System.out.println(crypted);
    }
}