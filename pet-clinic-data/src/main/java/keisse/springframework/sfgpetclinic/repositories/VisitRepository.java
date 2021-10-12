package keisse.springframework.sfgpetclinic.repositories;

import keisse.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;


public interface VisitRepository extends CrudRepository<Visit, Long> {
}
