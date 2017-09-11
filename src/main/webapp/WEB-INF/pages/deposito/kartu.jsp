<%-- 
Document   : kartu
Created on : Sep 5, 2017, 9:13:32 PM
Author     : VALERIANPC
--%>

<%@page contentType="text/html" pageEncoding="windows-1252" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Kartu Deposito</title>
    </head>
    <body>
        <fr:form commandName="kartuDeposito" method="post" action="${pageContext.servletContext.contextPath}/hasil/kartu">

            <h2>Kartu Deposito</h2>
            <hr/>

            <table>

                <tr>
                    <td><fr:label path="nomorRekening">Nomor Rekening : </fr:label></td>
                    <td>${nomorRekening}</td>
                    <td><fr:label path="deposito.jangkaWaktu">Jangka Waktu : </fr:label></td>
                    <td>${deposito.jangkaWaktu}</td>
                </tr>

                <tr>
                    <td><fr:label path="deposito.createOn">Tanggal Buat: </fr:label></td>
                    <td>${deposito.createOn}</td>
                </tr>

                <tr>
                    <td><fr:label path="deposito.nasabah.nomorRegister">Nomor Register Nasabah : </fr:label></td>
                    <td>${deposito.nasabah.nomorRegister}</td>
                    <td><fr:label path="deposito.nominal">Nominal : </fr:label></td>
                    <td>${deposito.nominal}</td>
                </tr>

                <tr>
                    <td><fr:label path="deposito.nasabah.jenisKelamin">Jenis Kelamin :</fr:label></td>
                    <td>${deposito.nasabah.jenisKelamin}</td>
                </tr>

            </table>

        </fr:form>

        <table border="1">

            <thead>
                <tr>
                    <td>Bulan Ke</td>
                    <td>Bunga Bulanan</td>
                    <td>Jatuh Tempo</td>
                </tr>
            </thead>

            <tbody>
                <c:forEach var="deposito" begin="1" end="${deposito.jangkaWaktu}" items="${listOfKartuDeposito}">
                    <tr>
                        <td>${deposito.bulanKe}</td>
                        <td>${deposito.bungaBulanan}</td>
                        <td>${deposito.jatuhTempo}</td>
                    </tr>
                </c:forEach>
            </tbody>

        </table>

        <table>
            <tr>
                <td></td>
                <td></td>
                <td>
                    <a href="${pageContext.servletContext.contextPath}/deposito/new">Kembali</a>
                </td>
            </tr>
        </table>

    </body>
</html>
