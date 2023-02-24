
package com.Country.dao;

import com.Country.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository <Pais, Long> {
    
}
