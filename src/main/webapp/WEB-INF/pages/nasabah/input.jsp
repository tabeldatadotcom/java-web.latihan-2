<%-- 
    Document   : newnasabah
    Created on : Sep 5, 2017, 12:38:40 PM
    Author     : VALERIANPC
--%>

<%@page contentType="text/html" pageEncoding="windows-1252" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Input Data Nasabah</title>
    </head>
    <body>
        <fr:form commandName="nasabah" method="post" action="${pageContext.servletContext.contextPath}/nasabah/new">
            <h2>Input Nasabah</h2>
            <hr/>
            <table>

                    <tr>
                    <td><fr:label path="nomorRegister">Nomor Register</fr:label></td>
                    <td><fr:input path="nomorRegister"></fr:input></td>
                    </tr>
                    
                    <tr>
                    <td><fr:label path="nama">Nama Nasabah</fr:label></td>
                    <td><fr:input path="nama"></fr:input></td>
                    </tr>

                    <tr>
                        <td><fr:label path="jenisKelamin">Jenis Kelamin</fr:label></td>
                    <td><fr:radiobuttons path="jenisKelamin" items="${listOfJenisKelamin}" itemLabel="JenisKelamin"></fr:radiobuttons></td>
                    </tr>

                    <tr>
                        <td></td>
                        <td>
                            <button type="submit" value="Simpan">Simpan</button>
                            <button type="reset" value="Reset">Reset</button>
                        </td>
                    </tr>

                </table>

        </fr:form>
    </body>
</html>
