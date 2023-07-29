package net.schreck.innovatsi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.schreck.innovatsi.domain.Sector;
import net.schreck.innovatsi.repositories.SectorRepository;
import net.schreck.innovatsi.services.exception.ObjectNotFoundException;

@Service
public class SectorService {

    @Autowired
    private SectorRepository repo;

    public List<Sector> findAll(){
        return repo.findAll();
    }

    public Sector findById(String id) {
        Optional<Sector> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    
}
