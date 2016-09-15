package com.mamot.features;

import org.joda.time.LocalDateTime;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BardakMenuSpec {

    private DAO dao = mock(DAO.class);
    private BardakMenu sut = new BardakMenu(dao);

    @Test
    public void shoulReturnMenuForDate() throws Exception {
        LocalDateTime dateTime = new LocalDateTime(2016, 9, 15, 1, 1);
        when(dao.getWeekMenu()).thenReturn(getWeekMenu());
        assertThat(sut.menu(dateTime), is("30% на салаты"));
    }

    private static Map<Integer, String> getWeekMenu() {
        Map<Integer, String> words = new HashMap();
        words.put(4, "30% на салаты");
        return words;
    }
}