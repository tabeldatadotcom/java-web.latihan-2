/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.repository;

import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.Nasabah;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author VALERIANPC
 */
public interface DepositoRepository extends PagingAndSortingRepository<Deposito, String> {
    
    List<Deposito> findAll();
    
    Deposito findByKodeAndCreateOn(Integer kode, Timestamp createOn);
    
}
