package com.example.elasticsearchdemo.repository;

import com.example.elasticsearchdemo.document.Talent;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public interface TalentRepository extends ElasticsearchRepository<Talent, String> {
    @Query("{\"bool\": {\"must\": [{\"query_string\": {\"query\": \"?0\", \"fields\": [\"name\", \"surname\", \"about\"]}}]}}")
    List<Talent> findAllByText(String text);

    @Query("{\"bool\": {\"should\": [{\"fuzzy\": {\"name\": \"?0\"}}, {\"fuzzy\": {\"surname\": \"?0\"}}, {\"fuzzy\": {\"about\": \"?0\"}}]}}")
    List<Talent> findAllByTextWithMistakes(String text);
}
