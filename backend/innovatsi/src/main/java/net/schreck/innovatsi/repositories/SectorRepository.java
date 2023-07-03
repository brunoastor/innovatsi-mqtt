package net.schreck.innovatsi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.schreck.innovatsi.domain.Sector;

public interface SectorRepository extends MongoRepository<Sector, String> {
    
}
