package net.schreck.innovatsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.schreck.innovatsi.domain.Sector;
import net.schreck.innovatsi.repositories.SectorRepository;

@Service
public class SectorService {

    @Autowired
    private SectorRepository repo;

    public List<Sector> findAll(){
        return repo.findAll();

    }
    
}
