/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.model;

import com.tabeldata.web.model.JenisKelamin;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author VALERIANPC
 */

@Entity
@Table(name = "m_nasabah", schema = "latihan")

public class Nasabah {
    
    @Id
    @GenericGenerator(name = "gen_nasabah", strategy = "uuid2")
    @GeneratedValue(generator = "gen_nasabah")
    private String nomorRegister;
    
    @Column(nullable = false, length = 50)
    private String nama;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "jenis_kelamin", nullable = false)
    private JenisKelamin jenisKelamin;

     public Nasabah(String nama, String nomorRegister, JenisKelamin jk) {
        this.nama = nama;
        this.nomorRegister = nomorRegister;
        this.jenisKelamin = jk;
    }
    
    public Nasabah(String nama, String nomorRegister) {
        this.nama = nama;
        this.nomorRegister = nomorRegister;
       
    }

    public Nasabah() {
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorRegister() {
        return nomorRegister;
    }

    public void setNomorRegister(String nomorRegister) {
        this.nomorRegister = nomorRegister;
    }

    
    
    public Nasabah(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    
    
}
