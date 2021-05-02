package oi.dev.bueno.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName="index-pessoa",indexStoreType="Pessoa",shards=2)
public class Pessoa {
    @Id
    public String id;
    public String nome;
}
