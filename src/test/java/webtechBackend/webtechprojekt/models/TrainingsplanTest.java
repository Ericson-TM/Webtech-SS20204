package webtechBackend.webtechprojekt.models;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TrainingsplanTest {

    @Test
    void testTrainingsplanToString() {
        final Trainingsplan trainingsplan = new Trainingsplan(1, "Test", "12:00", "1h", 5);
        final String expected = "Trainingsplan(id=1, name=Test, zeit=12:00, dauer=1h, intensivitaet=5)";
        final String actual = trainingsplan.toString();
        assertEquals(expected, actual);
    }
}
