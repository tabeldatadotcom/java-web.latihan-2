package com.tabeldata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HaloController {

    @GetMapping(value = "/halo")
    public String sayHalo(HttpServletRequest request,
                          @RequestParam(name = "nama",
                                  required = false)
                                  String nama) {
        request.setAttribute("message", "Halo ini dari Spring Controller method GET");
        request.setAttribute("nama", nama);
        return "halo";
    }

    @PostMapping(value = "/halo")
    public String sayHaloPost(HttpServletRequest request) {
        request.setAttribute("message", "Halo ini dari Spring Controller method POST");
        return "halo";
    }

    @GetMapping(value = "/hi")
    public String hiDude(HttpServletRequest request) {
        request.setAttribute("message", "Halo ini dari Spring Controller method POST url /hi");
        return "halo";
    }
}
