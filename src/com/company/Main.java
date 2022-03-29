package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
	HashSet<City26> city = new HashSet<>();
        city.add(new City26(1,"Mockva","Rossia",12087000));
        city.add(new City26(2,"Peterburg","Rossia",8186300));
        city.add(new City26(3,"Riga","Latvia",787000));
        city.add(new City26(4,"Kaliningrad","Rossia",687000));
        city.add(new City26(5,"Och","Kyrgysctan",687000));
        city.add(new City26(6,"Tallin","Ectonia",587000));

        TreeSet<City26> cities = new TreeSet<City26>(city);
        for  (City26 i : cities) {if (i.getKodu()%2!=0) {
            System.out.println(i);}
        }

    }
}
