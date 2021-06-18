package com.company;

// definicja publicznej klasy BancAccount - szablon
public class BankAccount {

// zmienna typu liczbowego, która bedzie reprezentować ilość pieniędzy
    private int accountBalance;


//konstruktor bezparemetrowy - konstruktor uruchamia sie przy tworzeniu instacji klasy
    // w naszym przypadku to konkretne konto - jadzia, werka;
    // konstruktor to funkcja ktora nazywa sie jak klasa,
    BankAccount(){
        accountBalance = 0;
        System.out.println("konstruktor sie odpalil");
    }

    //konstruktor z parametrem liczbowym o nazwie startingammount
    //ustawia poczatkowa wartosc accountbalance na przekazana wartosc w argumencie
    BankAccount(int startingAmount){
        accountBalance = startingAmount;
        System.out.println("odpallil sie drugi konstruktor");

    }

//publiczna metoda zwracajac booleanm ktora przyjmuje liczbe i zwraca czy mozna wybrac
    //taka ilosc pieniedzy
    public boolean withdraw(int amount){
        if(amount > accountBalance){
            return false;
        }
        else {
            return true;
        }
    }

    //publiczna metoda nie zwracajaca wartosci, przyjmuje zmienna liczbowa ammount,
    //zwieksza aktualny stan konta o podana wartosc
    public void transfer(int amount){
        accountBalance = accountBalance + amount;
    }

//publiczna metoda zwracacaja aktualna wartosc konta
    public int getAccountBalance(){
        return accountBalance;
    }



}
