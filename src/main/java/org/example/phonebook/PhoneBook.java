package org.example.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void addRecord(String name, String phoneNumber) {
        Record record = new Record(name, phoneNumber);
        records.add(record);
    }

    // Search for a record (or records) for them
    private List<Record> find(String name, boolean printAll) {
        List<Record> foundRecords = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equalsIgnoreCase(name)) {
                foundRecords.add(record);
            }
        }
        if (foundRecords.isEmpty()) {
            System.out.println("Записів для " + name + " не знайдено.");
        } else {
            if (printAll) {
                System.out.println("Знайдено наступні записи для " + name + ":");
                for (Record record : foundRecords) {
                    System.out.println(record.getPhoneNumber());
                }
            } else {
                System.out.println("Знайдено запис для " + name + ": " + foundRecords.get(0).getPhoneNumber());
            }
        }
        return foundRecords.isEmpty() ? null : foundRecords;
    }

    public void findAndPrint(String name) {
        find(name, false);
    }

    public void findAndPrintAll(String name) {
        find(name, true);
    }
}
