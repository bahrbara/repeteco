package com.repeteco.teste.Controller;

import com.repeteco.teste.Model.Anuncio;
import com.repeteco.teste.Repository.AnuncioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/anuncio")
public class AnuncioController {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Anuncio create(@RequestBody Anuncio request) {

        Anuncio anuncio = new Anuncio(
                request.getTitulo(),
                request.getDescricao(),
                request.getDtInicial(),
                request.getDtFinal(),
                request.getValor(),
                request.getTamanho(),
                request.getConservacao(),
                request.getImagem(),
                request.getType()
        );

        return anuncioRepository.save(anuncio);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Anuncio> get() {
        return anuncioRepository.findAll();
    }

    @RequestMapping("/{id}")
    public Optional<Anuncio> getById(@PathVariable("id") int idAnuncio){
        return anuncioRepository.findById(idAnuncio);
    }

    @RequestMapping("/{idClient}")
    public Optional<Anuncio> getByIdClient(@PathVariable("idClient") int idClient){
        return anuncioRepository.findById(idClient);
    }

    @RequestMapping("/{type}")
    public List<Anuncio> getByType(@PathVariable("type") String type){
        return anuncioRepository.findByType(type);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Anuncio edit(@PathVariable("id") int idAnuncio, @RequestBody Anuncio request) throws Exception {
        Anuncio anuncioEdited = anuncioRepository.findById(idAnuncio).orElseThrow(() -> new Exception("Anúncio não encontrado"));
        anuncioEdited.setConservacao(request.getConservacao());
        anuncioEdited.setDescricao(request.getDescricao());
        anuncioEdited.setImagem(request.getImagem());
        anuncioEdited.setTamanho(request.getTamanho());
        anuncioEdited.setTitulo(request.getTitulo());
        anuncioEdited.setValor(request.getValor());
        anuncioEdited.setType(request.getType());

        anuncioRepository.save(anuncioEdited);

        return anuncioEdited;
    }
}