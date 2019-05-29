package com.epita.socra.app;

import org.junit.Test;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class MorseTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void given_10_check_value_of_10_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("10");
        assert result.equals(". _ _ _ _ _ _ _ _ _");
    }
    @Test
    public void given_1903_check_value_of_1903_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("1903");
        assert result.equals(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _");
    }
    @Test
    public void given_83_check_value_of_83_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("83");
        assert result.equals("_ _ _ . . . . . _ _");
    }
    @Test
    public void given_42_check_value_of_42_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("42");
        assert result.equals(". . . . _ . . _ _ _");
    }
    @Test
    public void given_999_check_value_of_999_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("999");
        assert result.equals("_ _ _ _ . _ _ _ _ . _ _ _ _ .");
    }

    @Test
    public void given_567_check_value_of_567_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("567");
        assert result.equals(". . . . . _ . . . . _ _ . . .");
    }
}
