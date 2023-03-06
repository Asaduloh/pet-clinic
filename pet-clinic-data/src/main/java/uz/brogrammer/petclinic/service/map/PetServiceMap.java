package uz.brogrammer.petclinic.service.map;

import uz.brogrammer.petclinic.model.Pet;
import uz.brogrammer.petclinic.service.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public void delete(Pet object) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Pet findById(Long id) {
        return null;
    }

    @Override
    public Pet save(Pet pet) {
        return null;
    }

    @Override
    public Set<Pet> findAll() {
        return null;
    }
}
