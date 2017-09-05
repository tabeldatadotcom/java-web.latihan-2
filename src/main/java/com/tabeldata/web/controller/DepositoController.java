/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.controller;

import com.tabeldata.web.dao.DepositoDao;
import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.JenisKelamin;
import com.tabeldata.web.model.Nasabah;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VALERIANPC
 */
@Controller
@RequestMapping("/deposito")
public class DepositoController {
    
    @Autowired
    private DepositoDao depositoDao;
    
    @GetMapping("/new")
    public ModelAndView showFormDeposito(ModelAndView mav, 
            @ModelAttribute(name = "nasabah") Nasabah n, 
            HttpServletRequest req){
        
        mav.addObject("listOfNasabah", n);
        mav.setViewName("deposito/aplikasi");
        return mav;
    }
    
}