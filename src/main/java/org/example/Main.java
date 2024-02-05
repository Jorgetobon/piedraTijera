package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        while (true) {
            System.out.println("Elige: piedra, papel o tijera: ");
            String eleccionJugador = scanner.nextLine().toLowerCase();


            if (!eleccionJugador.equals("piedra") && !eleccionJugador.equals("papel")
                    && !eleccionJugador.equals("tijera")) {
                System.out.println("Elección no válida. Por favor, elige piedra, papel o tijera.");
                continue;
            }

            int indiceComputadora = random.nextInt(5);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora eligió: " + eleccionComputadora);

        }
    }
}
