package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Siemka swiecie");

//        tworze nowa instancje klasy BankAccount bez przekazania parametrow
        BankAccount kontoJadzi = new BankAccount();

//        definiuje nowa zmienna kasaJadzi i przypisuje do niej wartosc zwracana przez metode getCurrentBalance w instancj kontoJadzi
        int kasaJadzi=kontoJadzi.getAccountBalance();
        System.out.println("obecna ilosc na kontcie jadzi");
        System.out.println(kasaJadzi);

//definiuje nowa zmienna i przypisuje do niej nowe konkretne konto, ma rozpoczynajaca wartosc 20
        BankAccount kontoWerki = new BankAccount(20);

        //definiuje nowa zmienna i przypisuje obecna wartosc konta werki
        int kasaWerki=kontoWerki.getAccountBalance();
        System.out.println(kasaWerki);


        //sprawdzam czy werka moze wyjac 15
        System.out.println("Czy Werka moze wyciagnac 15");
        System.out.println(kontoWerki.withdraw(15));


        //sprawdzam czy werka moze wyjac 25
        System.out.println("Czy Werka moze wyciagnac 25");
        System.out.println(kontoWerki.withdraw(25));

//        dodaje do konta werki 20

        System.out.println("Dodaje do konta werki 20");
        kontoWerki.transfer(20);


        System.out.println("Ile teraz kasy ma werka");
        System.out.println(kontoWerki.getAccountBalance());
//        sprawdzam czy moze wyjac 25

        System.out.println("Czy Werka moze wyciagnac 25");
        System.out.println(kontoWerki.withdraw(25));
	// write your code here
    }
}
