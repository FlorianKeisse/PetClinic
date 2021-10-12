package keisse.springframework.sfgpetclinic.repositories;

import keisse.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;


public interface PetRepository extends CrudRepository<Pet, Long> {
}
