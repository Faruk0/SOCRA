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

    @Test
    public void given_18_check_value_of_18_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("18");
        assert result.equals(". _ _ _ _ _ _ _ . .");
    }

    @Test
    public void given_96_check_value_of_96_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("96");
        assert result.equals("_ _ _ _ . _ . . . .");
    }

    @Test
    public void given_07_check_value_of_07_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("07");
        assert result.equals("_ _ _ _ _ _ _ . . .");
    }

    @Test
    public void given_56_check_value_of_56_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("56");
        assert result.equals(". . . . . _ . . . .");
    }

    @Test
    public void given_12345_check_value_of_12345_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("12345");
        assert result.equals(". _ _ _ _ . . _ _ _ . . . _ _ . . . . _ . . . . .");
    }
    @Test
    public void given_4_check_value_of_4_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("4");
        assert result.equals(". . . . _");
    }
    @Test
    public void given_78_check_value_of_78_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("78");
        assert result.equals("_ _ . . . _ _ _ . .");
    }
    @Test
    public void given_34_check_value_of_34_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("34");
        assert result.equals(". . . _ _ . . . . _");
    }
    @Test
    public void given_71_check_value_of_71_in_morse() {
        IOAdapter mock = mock(IOAdapter.class);
        Morse morse = new Morse(mock);
        String result = morse.convert("71");
        assert result.equals("_ _ . . . . _ _ _ _");
    }
}
