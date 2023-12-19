package task2;

import java.util.HashMap;

public class Contacts {

    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("John", 842334985);
        contacts.put("Paul", 776311988);
        contacts.put("Peter", 499824477);
        contacts.put("Jacob", 556288323);
        System.out.println("Names: " + contacts.keySet());
        System.out.println("Phone number: " + contacts.values());
    }
}
