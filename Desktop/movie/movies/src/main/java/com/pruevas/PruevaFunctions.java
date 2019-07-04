/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruevas;

import com.dao.FunctionsDaO;
import com.models.Functions;
import java.sql.SQLException;
import java.util.List;

/**
 * En esta clase realizamos las pruebas de nuestros metodos Dao de Model
 * @author JBuezo
 */
public class PruevaFunctions {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*boolean inserted = FunctionsDaO.add(
                new Functions("B15", "2h:30m", "01/02/2019", 1, 1));;
        System.out.println(inserted);*/

        List<Functions> list = com.dao.FunctionsDaO.getAll();
        for (Functions e : list) {
            System.out.println(e.getId()
                    + e.getClassification()
                    + e.getPremiere()
                    + e.getHour()
                    + e.getUsuariousuario()
                    + e.getMoviemovie());
        }

    }
}

