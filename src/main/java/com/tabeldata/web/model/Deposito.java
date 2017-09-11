/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
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
    private Integer bungaPerAnum;

    @Column(name = "create_on", nullable = false)
    private Timestamp createOn;

    @Column(name = "tanggal_aplikasi", nullable = false)
    private Date tanggalAplikasi;

    @ManyToOne
    @JoinColumn(name = "id_nasabah", nullable = false)
    private Nasabah nasabah;

    public Deposito() {
    }

    public Deposito(Integer kode, Integer jangkaWaktu, Boolean perpanjangOtomatis, BigDecimal nominal, Integer bungaPerAnum, Timestamp createOn, Nasabah nasabah) {
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

    public Integer getBungaPerAnum() {
        return bungaPerAnum;
    }

    public void setBungaPerAnum(Integer bungaPerAnum) {
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

    public Date getTanggalAplikasi() {
        return tanggalAplikasi;
    }

    public void setTanggalAplikasi(Date tanggalAplikasi) {
        this.tanggalAplikasi = tanggalAplikasi;
    }
}
    
    
    
    

