package org.lessons.java.security;
/*
    _Il programma deve salvare in opportuni variabili il nome, cognome, colore
    preferito e data di nascita di un utente suddivisa in giorno, mese e anno (in numero)
    _Generare (e stampare a video) una password concatenando nome, cognome, colore preferito
    e somma di giorno, mese e anno di nascita, separate dal carattere "-".
    ESEMPIO:Pinco-Pallo-magenta-2011
 */
public class PasswordGenerator {
    public static void main(String[] args) {
    //Dichiariamo le variabili
        String nameUser;
        String surnameUser;
        String favoriteColorUser;
        //Dichiariamo la data di nascita
        int dayOfBirthUser;
        int monthOfBirthUser;
        int yearOfBirthUser;

        //Assegiamo valori alle variabili
        nameUser = "Renato";
        surnameUser = "Valdivia";
        favoriteColorUser ="Verde";
        dayOfBirthUser = 27;
        monthOfBirthUser = 9;
        yearOfBirthUser = 1999;

        //Dichiariamo la variabile contenente la somma della data di nascita dell'utente
        int somDateUser = dayOfBirthUser + monthOfBirthUser + yearOfBirthUser;

        //Mandiamo la nostra password a video

        System.out.println("La tua password è: " + nameUser + "-" + surnameUser + "-" + favoriteColorUser + "-" + somDateUser);


    }
}
