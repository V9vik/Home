package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new org.example.PersonBuilder()
                .setName("Антошка")
                .setSurname("Лопатов")
                .setAge(48)
                .build();

        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Age: " + person.getAge());

        person.setAddress("Москва");
        System.out.println("Address: " + (person.hasAddress() ? person.getAddress() : "Unknown"));
        try {
            PersonBuilder childBuilder = new PersonBuilder();
            Person child = childBuilder
                    .setName("Машенка")
                    .setAge(8)
                    .build();
            System.out.println("\nChild:");
            System.out.println("Name: " + child.getName());
            System.out.println("Surname: " + child.getSurname());
            System.out.println("Age: " + child.getAge());
            System.out.println("Address: " + (child.hasAddress() ? child.getAddress() : "Unknown"));
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }



    }
}