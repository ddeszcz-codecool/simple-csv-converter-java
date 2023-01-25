package com.codecool.scc;

import com.codecool.scc.models.OutputFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {

        System.out.println("\n\n------------------------------- CONFIGURATION STARTS -------------------------------\n\n");

        SpringApplication.run(ConverterApplication.class, args);

        System.out.println("\n\n---------------------------CONFIGURATION ENDS, APP STARTs --------------------------\n\n");

        File file;
        OutputFormat outputFormat;

        switch (args.length) {
            case 0:
                System.out.println("No input file defined");
                break;

            case 1:
                file = new File(args[0]);
                break;

            case 2:
                try {
                    outputFormat = OutputFormat.valueOf(args[0].toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid format type. Enter json, xml or table");
                    break;
                }
                file = new File(args[1]);
                break;


            default:
                System.out.println("Invalid number of arguments. Enter only one or two arguments");
        }


    }

}


