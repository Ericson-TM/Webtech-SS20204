package webtechBackend.webtechprojekt.persistence;


import webtechBackend.webtechprojekt.models.Trainingsplan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingsplanRepository extends CrudRepository<Trainingsplan, Integer>{
}
