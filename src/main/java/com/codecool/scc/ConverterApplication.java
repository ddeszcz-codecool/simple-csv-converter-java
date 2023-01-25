package com.codecool.scc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConverterApplication {

    public static void main(String[] args) {

        System.out.println("\n\n------------------------------- CONFIGURATION STARTS -------------------------------\n\n");

        SpringApplication.run(ConverterApplication.class, args);

        System.out.println("\n\n---------------------------CONFIGURATION ENDS, APP STARTs --------------------------\n\n");


        switch (args.length) {
            case 0:
                System.out.println("No input file defined");
                break;
            default:
                System.out.println("Invalid number of arguments. Enter only one or two arguments");
        }


    }

}


