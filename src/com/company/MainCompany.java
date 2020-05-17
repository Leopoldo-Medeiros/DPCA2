package com.company;

import Investor.Investor;
import com.company.CompanyBuilder;
import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class MainCompany {

    private static Object Investor;

    public static void main(String[] args) throws IOException {
        // write your code here

        File file;
        FileReader fr;
        fr = new FileReader("/DPCA2/Investor");
        BufferedReader br = new BufferedReader(fr);

        int a;
        while ((a = br.read()) != -1) {
            System.out.println((char) a);
        }
        br.close();
        fr.close();

        Investor investor = new Investor(0).setInvestName("");
        String company = new CompanyBuilder(0).setCompName("CCT");
        System.out.println(company);

        Random r = new Random();

        ArrayList arrayList;
        int r_int = r.nextInt(500);
        System.out.println("Random Shares: "+r_int);

        double r_price = r.nextDouble();
        System.out.println("Random Price: "+r_price);

        UUID uniqueID = UUID.randomUUID();
        System.out.println(uniqueID);









    }
}
