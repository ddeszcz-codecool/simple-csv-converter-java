package com.codecool.scc.view;



import java.util.List;

public class TableOutputFormatter implements OutputFormatter {

    @Override
    public void printToConsole(List<String[]> data) {
        PrettyTable prettyTable = new PrettyTable(data.get(0));

        for (String[] datum : data) {
            prettyTable.addRow(datum);
        }
        System.out.println(prettyTable);
    }
}
