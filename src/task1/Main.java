package task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Cars, Integer> cars = new HashMap<>();
        cars.put(new Cars("Audi A4"), 2013);
        cars.put(new Cars("Honda Civic"), 2020);
        cars.put(new Cars("Toyota Corolla"), 2015);
        System.out.println("Keys - " + cars.keySet());
        System.out.println("Values - " + cars.values());

    }
}
