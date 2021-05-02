package oi.dev.bueno.demo.repository;

import oi.dev.bueno.demo.model.Pessoa;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PessoaRepository extends ElasticsearchRepository<Pessoa, String> {
}
