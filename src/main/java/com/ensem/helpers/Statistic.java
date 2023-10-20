package com.ensem.helpers;

import com.ensem.Objects.NbrDose;
import com.ensem.Objects.NbrVacc;

import java.util.Scanner;

public class Statistic {
    public static void Statistic()  {

        while (true) {

            System.out.println("--------Statistic--------");
            System.out.println("1.View statistic of vaccine ");
            System.out.println("2.View statistic of doses ");
            System.out.println("3.Back To MENU  ");
            System.out.println("Please enter your choice:");
            Scanner in = new Scanner(System.in);
            String line = in.nextLine();

            switch (line) {
                case "1":
                    System.out.println("statistic of vaccine");
                    Statistic.AvgVacc();
                    break;


                case "2":
                    System.out.println("statistic of doses");

                    Statistic.AvgDose();
                    break;

                case "3":
                    System.out.println("Back To MENU");
                    Admin.menu_admin();
                    break;


            }
        }

    }

    private static void AvgVacc() {
        NbrVacc.NbrVaccine();
    }
    private static void AvgDose() {

        System.out.println("number of doses");
        NbrDose.TotalNbrDose();
        NbrDose.NbrDose0();
        NbrDose.NbrDose1();
        NbrDose.NbrDose2();
        NbrDose.NbrDose3();

    }
}
