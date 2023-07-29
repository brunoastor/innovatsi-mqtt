package net.schreck.innovatsi.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import net.schreck.innovatsi.domain.Sector;
import net.schreck.innovatsi.repositories.SectorRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private SectorRepository sectorRepository;

    @Override
    public void run(String... args) throws Exception {

        sectorRepository.deleteAll();

        Sector setor1 = new Sector(null, "A");
        Sector setor2 = new Sector(null, "B");
        Sector setor3 = new Sector(null, "C");

        sectorRepository.saveAll(Arrays.asList(setor1, setor2, setor3));
    }
    
}
