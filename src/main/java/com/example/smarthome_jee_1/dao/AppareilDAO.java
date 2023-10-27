package com.example.smarthome_jee_1.dao;

import com.example.smarthome_jee_1.bean.Appareil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppareilDAO extends JpaRepository<Appareil ,Long> {
}
