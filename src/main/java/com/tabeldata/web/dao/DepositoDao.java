/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.dao;

import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.KartuDeposito;
import com.tabeldata.web.model.Nasabah;
import com.tabeldata.web.repository.DepositoRepository;
import com.tabeldata.web.repository.KartuDepositoRepository;
import com.tabeldata.web.repository.NasabahRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import com.tabeldata.web.service.HitungDepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author VALERIANPC
 */

@Repository
@Transactional(readOnly = true)
public class DepositoDao {

    @Autowired
    private DepositoRepository depositoRepository;

    @Autowired
    private HitungDepositoService serviceDeposito;

    @Autowired
    private KartuDepositoRepository repositoKartuDeposito;

    @Transactional(readOnly = false)
    public Deposito save(Deposito deposito) {
        Deposito depositoAfterSave = depositoRepository.save(deposito);
        Integer jumlahBulan = 1;
        for (int i = 0; i < depositoAfterSave.getJangkaWaktu(); i++) {
            KartuDeposito kartuDeposito = new KartuDeposito();
            LocalDate tanggalJatuhTempo = LocalDate.now().plusMonths(jumlahBulan);
            kartuDeposito.setJatuhTempo(Date.valueOf(tanggalJatuhTempo));

            LocalDate tanggalSekarang = LocalDate.now().plusMonths(i);
            Integer jumlahHariSebulan = serviceDeposito.getJumlahHariSebulan(tanggalSekarang, 1);

            Double bungaPercent = serviceDeposito.getBungaPercent(depositoAfterSave.getBungaPerAnum());

            kartuDeposito.setBungaBulanan(serviceDeposito.getBungaPerBulan(jumlahHariSebulan, depositoAfterSave.getNominal(), bungaPercent));
            kartuDeposito.setBulanKe(jumlahBulan);
            kartuDeposito.setDeposito(depositoAfterSave);

            repositoKartuDeposito.save(kartuDeposito);
            jumlahBulan++;
        }
        return depositoAfterSave;
    }

    @Transactional(readOnly = false)
    public void hapus(Deposito deposito) {
        depositoRepository.delete(deposito);
    }

//    public Nasabah findByKode(int kode){
//        return depositoRepository.findOne(kode);
//    }

    public List<Deposito> findAll() {
        return depositoRepository.findAll();
    }

}
