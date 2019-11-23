package com.repeteco.teste.Controller;

import com.repeteco.teste.Model.Client;
import com.repeteco.teste.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Client create(@RequestBody Client request) {

        Client client = new Client(
                request.getName(),
                request.getCpf(),
                request.getGender(),
                request.getBirthDate(),
                request.getEmail(),
                request.getPhoneNumber(),
                request.getAddress(),
                request.getPassword(),
                request.getLogin(),
                request.getType()
                );

        return clientRepository.save(client);
    }


    @RequestMapping("/{id}")
    public Optional<Client> getById(@PathVariable("id") int idClient){
        return clientRepository.findById(idClient);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Client edit(@PathVariable("id") int idClient, @RequestBody Client request) throws Exception {
        Client clientEdited = clientRepository.findById(idClient).orElseThrow(() -> new Exception("Cliente não encontrado"));
        clientEdited.setPhoneNumber(request.getPhoneNumber());
        clientEdited.setEmail(request.getEmail());
        clientEdited.setAddress(request.getAddress());
        clientEdited.setName(request.getName());
        clientEdited.setGender(request.getGender());
        clientEdited.setBirthDate(request.getBirthDate());
        clientEdited.setPassword(request.getPassword());
        clientEdited.setLogin(request.getLogin());

        clientRepository.save(clientEdited);

        return clientEdited;
    }
}