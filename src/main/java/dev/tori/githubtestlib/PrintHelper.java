package dev.tori.githubtestlib;

import org.jetbrains.annotations.Contract;

/**
 * @author <a href="https://github.com/7orivorian">7orivorian</a>
 * @since 1.0.0
 */
public final class PrintHelper {

    @Contract(pure = true)
    private PrintHelper() {
    }

    /**
     * @param string the {@linkplain String} to print.
     */
    public static void print(String string) {
        System.out.println(string);
    }
}