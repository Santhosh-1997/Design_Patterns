package com.masai.TemplateMethodPattern.Test;


import com.masai.TemplateMethodPattern.Example.Task;
import com.masai.TemplateMethodPattern.Example.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

       Task task = new TransferMoneyTask();
       task.execute();          //not able to access doExcecute() directly because we made it protective!
                                //the only option is execute() and therefore, every task will be recorded before doing that task

    }

}
