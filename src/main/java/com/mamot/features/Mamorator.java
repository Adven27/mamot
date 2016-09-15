package com.mamot.features;

import java.util.Random;

public class Mamorator {

    private final DAO dao;

    public Mamorator(DAO dao) {
        this.dao = dao;
    }

    public String mamate(String msg) {
        return "мам" + msg.substring(1) + "... " + dao.getEndWord(new Random().nextInt());
    }

}
