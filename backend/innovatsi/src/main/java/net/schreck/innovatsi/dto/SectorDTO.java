package net.schreck.innovatsi.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import net.schreck.innovatsi.domain.Sector;

@Getter
@Setter
public class SectorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String name;

    public SectorDTO(){

    }

    public SectorDTO(Sector obj){
        id = obj.getId();
        name = obj.getName();
    }
    
}
