package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService service;

    @Value("${max.car}")
    private int maxCar;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping()
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count >= maxCar) {
            model.addAttribute("cars", service.getCars());
        }else {
            model.addAttribute("cars", service.getCars(count));
        }
        return "cars";
    }
}