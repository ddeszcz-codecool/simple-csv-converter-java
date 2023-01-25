package com.codecool.scc.view;

import java.util.List;

public class XmlOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        System.out.println("<csv>");

        for (String[] line : data) {
            System.out.println("\t<row>");

            for (String column : line) {
                System.out.println("\t\t<column>" + column + "</column>");
            }
            System.out.println("\t</row>");
        }
        System.out.println("</csv>");
    }
}
