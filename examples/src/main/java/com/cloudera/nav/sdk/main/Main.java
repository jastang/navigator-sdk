package com.cloudera.nav.sdk.main;

import com.cloudera.nav.sdk.examples.datameer.JobLineageCreator;
import com.cloudera.nav.sdk.examples.datameer.json.JobDetails;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) throws IOException {
        //JSON Parsing
        String example = args[1];
                //Main.class.getClassLoader().getResource("datameer2.json").getPath();
        Reader reader = new FileReader(example);
        try {
            BufferedReader br = new BufferedReader(reader);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            //DMWorkbook wb = gson.fromJson(br, DMWorkbook.class);
            JobDetails jd = gson.fromJson(br, JobDetails.class);

            //System.out.println(jd.toString());
            JobLineageCreator jlc = new JobLineageCreator(args[0]);
            jlc.runLocal(jd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Post entities to Navigator
        //System.out.println(Main.class.getClassLoader().getResource("sample.conf").getPath());
       /* String path = args[0];
        String pigop = args[1];
        String pigexec = args[2];
        CustomLineageCreator clc = new CustomLineageCreator(path);
        clc.setPigOperationId(pigop);
        clc.setPigExecutionId(pigexec);
        clc.run();*/
    }
}