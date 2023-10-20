package com.ensem.Objects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NbrVacc {
    public static void NbrVaccine(){
        try
        {
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3300/data_student";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl,"imrane" , "1234");

            Statement stmt = conn.createStatement();

            System.out.println("Calculate...");

            String sql = "SELECT COUNT(*) AS nbvaccinés  FROM  student WHERE  doses_number>0 ;";
            ResultSet rs = stmt.executeQuery(sql);

            int nbLignes=0;
            rs.next();
            nbLignes = rs.getInt("nbvaccinés");
            System.out.println("Le nombre des étudiants vaccinés est : " + nbLignes );

            conn.close();
        }
        catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }}


    }

