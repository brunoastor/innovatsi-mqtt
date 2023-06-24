package net.schreck.innovatsi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.schreck.innovatsi.domain.Sector;
import net.schreck.innovatsi.services.SectorService;

@RestController
@RequestMapping(value="/sectors")
public class SectorResource {

    @Autowired
    private SectorService service;

    @GetMapping
    public ResponseEntity<List<Sector>> findAll() {
        List<Sector> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
}
