package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Service;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carModel(@RequestParam (defaultValue = "5") int count, Model carModel) {
        Service service = new Service();
        carModel.addAttribute("Cars",service.getCarList(count));
        return "cars";
    }
}
