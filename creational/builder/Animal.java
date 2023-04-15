package creational.builder;

public class Animal {

    private String name;
    private String owner;
    private Double weight;
    private Double height;
    private Integer age;

    //getter and setter

    //Private constructor to avoid the usage outside the builder
    private Animal(String name, String owner, Double weight, Double height, Integer age) {
        this.name = name;
        this.owner = owner;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public static class AnimalBuilder {
        private String name;
        private String owner;
        private Double weight;
        private Double height;
        private Integer age;

        public AnimalBuilder(){

        }

        public AnimalBuilder name(String name){
            this.name = name;
            return this;
        }

        public AnimalBuilder owner(String owner){
            this.owner = owner;
            return this;
        }

        public AnimalBuilder weight(Double weight){
            this.weight = weight;
            return this;
        }

        public AnimalBuilder height(Double height){
            this.height = height;
            return this;
        }

        public AnimalBuilder age(Integer age){
            this.age = age;
            return this;
        }

        public Animal build(){
            return new Animal(name, owner, weight, height, age);
        }
    }
}
