package task3_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Person {
    String name;
    int age;
    String city;

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("John", 21, "Helsinki"));
        list.add(new Person("Dave", 34, "Vantaa"));
        list.add(new Person("Rose", 9, "Espoo"));
        list.add(new Person("Jade", 18, "Helsinki"));
        list.add(new Person("Roxy", 15, "Espoo"));
        list.add(new Person("Jane", 13, "Vantaa"));
        list.add(new Person("Dirk", 54, "Vantaa"));
        list.add(new Person("Jake", 28, "Vantaa"));

        System.out.println("Every Person: ");
        for (Person person : list) {
            System.out.println(person.name + " - " + person.age + " - " + person.city);
        }

        System.out.println("\nPeople sorted by age: ");
        list.sort(Comparator.comparingInt(person -> person.age));
        for (Person person : list) {
            System.out.println(person.name + " - " + person.age + " - " + person.city);
        }

        System.out.println("\nPeople sorted to only include whoever lives in Vantaa: ");
        list.removeIf(person -> !Objects.equals(person.city, "Vantaa"));
        for (Person person : list) {
            System.out.println(person.name + " - " + person.age + " - " + person.city);
        }

        System.out.println("\nPeople sorted to only include people whose name starts with J");
        list.removeIf(person -> !person.name.startsWith("J"));
        for (Person person : list) {
            System.out.println(person.name + " - " + person.age + " - " + person.city);
        }
    }
}