package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import static org.mockito.Mockito.mock;

/**
 * Hello world!
 */
public final class MorsetoArabic {
    private static IOAdapter adapter;

    private MorsetoArabic() {
        this(new ConsoleAdapter());
    }

    public MorsetoArabic(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        while (true) {
            adapter = new ConsoleAdapter();
            adapter.write("Write number");
            String number = adapter.read();
            if (number.equals(""))
                break;
            MorsetoArabic application = new MorsetoArabic();
            int result = application.convert(number);
            System.out.println(result);
        }
    }

    static int toarabic(String morse) {
        switch (morse) {
            case "_ _ _ _ _":
                return 0;
            case ". _ _ _ _":
                return 1;
            case ". . _ _ _":
                return 2;
            case ". . . _ _":
                return 3;
            case ". . . . _":
                return 4;
            case ". . . . .":
                return 5;
            case "_ . . . .":
                return 6;
            case "_ _ . . .":
                return 7;
            case "_ _ _ . .":
                return 8;
            case "_ _ _ _ .":
                return 9;
            default:
                return -1;

        }
    }

    public static int convert(String number) {
        int arabicdigit = 0;
        for (int i = 0; i < number.length(); i += 10) {
            arabicdigit *= 10;
            arabicdigit += toarabic(number.substring(i, i + 9));
        }
        return arabicdigit;
    }
}
