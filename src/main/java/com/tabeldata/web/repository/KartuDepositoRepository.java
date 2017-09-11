/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.repository;

import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.KartuDeposito;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author VALERIANPC
 */
public interface KartuDepositoRepository extends PagingAndSortingRepository<KartuDeposito, String>{
    
    List<KartuDeposito> findAll();
    
}
