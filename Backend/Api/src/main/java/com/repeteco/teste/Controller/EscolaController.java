package com.repeteco.teste.Controller;

import com.repeteco.teste.Model.Anuncio;
import com.repeteco.teste.Model.Escola;
import com.repeteco.teste.Repository.EscolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/escola")
public class EscolaController {

    @Autowired
    private EscolaRepository escolaRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Escola create(@RequestBody Escola request) {

        Escola escola = new Escola(
                request.getIdEscola(),
                request.getName(),
                request.getCity(),
                request.getNeighborhood()
        );

        return escolaRepository.save(escola);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Escola> get() {
        return escolaRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Escola> getById(@PathVariable("id") int idEscola){
        return escolaRepository.findById(idEscola);
    }

    @RequestMapping("/bairro/{bairro}")
    public List<Escola> findByNeighborhood(@PathVariable("bairro") String neighborhood){
        return escolaRepository.findByNeighborhood(neighborhood);
    }
}