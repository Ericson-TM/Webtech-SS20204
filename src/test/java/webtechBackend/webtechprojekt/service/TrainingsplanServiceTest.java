package webtechBackend.webtechprojekt.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import webtechBackend.webtechprojekt.models.Trainingsplan;
import webtechBackend.webtechprojekt.persistence.TrainingsplanRepository;

import java.util.List;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class TrainingsplanServiceTest {

    @Autowired
    private TrainingsplanService trainingsplanService;

    @MockBean
    private TrainingsplanRepository trainingsplanRepository;

    @BeforeEach
    void setUpMockRepository(){
        final Trainingsplan halbmarathon = new Trainingsplan(1, "Halbmarathon", "2:15", "3 Monate", 5);
        final Trainingsplan marathon = new Trainingsplan(2, "Marathon", "3:30", "6 Monate", 5);
        doReturn(List.of(halbmarathon, marathon)).when(trainingsplanRepository).findAll();
    }

    @Test
    void testGetTrainingsplaene(){
        final Iterable<Trainingsplan> resultAsIterable = trainingsplanService.getTrainingsplaene();
        final List<Trainingsplan> resultAsList = StreamSupport.stream(resultAsIterable.spliterator(), false).toList();
        assertSame(2, resultAsList.size());
    }

}
