package pl.ls.schronisko.controlls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.ls.schronisko.models.Animal;
import pl.ls.schronisko.repository.ShelterRepository;

import java.util.List;


@Controller
public class ShelterConrtoller {

    private  ShelterRepository shelterRepository;

    public ShelterConrtoller(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    @PostMapping("/powitanie")
    public String form(@RequestParam(name = "imie") String name,
                       @RequestParam(name = "gatunek") String species,
                       @RequestParam(name = "opis") String description) {

        Animal animal = new  Animal(name, species, description);
        shelterRepository.add(animal);
        return "zapisane";
    }

    @GetMapping("/lista")
    public String animalsList(Model model) {
        List<Animal> all = shelterRepository.findAll();
        model.addAttribute("allAnimals",all);
        return "zwierzatka";
    }

    @GetMapping("/1")
    public String azor(Model model){
        System.out.println("AZOR");
        model.addAttribute("animal", shelterRepository.findByid(1) );
        return "azor";
    }

    @GetMapping("/1")
    public String rudy(Model model){
        System.out.println("RUDY");
        model.addAttribute("animal", shelterRepository.findByid(2) );
        return "rudy";
    }


//
//    @GetMapping("/ind")
////    @ResponseBody
//    public String index(){
//
//        return "redirect:/index.thml";
//    }

}
