package com.example.elasticsearchdemo.controller;

import com.example.elasticsearchdemo.document.Talent;
import com.example.elasticsearchdemo.model.TalentDTO;
import com.example.elasticsearchdemo.service.TalentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/talents")
@AllArgsConstructor
public class TalentController {

    @Autowired
    private final TalentService talentService;

    @PostMapping
    public void save(@RequestBody final TalentDTO talent) {
        talentService.save(talent);
    }

    @GetMapping("/{id}")
    public Talent findById(@PathVariable final String id) {
        return talentService.findById(id);
    }

    @GetMapping
    public List<Talent> searchTalents(@RequestBody final String text) {
        return talentService.searchTalents(text);
    }

    @DeleteMapping
    public void deleteTalents() {
        talentService.deleteTalents();
    }
}
