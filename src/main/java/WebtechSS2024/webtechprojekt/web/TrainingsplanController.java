package WebtechSS2024.webtechprojekt.web;

import WebtechSS2024.webtechprojekt.models.Trainingsplan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "/trainingsplan")
public class TrainingsplanController {

    private final List<Trainingsplan> trainingsplanList = new ArrayList<>();

    public TrainingsplanController() {}

    @GetMapping(path = "/trainingsplan")
    public ResponseEntity<List<Trainingsplan>> getTrainingsplaene() {

        return ResponseEntity.ok(trainingsplanList);
    }

}
