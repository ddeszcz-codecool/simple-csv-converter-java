package com.codecool.scc.dao;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FileReaderDao {

    public List<String[]> readData(File file) throws IOException {

        return new ArrayList<String[]>();
    }
}
