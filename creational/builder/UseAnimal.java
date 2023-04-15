package creational.builder;


public class UseAnimal {

    //The important thing of the builder pattern is the variety of combination of object that you can create without having any combination of constructor
    public static void main(String[] args) {

        Animal strayAnimal = new Animal.AnimalBuilder().name("wonderfulKitten").age(1).build();

        Animal veryLargeAnimal = new Animal.AnimalBuilder().owner("veryLargeAnimalOwner").height(100.0).weight(50.0).age(6).build();

    }
}
