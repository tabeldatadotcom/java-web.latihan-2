/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.model;

/**
 *
 * @author VALERIANPC
 */
public enum JenisKelamin {
    
    L("Laki-laki"), P("Perempuan");
    
    private final String JenisKelamin;

    private JenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }
    
    
    
    
    
}
