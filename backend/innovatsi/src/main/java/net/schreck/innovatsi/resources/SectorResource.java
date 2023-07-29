package net.schreck.innovatsi.resources;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.schreck.innovatsi.domain.Sector;
import net.schreck.innovatsi.dto.SectorDTO;
import net.schreck.innovatsi.services.SectorService;

@RestController
@RequestMapping(value="/sectors")
public class SectorResource {

    @Autowired
    private SectorService service;

    @GetMapping
    public ResponseEntity<List<SectorDTO>> findAll() {
        List<Sector> list = service.findAll();
        List<SectorDTO> listDto = list.stream().map(x -> new SectorDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<SectorDTO> findById(@PathVariable String id) {
        Sector obj = service.findById(id);
        return ResponseEntity.ok().body(new SectorDTO(obj));
    }
    
}
