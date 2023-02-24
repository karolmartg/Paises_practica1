package com.Country.service;

import com.Country.domain.Pais;
import java.util.List;

public interface ClienteService {
    // 1) Se obtiene un listado de paises en un List
    public List<Pais> getPaises();
    
    // 2) Se obtiene un Pais, a partir del id de un pais
    public Pais getPais(Pais pais);
    
    // 3) Se inserta un nuevo cliente si el id del cliente esta vacío
    // Se actualiza un cliente si el id del cliente NO esta vacío
    public void save(Pais pais);
    
    // 4) Se elimina el cliente que tiene el id pasado por parámetro
    public void delete(Pais pais);
}
