package pl.ls.schronisko.controlls;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.ls.schronisko.models.Animal;
import pl.ls.schronisko.repository.ShelterRepository;

import java.util.List;

@Controller
public class HomeControlls {

    public HomeControlls(ShelterRepository shelterRepository) {
        this.shelterRepository = shelterRepository;
    }

    private ShelterRepository shelterRepository;


    @GetMapping("/")
    public String home(Model model){
        System.out.println("Odpaliło");
        List<Animal> all = shelterRepository.findAll();
        model.addAttribute("allAnimals",all);
        return "start";
        //  return "redirect:/home.html";
    }




}
