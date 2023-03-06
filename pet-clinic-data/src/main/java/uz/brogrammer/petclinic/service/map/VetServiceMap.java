package uz.brogrammer.petclinic.service.map;

import uz.brogrammer.petclinic.model.Vet;
import uz.brogrammer.petclinic.service.VetService;

import java.util.Set;

public class VetServiceMap extends  AbstractMapService<Vet, Long> implements VetService {
    @Override
    public void delete(Vet object) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet vet) {
        return null;
    }

    @Override
    public Set<Vet> findAll() {
        return null;
    }
}
