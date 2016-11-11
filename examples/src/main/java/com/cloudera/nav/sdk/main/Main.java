package com.cloudera.nav.sdk.main;

import com.cloudera.nav.sdk.examples.lineage.CustomLineageCreator;

public class Main {
    public static void main(String[] args) {
        CustomLineageCreator clc = new CustomLineageCreator("C:\\dev\\navigator-sdk\\examples\\src\\main\\resources\\sample.conf");
        clc.run();
    }
}
