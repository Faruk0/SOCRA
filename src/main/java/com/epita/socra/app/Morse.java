package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import java.io.IOException;

import static org.mockito.Mockito.mock;

/**
 * Hello world!
 */
public final class Morse {
    private static IOAdapter adapter;

    private Morse() {
        this(new ConsoleAdapter());
    }

    public Morse(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args){
        while(true) {
            adapter = new ConsoleAdapter();
            adapter.write("Write number");
            String number = adapter.read();
            if (number.equals(""))
                break;
            Morse application = new Morse();
            String result = application.convert(number);
            adapter.write(result);
        }
    }

    String tomorse(char digit){
        if (digit == '0')
                return "_ _ _ _ _";
        if (digit == '1')
                return ". _ _ _ _";
        if (digit == '2')
                return ". . _ _ _";
        if (digit == '3')
                return ". . . _ _";
        if (digit == '4')
                return ". . . . _";
        if (digit == '5')
                return ". . . . .";
        if (digit == '6')
                return "_ . . . .";
        if (digit == '7')
                return "_ _ . . .";
        if (digit == '8')
                return "_ _ _ . .";
        if (digit == '9')
                return "_ _ _ _ .";
        return "";

        }

    public String convert(String number){
            String morsedigit = "";
            for (int i = 0; i < number.length() - 1; i++) {
                morsedigit += tomorse(number.charAt(i)) + " ";
            }
            morsedigit += tomorse(number.charAt(number.length() - 1));
            return morsedigit;
    }
}