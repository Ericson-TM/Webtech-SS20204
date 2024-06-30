package webtechBackend.webtechprojekt.web;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import webtechBackend.webtechprojekt.models.Trainingsplan;
import webtechBackend.webtechprojekt.service.TrainingsplanService;

import java.util.Optional;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.equalTo;



@WebMvcTest(TrainingsplanController.class)
public class TrainingsplanControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TrainingsplanService trainingsplanService;

    @BeforeEach
    void setUpMockRepository() {
        final Trainingsplan marathon = new Trainingsplan(1, "Marathon", "3:30", "6 Monate", 5);
        when(trainingsplanService.getTrainingsplan(1)).thenReturn(Optional.of(marathon));
    }

    @Test
    void testGetTrainingsplanById() throws Exception{
        final String expected = "{\"id\":1,\"name\":\"Marathon\",\"zeit\":\"3:30\",\"dauer\":\"6 Monate\",\"intensivitaet\":5}";
        this.mockMvc.perform(get("/trainingsplaene/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().string(equalTo(expected)));
    }
}
