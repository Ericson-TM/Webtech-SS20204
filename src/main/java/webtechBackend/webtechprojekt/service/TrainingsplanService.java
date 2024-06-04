package webtechBackend.webtechprojekt.service;


import webtechBackend.webtechprojekt.models.Trainingsplan;
import webtechBackend.webtechprojekt.persistence.TrainingsplanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TrainingsplanService {

    @Autowired
    private TrainingsplanRepository repository;

    public Optional<Trainingsplan> getTrainingsplan(Integer id) {
        return this.repository.findById(id);
    }

    public Iterable<Trainingsplan> getTrainingsplaene() {
        return this.repository.findAll();
    }

    public Trainingsplan addTrainingsplan(final Trainingsplan trainingsplan) {
        return repository.save(trainingsplan);
    }

    public Trainingsplan editTrainingsplan(final Trainingsplan trainingsplan) {
        return repository.existsById(trainingsplan.getId())
                ? repository.save(trainingsplan)
                : null;
    }

    public boolean removeTrainingsplan(final Integer id) {
        final boolean exists = repository.existsById(id);
        if (exists) {
            repository.deleteById(id);
        }
        return exists;
        }
}
