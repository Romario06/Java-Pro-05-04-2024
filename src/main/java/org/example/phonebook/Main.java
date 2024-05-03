package org.example.phonebook;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addRecord("Кевін Бейкон", "1234567890");
        phoneBook.addRecord("Метт Діллон", "0987654321");
        phoneBook.addRecord("Джим Керрі", "0980945689");
        phoneBook.addRecord("Майкл Кітон", "9876543210");
        phoneBook.addRecord("Вуді Харрельсонн", "9876543210");
        phoneBook.addRecord("Джеймс Вудс", "9876543210");
        phoneBook.addRecord("Джим Керрі", "00459876543210");
        phoneBook.addRecord("Джим Керрі", "98765345610");

        phoneBook.findAndPrint("Джеймс Вудс");
        phoneBook.findAndPrintAll("Джим Керрі");
    }
}

