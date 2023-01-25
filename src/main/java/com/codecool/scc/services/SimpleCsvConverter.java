package com.codecool.scc.services;

import com.codecool.scc.dao.FileReaderDao;
import com.codecool.scc.models.OutputFormat;
import com.codecool.scc.view.OutputFormatter;
import com.codecool.scc.view.OutputFormatterFactory;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class SimpleCsvConverter {

    FileReaderDao fileReaderDao;
    OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReaderDao fileReaderDao, OutputFormatterFactory outputFormatterFactory) {
        this.fileReaderDao = fileReaderDao;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert(File file) {

        try {
            List<String[]> data = fileReaderDao.readData(file);
            OutputFormatter outputFormatter = outputFormatterFactory.createByFormat(OutputFormat.TABLE);
            outputFormatter.printToConsole(data);

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }


    public void convert(File file, OutputFormat outputFormat) {

        try {
            List<String[]> data = fileReaderDao.readData(file);
            OutputFormatter outputFormatter = outputFormatterFactory.createByFormat(outputFormat);
            outputFormatter.printToConsole(data);

        } catch (IOException e) {
            System.out.println("Wrong file name. Please check if such file exists.");
        }
    }

}
