package com.denizburcuaydin.objects;

public class Dog {
    private String name;
    private String age;
    private String species;

    public void bark() {
        System.out.println("Woof woof");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
