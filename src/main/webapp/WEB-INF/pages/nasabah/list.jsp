<%-- 
    Document   : list
    Created on : Sep 4, 2017, 1:51:31 PM
    Author     : VALERIANPC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Nasabah</title>
    </head>
    <body>
        <h2>Daftar Nasabah</h2>
        <hr/>
        <a href="${pageContext.servletContext.contextPath}/nasabah/new">Tambah</a> 
        <hr/>
        <table border="1">
            <thead>
                <tr>
                    <td>Nomor Register</td>
                    <td>Nama Nasabah</td>
                    <td>Jenis Kelamin</td>
                    <td>Aksi</td>                    
                </tr>
            </thead>
            <tbody>

                <c:forEach items="${listOfNasabah}" var="nasabah">
                    <tr>
                        <td>${nasabah.nomorRegister}</td>
                        <td>${nasabah.nama}</td>
                        <td>${nasabah.jenisKelamin}</td>
                        <td><form action="${pageContext.servletContext.contextPath}/nasabah/remove" method="post">
                                <input type="hidden" name="nomorRegister" value="${nasabah.nomorRegister}"/>
                                <button type="submit" value="Hapus">Hapus</button>
                            </form></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
