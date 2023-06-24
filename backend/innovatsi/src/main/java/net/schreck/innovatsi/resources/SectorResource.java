package net.schreck.innovatsi.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.schreck.innovatsi.domain.Sector;

@RestController
@RequestMapping(value="/sectors")
public class SectorResource {

    @GetMapping
    public ResponseEntity<List<Sector>> findAll() {
        Sector fabrica1 = new Sector("", "fabrica");
        Sector fabrica2 = new Sector("", "fabrica 2");
        List<Sector> list = new ArrayList<>();
        list.addAll(Arrays.asList(fabrica1, fabrica2));
        return ResponseEntity.ok().body(list);
    }
    
}
