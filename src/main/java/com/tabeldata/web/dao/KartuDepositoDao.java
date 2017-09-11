/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.dao;

import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.KartuDeposito;
import com.tabeldata.web.repository.DepositoRepository;
import com.tabeldata.web.repository.KartuDepositoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author VALERIANPC
 */

@Repository
@Transactional(readOnly = true)
public class KartuDepositoDao {
    
    @Autowired
    private KartuDepositoRepository kartuDepositoRepository;
    
    public KartuDeposito save(KartuDeposito kartuDeposito){
        return kartuDepositoRepository.save(kartuDeposito);
    }
    
//    @Transactional(readOnly = false)
//    public void hapus(Deposito deposito){
//        depositoRepository.delete(deposito);
//    }
    
//    public Nasabah findByKode(int kode){
//        return depositoRepository.findOne(kode);
//    }
    
    public List<KartuDeposito> findAll(){
        return kartuDepositoRepository.findAll();
    }
    
}
