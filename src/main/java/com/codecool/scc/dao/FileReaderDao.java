package com.codecool.scc.dao;

import com.opencsv.CSVReader;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Component
public class FileReaderDao {

    public List<String[]> readData(File file) throws IOException {
            CSVReader csvReader = new CSVReader(new FileReader(file));
            return csvReader.readAll();
    }
}
