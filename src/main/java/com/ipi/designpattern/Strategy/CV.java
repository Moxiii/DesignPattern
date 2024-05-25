package com.ipi.designpattern.Strategy;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CV {
    private int id;
    private String content;
    private boolean isPDF;

    public CV(int id, String content, boolean isPDF) {
        this.id = id;
        this.content = content;
        this.isPDF = isPDF;
    }



    public boolean isPDF() {
        return isPDF;
    }
}
