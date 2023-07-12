package org.lessons.java.security;

import java.util.Scanner;

/*
    _Il programma deve salvare in opportuni variabili il nome, cognome, colore
    preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero)
    _Generare (e stampare a video) una password concatenando nome, cognome, colore preferito
    e somma di giorno, mese e anno di nascita, separate dal carattere "-".
    ESEMPIO:Pinco-Pallo-magenta-2011
    BONUS:utilizzare la classe java.util.Scanner per leggere i dati dell’utente da tastiera
 */
public class PasswordGenerator {
    public static void main(String[] args) {

    //Parte BONUS: Dichiaro uno scanner da tastiera
        Scanner scanInfoUser = new Scanner (System.in);

    //Dichiariamo le variabili
        String nameUser;
        String surnameUser;
        String favoriteColorUser;
        //Dichiariamo la data di nascita
        int dayOfBirthUser;
        int monthOfBirthUser;
        int yearOfBirthUser;

        /* Esercizio finito, metto questa parte a commento per poter procedere con il BONUS
        //Assegiamo valori alle variabili
        nameUser = "Renato";
        surnameUser = "Valdivia";
        favoriteColorUser ="Verde";
        dayOfBirthUser = 27;
        monthOfBirthUser = 9;
        yearOfBirthUser = 1999;
        */

        //Parte BONUS: Chiediamo le informazioni al nostro utente
            //Chiediamo il nome
            System.out.println("Inserisci il tuo nome:");
            nameUser = scanInfoUser.nextLine();
            //Chiediamo il cognome
            System.out.println("Inserisci il tuo cognome: ");
            surnameUser = scanInfoUser.nextLine();
            //Chiediamo il colore preferito
            System.out.println("Inserisci il tuo colore preferito:");
            favoriteColorUser = scanInfoUser.nextLine();
            //Cominciamo a chiedere la data di nascita in ordine giorno, mese e anno
                //Parte giorno
                System.out.println("Inserisci il numero di giorno della tua data di nascita:");
                dayOfBirthUser = scanInfoUser.nextInt();
                //Parte mese
                System.out.println("Inserire il numero del tuo mese:");
                monthOfBirthUser = scanInfoUser.nextInt();
                //Parte anno
                System.out.println("Inserisci il tuo anno di nascita:");
                yearOfBirthUser= scanInfoUser.nextInt();


        //Dichiariamo la variabile contenente la somma della data di nascita dell'utente
        int somDateUser = dayOfBirthUser + monthOfBirthUser + yearOfBirthUser;

        //Mandiamo la nostra password a video

        System.out.println("La tua password è: " + nameUser + "-" + surnameUser + "-" + favoriteColorUser + "-" + somDateUser);


    }
}
