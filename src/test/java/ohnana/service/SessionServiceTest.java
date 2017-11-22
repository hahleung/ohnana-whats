package ohnana.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SessionServiceTest {
    @Test
    @DisplayName("#getSillyId - returns some stuff")
    public void getSillyId() {
        int subject = SessionService.getSillyId();

        assertTrue(subject < 12);
    }

    @Test
    @DisplayName("#getTimeText - returns some stuff")
    public void getTimeText() {
        String timeText = SessionService.getTimeText();

        assertEquals(timeText.length(), 48);
    }
}
