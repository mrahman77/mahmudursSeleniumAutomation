package goNavigate;

import base.CommonAPI;

import java.io.IOException;
import java.util.ArrayList;

public class SearchUsingExcel extends Excle {
    public void tryExel() throws IOException {
        ArrayList<String> searchAbleUsers = dataFromExcel("/Users/mahmudurrahman/Develop/MahmudursSeleniumAutomation/Harvard/data/WhatCanYouFind.xls", "Sheet1", 0);
        for (int i = 1; i < searchAbleUsers.size(); i++) {
            clickByXpath("//input[@type='search']");
            typeByXpath("//input[@type='search']", searchAbleUsers.get(i));
          //  typeByXpath("", searchAblePass.get(i));
        }
    }
}
