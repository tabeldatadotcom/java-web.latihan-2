<%-- 
    Document   : aplikasi
    Created on : Sep 5, 2017, 4:28:34 PM
    Author     : VALERIANPC
--%>

<%@page contentType="text/html" pageEncoding="windows-1252" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Aplikasi Deposito</title>
    </head>
    <body>
        <fr:form commandName="deposito" method="post" action="${pageContext.servletContext.contextPath}/deposito/new">
            <h2>
                Aplikasi Deposito
            </h2>
            <hr/>
            <table>

                <tr>

                    <td><fr:label path="nasabah">Nomor Register Nasabah</fr:label></td>
                        <td>
                        <fr:select path="nasabah">
                            <fr:options items="listOfNasabah" itemLabel="${nomorRegister}${nomorRegister}"/>
                        </fr:select>
                    </td>
                </tr>

                <tr>
                    <td><fr:label path="jangkaWaktu">Jangka Waktu</fr:label></td>
                    <td><fr:radiobutton path="jangkaWaktu" value="3" label="3 Bulan"/>
                        <fr:radiobutton path="jangkaWaktu" value="6" label="6 Bulan"/>
                        <fr:radiobutton path="jangkaWaktu" value="9" label="12 Bulan"/></td>
                </tr>

                <tr>
                    <td></td>
                    <td></td>
                </tr>

                <tr>
                    <td></td>
                    <td></td>
                </tr>

                <tr>
                    <td></td>
                    <td></td>
                </tr>

                <tr>
                    <td></td>
                    <td></td>
                </tr>

            </table>
        </fr:form>
    </body>
</html>
