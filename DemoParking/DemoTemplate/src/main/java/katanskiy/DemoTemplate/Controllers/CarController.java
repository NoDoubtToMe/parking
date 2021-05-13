package katanskiy.DemoTemplate.Controllers;


import java.util.List;
import katanskiy.DemoTemplate.Entities.Car;
import katanskiy.DemoTemplate.Services.CarService;
import katanskiy.DemoTemplate.objects.Parking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
class CarController {
    @Autowired
    CarService carService;
    @Autowired
    Parking parking;

    @GetMapping("/")
    public String index(Model model) {
        List<Car> cars = carService.findAll();
        int place = parking.getParkPlace();
        String message = "Hello!";
        model.addAttribute("message", message);
        model.addAttribute("place", place);
        model.addAttribute("cars", cars);
        return "index";
    }

    @GetMapping("/enter")
    public String carEntering(Model model) {
        boolean raiseBarrier = parking.carEnter();
        if(raiseBarrier == true){
            String message = "Thanks! Enter the parking.";
            model.addAttribute("message", message);
        }
        else{
            String message = "Sorry, there is no place on parking";
            model.addAttribute("message", message);
        }
        return "redirect:";
    }

    @PostMapping("/leaving")
    public String carLeaving() {
        parking.carAway();
        return "redirect:";
    }
}


