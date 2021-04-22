package one.digitalinnovation;

import java.io.IOException;

public class Terminal {
    public static void main(String[] args) throws IOException, InterruptedException {
        MenuCalculadora inicio = new MenuCalculadora();
        inicio.getMenu();
        System.exit(0);
    }
}
