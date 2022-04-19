package com.masai.TemplateMethodPattern.Example;

public class GenerateReportTask extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generating Report");
    }
}
