package com.example.sping_portfolio.kaavyaCollegeBoardFRQs.FRQ9;

import java.util.ArrayList;

public class PictureBook extends Book{

    private String illustrator;
    private String info;

    public PictureBook (String t, String a, String i){
        super(t, a);
        illustrator = i;
    }

    public String printBookInfo() {
        info = super.printBookInfo();
        if (!illustrator.equals("")) {
            info += " and illustrated by " + illustrator;
        }
        return info;
    }

}
