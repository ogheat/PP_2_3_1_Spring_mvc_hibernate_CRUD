package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceimpl;


@Controller
public class CarController {

    private final CarServiceimpl carServiceimpl;

    @Autowired
    public CarController(CarServiceimpl carServiceimpl) {
        this.carServiceimpl = carServiceimpl;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "0") int count, Model model) {
        if (count >= 5 || count == 0) {
            model.addAttribute("cars", carServiceimpl.getList(5));
            return "carlist";
        } else if (count <= 5 && count > 0) {
            model.addAttribute("cars", carServiceimpl.getList(count));
            return "carlist";
        } else {
            return "error";
        }
    }
}
