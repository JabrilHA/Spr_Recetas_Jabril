package com.ipartek.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipartek.Model.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {

}
