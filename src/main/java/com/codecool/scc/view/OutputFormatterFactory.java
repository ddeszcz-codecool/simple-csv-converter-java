package com.codecool.scc.view;

import com.codecool.scc.models.OutputFormat;
import org.springframework.stereotype.Component;

@Component
public class OutputFormatterFactory {

    public OutputFormatter createByFormat(OutputFormat outputFormat) {
        OutputFormatter outputFormatter = null;

        switch (outputFormat) {
            case XML:
                outputFormatter = new XmlOutputFormatter();
                break;

            case JSON:
                outputFormatter = new JsonOutputFormatter();
                break;

            case TABLE:
                outputFormatter = new TableOutputFormatter();
                break;
        }

        return outputFormatter;
    }
}
