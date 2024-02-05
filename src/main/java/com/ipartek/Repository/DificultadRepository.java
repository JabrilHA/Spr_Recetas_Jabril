package com.ipartek.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipartek.Model.Dificultad;

@Repository
public interface DificultadRepository extends JpaRepository<Dificultad, Integer>{

}
