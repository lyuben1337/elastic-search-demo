package com.example.elasticsearchdemo.service;

import com.example.elasticsearchdemo.document.Talent;
import com.example.elasticsearchdemo.model.TalentDTO;
import com.example.elasticsearchdemo.repository.TalentRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class TalentService {

    private TalentRepository repository;

    public void save(final TalentDTO talent) {
        repository.save(Talent.builder()
                .id(UUID.randomUUID().toString())
                .name(talent.name())
                .surname(talent.surname())
                .about(talent.about())
                .build());
    }

    public Talent findById(final String id) {
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND)
        );
    }

    public List<Talent> searchTalents(final String text) {
        return repository.findAllByTextWithMistakes(text);
    }

    public void deleteTalents() {
        repository.deleteAll();
    }
}
