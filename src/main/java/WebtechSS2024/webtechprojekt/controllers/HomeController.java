package WebtechSS2024.webtechprojekt.controllers;

import WebtechSS2024.webtechprojekt.models.Trainingsplan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController {

    private final List<Trainingsplan> trainingsplanList = new ArrayList<>();

    public HomeController() {
        trainingsplanList.add(new Trainingsplan("2:00", "3", 4, 1));
        trainingsplanList.add(new Trainingsplan("2:00", "4", 4, 1));
        trainingsplanList.add(new Trainingsplan("2:15", "3", 3, 2));
        trainingsplanList.add(new Trainingsplan("2:15", "3", 3, 3));
    }

    @GetMapping(path = "/trainingsplaene")
    public ResponseEntity<List<Trainingsplan>> getTrainingsplaene() {
        return ResponseEntity.ok(trainingsplanList);
    }

}
