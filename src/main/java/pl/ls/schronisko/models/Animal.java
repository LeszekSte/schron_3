package pl.ls.schronisko.models;

import java.util.Objects;

public class Animal {
    private int id;
    private String name;
    private String species;
    private String description;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    private String picture;

    public Animal() {
    }


    public Animal(String name, String species, String description) {
        this.name = name;
        this.species = species;
        this.description = description;
    }

    public Animal(int id, String name, String species, String description, String picture) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.description = description;
        this.picture = picture;
    }



    public Animal(int id, String name, String species, String description) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                Objects.equals(name, animal.name) &&
                Objects.equals(species, animal.species) &&
                Objects.equals(description, animal.description) &&
                Objects.equals(picture, animal.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, species, description, picture);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", description='" + description + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
