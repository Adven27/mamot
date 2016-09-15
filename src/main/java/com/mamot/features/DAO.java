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
        words.add("��������");
        words.add("����� ����");
        words.add("��� �������");
        words.add("������!");
        return words;
    }

    public Map<Integer, String> getWeekMenu() {
        Map<Integer, String> words = new HashMap();
        words.put(1, "30% �� ������");
        words.put(2, "30% �� �������");
        words.put(3, "30% �� ��������");
        words.put(4, "30% �� ���������");
        words.put(5, "30% �� ����������");
        words.put(6, "30% �� �����������");
        words.put(7, "30% �� ���");
        return words;
    }
}
