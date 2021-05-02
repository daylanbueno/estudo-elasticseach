package oi.dev.bueno.demo.resources;

import oi.dev.bueno.demo.model.Pessoa;
import oi.dev.bueno.demo.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class pessoaResource {

    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    public void novaPessoa(@RequestBody Pessoa pessoa) {
        pessoaRepository.save(pessoa);
    }

    @GetMapping("/findAll")
    public List<Pessoa> findAll() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoaRepository.findAll().forEach(item -> {
            pessoas.add(item);
        });
       return pessoas;
    }
}
