/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.web.controller;

import com.tabeldata.web.dao.NasabahDao;
import com.tabeldata.web.model.JenisKelamin;
import com.tabeldata.web.model.Nasabah;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author VALERIANPC
 */
@Controller
@RequestMapping("/nasabah")
public class NasabahController {

    @Autowired
    private final static Logger console = LoggerFactory.getLogger(NasabahController.class);
    
    @Autowired
    private NasabahDao nasabahDao;

    @GetMapping("/new")
    public ModelAndView showFormTambah(ModelAndView mav,
            @ModelAttribute("nasabah") Nasabah n) {

        mav.addObject("isCreate", true);
        mav.addObject("nasabah", n);
        mav.addObject("listOfJenisKelamin", JenisKelamin.values());
        mav.setViewName("/nasabah/input"); //nyari file jsp
        return mav;
    }

    @PostMapping("/new")
    public String submitFormTambah(@ModelAttribute(name = "nasabah") Nasabah n,
            HttpServletRequest req) {

        console.info("Nama :" + n.getNama() + " Jenis Kelamin :"
                + n.getJenisKelamin() + "}");
        nasabahDao.save(n);
        return "redirect:/nasabah/list";
    }

    @GetMapping("/list")
    public ModelAndView showList(ModelAndView mav) {
        mav.setViewName("/nasabah/list");
        mav.addObject("listOfNasabah", nasabahDao.findAll());
        return mav;
    }
    
    @PostMapping("/remove")
    public String hapusNasabahByNomorRegister(
            @RequestParam(name = "nomorRegister") String id){
        
        Nasabah nasabah = nasabahDao.findByNomorRegister(id);
        if (nasabah!=null) {
            nasabahDao.hapus(nasabah);            
        }
        return "redirect:/nasabah/list";
    }
    
    
}
