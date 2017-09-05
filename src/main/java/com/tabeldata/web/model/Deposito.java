/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.model;

import com.tabeldata.web.model.Nasabah;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author VALERIANPC
 */
@Entity
@Table(name = "m_deposito", schema = "latihan")
public class Deposito {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer kode;
    
    @Column(name = "jangka_waktu", nullable = false)
    private Integer jangkaWaktu;
    
    @Column(name = "perpanjang_otomatis", nullable = false)
    private Boolean perpanjangOtomatis;
    
    @Column(nullable = false)
    private BigDecimal nominal;
    
    @Column(nullable = false)
    private BigDecimal bungaPerAnum;
           
    @Column(name = "create_on", nullable = false)
    private Timestamp createOn;

    @ManyToOne
    @JoinColumn(name = "id_nasabah")
    private Nasabah nasabah;

    public Deposito() {
    }

    public Deposito(Integer kode, Integer jangkaWaktu, Boolean perpanjangOtomatis, BigDecimal nominal, BigDecimal bungaPerAnum, Timestamp createOn, Nasabah nasabah) {
        this.kode = kode;
        this.jangkaWaktu = jangkaWaktu;
        this.perpanjangOtomatis = perpanjangOtomatis;
        this.nominal = nominal;
        this.bungaPerAnum = bungaPerAnum;
        this.createOn = createOn;
        this.nasabah = nasabah;
    }

    public Integer getKode() {
        return kode;
    }

    public void setKode(Integer kode) {
        this.kode = kode;
    }

    public Integer getJangkaWaktu() {
        return jangkaWaktu;
    }

    public void setJangkaWaktu(Integer jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    public Boolean getPerpanjangOtomatis() {
        return perpanjangOtomatis;
    }

    public void setPerpanjangOtomatis(Boolean perpanjangOtomatis) {
        this.perpanjangOtomatis = perpanjangOtomatis;
    }

    public BigDecimal getNominal() {
        return nominal;
    }

    public void setNominal(BigDecimal nominal) {
        this.nominal = nominal;
    }

    public BigDecimal getBungaPerAnum() {
        return bungaPerAnum;
    }

    public void setBungaPerAnum(BigDecimal bungaPerAnum) {
        this.bungaPerAnum = bungaPerAnum;
    }

    public Timestamp getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Timestamp createOn) {
        this.createOn = createOn;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public void setNasabah(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    
    
    
    
    }
    
    
    
    

