package keisse.springframework.sfgpetclinic.repositories;

import keisse.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;


public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
