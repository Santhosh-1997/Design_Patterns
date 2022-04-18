package com.masai.Memento;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private String content;
    //private String previous;
    private List<String> preContent = new ArrayList<>();

    public String getContent() {

        if(preContent.size() == 0)
            return "";

        return preContent.get(preContent.size()-1);
    }

    public void setContent(String content) {
        //previous = this.content;
        this.content = content;
        preContent.add(content);
    }

    public void undo(){

        //this.content = previous;
        preContent.remove(preContent.size()-1);

    }

}
