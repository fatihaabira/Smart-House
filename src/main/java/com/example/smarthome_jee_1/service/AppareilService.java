package com.example.smarthome_jee_1.service;

import com.example.smarthome_jee_1.bean.Appareil;
import com.example.smarthome_jee_1.dao.AppareilDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppareilService {

    private  AppareilDAO appareilDAO;

    public AppareilService(AppareilDAO appareilDAO) {
        this.appareilDAO = appareilDAO;
    }

    public List<Appareil> findAll() {
        return appareilDAO.findAll();
    }

    public int save(Appareil appareil) {
        if(appareil == null) return -1;
        else{
            appareilDAO.save(appareil);
        }
        return 1;
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilDAO.findById(aLong);
    }

    public void deleteById(Long aLong) {
        appareilDAO.deleteById(aLong);
    }

    public void deleteAll() {
        appareilDAO.deleteAll();
    }

// add switchon and switchoff and switch all on and switch all off

}
