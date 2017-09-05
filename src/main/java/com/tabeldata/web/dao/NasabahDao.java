/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.dao;

import com.tabeldata.web.model.Nasabah;
import com.tabeldata.web.repository.NasabahRepository;
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
public class NasabahDao {
    
    @Autowired
    private NasabahRepository nasabahRepository;
    
    public Nasabah save(Nasabah nasabah){
        return nasabahRepository.save(nasabah);
    }
    
    @Transactional(readOnly = false)
    public void hapus(Nasabah nasabah){
        nasabahRepository.delete(nasabah);
    }
    
    public Nasabah findByNomorRegister(String nomorRegister){
        return nasabahRepository.findOne(nomorRegister);
    }
    
    public List<Nasabah> findAll(){
        return nasabahRepository.findAll();
    }
    
}
