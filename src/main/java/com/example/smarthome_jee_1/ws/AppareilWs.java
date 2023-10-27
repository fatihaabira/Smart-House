package com.example.smarthome_jee_1.ws;

import com.example.smarthome_jee_1.bean.Appareil;
import com.example.smarthome_jee_1.service.AppareilService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appareils")
public class AppareilWs {
    private AppareilService appareilService;

    @GetMapping("")
    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    @PostMapping("")
    public int save(Appareil appareil) {
        return appareilService.save(appareil);
    }

    @GetMapping("id/{id}")
    public Optional<Appareil> findById(Long id) {
        return appareilService.findById(id);
    }

    @DeleteMapping("id/{id}")
    public void deleteById(Long id) {
        appareilService.deleteById(id);
    }

    @DeleteMapping("")
    public void deleteAll() {
        appareilService.deleteAll();
    }

    public AppareilWs(AppareilService appareilService) {
        this.appareilService = appareilService;
    }
}
