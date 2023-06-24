package net.schreck.innovatsi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import net.schreck.innovatsi.domain.Sector;

@Repository
public interface SectorRepository extends MongoRepository<Sector, String> {
    
}
