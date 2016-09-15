package com.mamot.features;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MamorateSpec {

    private DAO dao = mock(DAO.class);
    private Mamorator sut = new Mamorator(dao);

    @Test
    public void shouldReplaceFirstLetterToMam() throws Exception {
        String msg = "тест";
        assertThat(sut.mamate(msg), containsString("мамест"));
    }

    @Test
    public void shouldAddCatchWordsToTheEnd() throws Exception {
        String msg = "тест";
        when(dao.getEndWord(anyInt())).thenReturn("наверное");
        assertThat(sut.mamate(msg), endsWith("... наверное"));
    }

}
