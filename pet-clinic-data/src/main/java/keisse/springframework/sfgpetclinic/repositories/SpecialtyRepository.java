package keisse.springframework.sfgpetclinic.repositories;

import keisse.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;


public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
