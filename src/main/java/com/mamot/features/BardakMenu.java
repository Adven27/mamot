package com.mamot.features;

import org.joda.time.LocalDateTime;

import java.util.Map;

public class BardakMenu {
    private final DAO dao;

    public BardakMenu(DAO dao) {
        this.dao = dao;
    }

    public String menu(LocalDateTime dateTime) {
        Map<Integer, String> menu = dao.getWeekMenu();
        return menu.get(dateTime.getDayOfWeek());
    }
}
