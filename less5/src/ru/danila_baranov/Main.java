package ru.danila_baranov;

import ru.danila_baranov.OOPlesson5.Person;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Ingineer", "ivanovi@mail.ru","+798545315",30000,25);
        persArray[1] = new Person("Petrov Petr", "Programmer", "petrovp@mail.ru","+79354156",35000,29);
        persArray[2] = new Person("Sidorov Dmitrij", "Manager", "sidorovd@mail.ru","+795687811",37000,41);
        persArray[3] = new Person("Sergeeva Elena", "Director", "sergeevae@mail.ru","+797700700",300000,49);
        persArray[4] = new Person("Sidorova Marina", "Cleaning lady", "sidorovam@mail.ru","+7985456884",90000,41);

        for (int i = 0; i < 5; i++) {
            if (persArray[i].Age >40) persArray[i].InfoPerson(persArray[i]);
        }
    }

}
