package com.codecool.scc.services;

import com.codecool.scc.dao.FileReaderDao;
import com.codecool.scc.models.OutputFormat;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class SimpleCsvConverter {

    FileReaderDao fileReaderDao;

    public void convert(File file) {

        try {
            List<String[]> data = fileReaderDao.readData(file);
            OutputFormat outputFormat = OutputFormat.TABLE;
            System.out.println("I convert CSV to output format");

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }


    public void convert(File file, OutputFormat outputFormat) {

        try {
            List<String[]> data = fileReaderDao.readData(file);
            System.out.println("I convert CSV to output format");

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }

}
