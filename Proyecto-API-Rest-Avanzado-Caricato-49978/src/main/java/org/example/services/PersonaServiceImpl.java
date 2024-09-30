package org.example.services;

import entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repositories.BaseRepository;
import repositories.PersonaRepositoriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepositoriy personaRepositoriy;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository){
        super(baseRepository);
    }

    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepositoriy.findByNombreContainingOrApellidoContaining(filtro, filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepositoriy.searchNativo(filtro, pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
