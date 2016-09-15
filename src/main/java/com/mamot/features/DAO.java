package com.mamot.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO {

    protected String getEndWord(int index) {
        return endWords().get(index % endWords().size());
    }

    private static List<String> endWords() {
        ArrayList words = new ArrayList();
        words.add("наверное");
        words.add("может быть");
        words.add("мне кажется");
        words.add("уверен!");
        return words;
    }

    public Map<Integer, String> getWeekMenu() {
        Map<Integer, String> words = new HashMap();
        words.put(1, "30% на салаты");
        words.put(2, "30% на горячее");
        words.put(3, "30% на холодное");
        words.put(4, "30% на вчерашнее");
        words.put(5, "30% на завтрашнее");
        words.put(6, "30% на сегодняшнее");
        words.put(7, "30% на все");
        return words;
    }
}
