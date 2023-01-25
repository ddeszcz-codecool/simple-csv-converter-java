package com.codecool.scc.view;

import com.google.gson.Gson;

import java.util.List;

public class JsonOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        System.out.println("{");
        for (String[] line : data) {
            System.out.println("\t" + new Gson().toJson(line) + ",");
        }
        System.out.println("}");
    }

}
