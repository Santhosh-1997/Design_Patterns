package com.masai.TemplateMethodPattern.Example;

public class TransferMoneyTask extends Task {

    //anyway default constructor of Parent class will be called. And there I have assigned audit trail object!

    @Override
     protected void doExecute() {
        System.out.println("Transferring money");
    }
}
