package com.cloudera.nav.sdk.main;

import com.cloudera.nav.sdk.examples.lineage.CustomLineageCreator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.cloudera.nav.sdk.examples.datameer.json.DMWorkbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        //JSON Parsing
        String example = Main.class.getClassLoader().getResource("datameer.json").getPath();
        Reader reader = new FileReader(example);
        try {
            BufferedReader br = new BufferedReader(reader);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            DMWorkbook wb = gson.fromJson(br, DMWorkbook.class);

            System.out.println(wb.getWorkbook().getVersion());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Post entities to Navigator
        CustomLineageCreator clc = new CustomLineageCreator(Main.class.getClassLoader().getResource("sample.conf").getPath());
        clc.run();
    }
}
