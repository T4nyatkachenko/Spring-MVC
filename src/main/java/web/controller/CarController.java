package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0") Integer count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";

    }
}
