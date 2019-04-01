package pl.ls.schronisko.repository;

import org.springframework.stereotype.Repository;
import pl.ls.schronisko.models.Animal;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ShelterRepository {


    public List<Animal> animals = new ArrayList<>();

    public ShelterRepository() {
        add(new Animal("Azor", "Pies", "Mały łaciaty"));
        add(new Animal("Rudy", "Kot", "Fajny Kolorowy"));
    }

    public void add(Animal animal) {
        animal.setId(animals.size() + 1);
        animals.add(animal);
    }

    public Animal findByid(int id) {
        return animals.get(id - 1);
    }

    public List<Animal> findAll() {
        return animals;
    }

    public Animal getAnimal (int i){
        return animals.get(i);

    }


}
