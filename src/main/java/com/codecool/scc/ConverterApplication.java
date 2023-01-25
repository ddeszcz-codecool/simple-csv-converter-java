package com.codecool.scc;

import com.codecool.scc.models.OutputFormat;
import com.codecool.scc.services.SimpleCsvConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.File;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {
        int intTimesRepeated = 20;
        System.out.println("\n\n"+ "-".repeat(intTimesRepeated) + "CONFIGURATION STARTS" + "-".repeat(intTimesRepeated) + "\n\n");

        ApplicationContext ctx = SpringApplication.run(ConverterApplication.class, args);
        SimpleCsvConverter scc = (SimpleCsvConverter) ctx.getBean("simpleCsvConverter");

        System.out.println("\n\n"+ "-".repeat(intTimesRepeated) + "CONFIGURATION ENDS, APP STARTs" + "-".repeat(intTimesRepeated) + "\n\n");


        File file;
        OutputFormat outputFormat;

        switch (args.length) {
            case 0:
                System.out.println("No input file defined");
                break;

            case 1:
                file = new File(args[0]);
                scc.convert(file);
                break;

            case 2:
                try {
                    outputFormat = OutputFormat.valueOf(args[0].toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid format type. Enter json, xml or table");
                    break;
                }
                file = new File(args[1]);
                scc.convert(file,outputFormat);
                break;


            default:
                System.out.println("Invalid number of arguments. Enter only one or two arguments");
        }


    }

}


