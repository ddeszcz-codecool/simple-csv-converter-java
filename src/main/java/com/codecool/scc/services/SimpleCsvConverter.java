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

    public SimpleCsvConverter(FileReaderDao fileReaderDao) {
        this.fileReaderDao = fileReaderDao;
    }

    public void convert(File file) {

        try {
            System.out.println("I convert CSV to output format, outputFormat not provided\n\n\n");
            OutputFormat outputFormat = OutputFormat.TABLE;
            List<String[]> data = fileReaderDao.readData(file);

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }


    public void convert(File file, OutputFormat outputFormat) {

        try {
            System.out.println("I convert CSV to output format, outputFormat provided\n\n\n");
            List<String[]> data = fileReaderDao.readData(file);

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }

}
