package com.tabeldata.test;

import com.tabeldata.web.service.HitungDepositoService;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

@Ignore
public class HitungDepositoTest extends TestCase {

    private HitungDepositoService service;

    @Override
    protected void setUp() throws Exception {
        this.service = new HitungDepositoService();
    }

    @Test
    public void testHitungTanggal() {
        Integer jumlahHariSebulan =
                service.getJumlahHariSebulan(LocalDate.of(2017, 8, 11), 1);
        assertEquals("jumlah hari dalam sebulan di bulan septemer adalah 30 hari ",
                new Integer(31), jumlahHariSebulan);

        jumlahHariSebulan =
                service.getJumlahHariSebulan(LocalDate.of(2017, 8, 11), 2);
        assertEquals("jumlah hari dalam sebulan di bulan septemer adalah 30 hari ",
                new Integer(61), jumlahHariSebulan);

    }

    @Test
    @Ignore
    public void testHitungPersen() {
        Integer sepuluh = new Integer(10);
        Double sepuluhPercent = service.getBungaPercent(sepuluh);
        assertEquals("sepuluh persent adalah ", new BigDecimal(0.1), sepuluhPercent);
    }

    @Test
    public void testBungaPerBulan() {
        Integer jumlahHariSebulan =
                service.getJumlahHariSebulan(LocalDate.of(2017, 8, 11), 1);
        Integer sepuluh = new Integer(10);
        Double sepuluhPercent = service.getBungaPercent(sepuluh);

        BigDecimal bungaPerBulan = service.getBungaPerBulan(jumlahHariSebulan, new BigDecimal(10000000), sepuluhPercent);
        assertEquals("bunga perbulan", new BigDecimal(84932), bungaPerBulan);
    }
}
