package keisse.springframework.sfgpetclinic.repositories;

import keisse.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;


public interface VetRepository extends CrudRepository<Vet, Long> {
}
