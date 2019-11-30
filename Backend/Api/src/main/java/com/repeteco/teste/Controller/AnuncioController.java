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
                request.getIdClient(),
                request.getIdEscola(),
                request.getTitulo(),
                request.getDescricao(),
                request.getValor(),
                request.getTamanho(),
                request.getConservacao(),
                request.getImagem1(),
                request.getImagem2(),
                request.getImagem3(),
                request.getImagem4(),
                request.getImagem5(),
                request.getType()
        );

        return anuncioRepository.save(anuncio);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Anuncio> get() {
        return anuncioRepository.findAll();
    }

    @RequestMapping("/order")
    public List<Anuncio> findAllSorted() {
        return anuncioRepository.findAllByOrderByDtInicialDesc();
    }

    @RequestMapping("/{id}")
    public Optional<Anuncio> getById(@PathVariable("id") int idAnuncio){
        return anuncioRepository.findById(idAnuncio);
    }

    @RequestMapping("/cliente/{idClient}")
    public List<Anuncio> getByIdClient(@PathVariable("idClient") int idClient){
        return anuncioRepository.findByIdClient(idClient);
    }

    @RequestMapping("/type/{type}")
    public List<Anuncio> getByType(@PathVariable("type") String type){
        return anuncioRepository.findByType(type);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteById(@PathVariable("id") int idAnuncio) {
        anuncioRepository.deleteById(idAnuncio);
        return "Anúncio removido com sucesso " + idAnuncio;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Anuncio edit(@PathVariable("id") int idAnuncio, @RequestBody Anuncio request) throws Exception {
        Anuncio anuncioEdited = anuncioRepository.findById(idAnuncio).orElseThrow(() -> new Exception("Anúncio não encontrado"));
        anuncioEdited.setConservacao(request.getConservacao());
        anuncioEdited.setDescricao(request.getDescricao());
        anuncioEdited.setImagem1(request.getImagem1());
        anuncioEdited.setImagem1(request.getImagem2());
        anuncioEdited.setImagem1(request.getImagem3());
        anuncioEdited.setImagem1(request.getImagem4());
        anuncioEdited.setImagem1(request.getImagem5());
        anuncioEdited.setTamanho(request.getTamanho());
        anuncioEdited.setTitulo(request.getTitulo());
        anuncioEdited.setValor(request.getValor());

        anuncioRepository.save(anuncioEdited);

        return anuncioEdited;
    }
}