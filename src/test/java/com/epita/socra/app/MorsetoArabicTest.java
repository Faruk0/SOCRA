package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class MorsetoArabicTest {
    @Test
    public void given_10_check_value_of_10_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". _ _ _ _ _ _ _ _ _");
        assert result == 10;
    }
    @Test
    public void given_1903_check_value_of_1903_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". _ _ _ _ _ _ _ _ . _ _ _ _ _ . . . _ _");
        assert result == 1903;
    }
    @Test
    public void given_83_check_value_of_83_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert("_ _ _ . . . . . _ _");
        assert result == 83;
    }
    @Test
    public void given_42_check_value_of_42_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". . . . _ . . _ _ _");
        assert result == 42;
    }
    @Test
    public void given_999_check_value_of_999_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert("_ _ _ _ . _ _ _ _ . _ _ _ _ .");
        assert result == 999;
    }

    @Test
    public void given_12345_check_value_of_12345_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". _ _ _ _ . . _ _ _ . . . _ _ . . . . _ . . . . .");
        assert result == 12345;
    }

    @Test
    public void given_71_check_value_of_71_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert("_ _ . . . . _ _ _ _");
        assert result == 71;
    }
    @Test
    public void given_34_check_value_of_34_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". . . _ _ . . . . _");
        assert result == 34;
    }
    @Test
    public void given_78_check_value_of_78_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert("_ _ . . . _ _ _ . .");
        assert result == 78;
    }
    @Test
    public void given_567_check_value_of_567_in_arabic() {
        IOAdapter mock = mock(IOAdapter.class);
        MorsetoArabic morse = new MorsetoArabic(mock);
        int result = morse.convert(". . . . . _ . . . . _ _ . . .");
        assert result == 567;
    }
}
