package com.gwazasoftwares;

import com.gwazasoftwares.models.Vehicle;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        HashMap<String, String> countries = new HashMap<>();
//        countries.put("kenya", "Nairobi");
//        countries.put("Uganda", "kampala");
//        countries.put("Tanzania", "darsalaam");
//
//        System.out.println(countries);

        HashMap<String,Vehicle> vehicles = new HashMap<>();
        Vehicle toyota = new Vehicle("KBY/002/16","red","probox","5 seater");
        Vehicle nissan = new Vehicle("KBc/002/16","blue","xtray","psv");
        vehicles.put("toyota",toyota);
        vehicles.put("nissan",nissan);

        System.out.println(vehicles.get("nissan"));


    }
}
