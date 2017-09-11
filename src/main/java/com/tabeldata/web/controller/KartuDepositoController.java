/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.controller;

import com.tabeldata.web.dao.DepositoDao;
import com.tabeldata.web.dao.KartuDepositoDao;
import com.tabeldata.web.dao.NasabahDao;
import com.tabeldata.web.model.Deposito;
import com.tabeldata.web.model.KartuDeposito;
import com.tabeldata.web.model.Nasabah;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VALERIANPC
 */
@Controller
@RequestMapping("/hasil")
public class KartuDepositoController {
    
    @Autowired
    private final static Logger console = LoggerFactory.getLogger(KartuDepositoController.class);
    
    @Autowired
    private NasabahDao nasabahDao;
    
    @Autowired
    private DepositoDao depositoDao;
    
    @Autowired
    private KartuDepositoDao kartuDepositoDao;
    
    @GetMapping("/kartu")
    public ModelAndView showFormKartuDeposito(
            ModelAndView mav,
            @ModelAttribute(name = "kartuDeposito") KartuDeposito kartuDeposito,
            HttpServletRequest req) {

        mav.addObject("kartuDeposito", kartuDeposito);
        mav.addObject("listOfNasabah", nasabahDao.findAll());
        mav.addObject("listOfDeposito", depositoDao.findAll());
        mav.setViewName("deposito/kartu");
        return mav;
    }
//    
//    @RequestMapping(value = "/kartu", method = RequestMethod.POST)
//    public String submitFormKartuDeposito(
//            @Valid @ModelAttribute(name = "kartuDeposito") KartuDeposito kd,
//            @ModelAttribute(name = "deposito") Deposito d,
//            BindingResult bindingResult,
//            HttpServletRequest req) {
//        console.info("Membuat kartu");
////        kd.setCreateOn(Timestamp.valueOf(LocalDateTime.now()));
//        kd.setBungaBulanan(BigDecimal.ZERO);
//        kd.setJatuhTempo(Date.valueOf(LocalDate.now()));
//        if (bindingResult.hasErrors()) {
//            return "redirect:/deposito/new";
//        } else {
//            depositoDao.save(d);
//            return "redirect:/hasil/kartu";
//        }
//    
//    
//}

}