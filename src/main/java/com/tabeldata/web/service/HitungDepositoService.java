package com.tabeldata.web.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
public class HitungDepositoService {

    private final static Logger console = LoggerFactory.getLogger(HitungDepositoService.class);

    public Integer getJumlahHariSebulan(LocalDate tanggalAplikasi, Integer increment) {
        LocalDate tanggalIncrement = tanggalAplikasi.plusMonths(increment);
        console.info("tanggal aplikasi {} : tanggal increment {}", tanggalAplikasi, tanggalIncrement);
        Integer betweenDays = Math.toIntExact(ChronoUnit.DAYS.between(tanggalAplikasi, tanggalIncrement));
        return betweenDays;
    }

    public Double getBungaPercent(Integer bungaPerAnum) {
        return bungaPerAnum / Double.valueOf(100);
    }

    public BigDecimal getBungaPerBulan(Integer jumlahHariSebulan, BigDecimal nominal, Double bungaPerAnumInPercent) {
        BigDecimal perkalian = nominal.multiply(new BigDecimal(jumlahHariSebulan)).multiply(new BigDecimal(bungaPerAnumInPercent));
        console.info("hasil perkalian dari {} * {} * {}", jumlahHariSebulan, nominal, bungaPerAnumInPercent);
        BigDecimal hasil = perkalian.divide(new BigDecimal(365), MathContext.DECIMAL32);
        BigDecimal hasilPembulatan = hasil.setScale(0, BigDecimal.ROUND_HALF_UP);
        return hasilPembulatan;
    }


}
