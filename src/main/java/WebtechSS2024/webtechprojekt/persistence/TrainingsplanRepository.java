package WebtechSS2024.webtechprojekt.persistence;


import WebtechSS2024.webtechprojekt.models.Trainingsplan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingsplanRepository extends CrudRepository<Trainingsplan, Integer>{
}
