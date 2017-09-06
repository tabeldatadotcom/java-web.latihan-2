/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.controller;

import com.tabeldata.web.dao.DepositoDao;
import com.tabeldata.web.dao.NasabahDao;
import com.tabeldata.web.model.Deposito;
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

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author VALERIANPC
 */
@Controller
@RequestMapping("/deposito")
public class DepositoController {

    @Autowired
    private final static Logger console = LoggerFactory.getLogger(DepositoController.class);

    @Autowired
    private NasabahDao nasabahDao;

    @Autowired
    private DepositoDao depositoDao;

    @GetMapping("/new")
    public ModelAndView showFormDeposito(
            ModelAndView mav,
            @ModelAttribute(name = "deposito") Deposito deposito,
            HttpServletRequest req) {

        mav.addObject("deposito", deposito);
        mav.addObject("listOfNasabah", nasabahDao.findAll());
        mav.setViewName("deposito/aplikasi");
        return mav;
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public String submitFormDeposito(
            @Valid @ModelAttribute(name = "deposito") Deposito d,
            BindingResult bindingResult,
            HttpServletRequest req) {
        console.info("method ini di panggil");
        d.setCreateOn(Timestamp.valueOf(LocalDateTime.now()));
        if (bindingResult.hasErrors()) {
            return "redirect:/deposito/new";
        } else {
            depositoDao.save(d);
            return "redirect:/deposito/new";
        }

//        console.info("{Jangka Waktu : "+d.getJangkaWaktu()+
//                " Perpanjangan Otomatis : "+d.getPerpanjangOtomatis()+" Nominal : "+d.getNominal()+
//                " Bunga Per Anum :"+d.getBungaPerAnum()+" Create On : "+d.getCreateOn()+"}");
    }

}