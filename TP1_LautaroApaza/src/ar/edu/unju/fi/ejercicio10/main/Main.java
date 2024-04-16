package ar.edu.unju.fi.ejercicio10.main;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pizza pizza = new Pizza();
        int i = 1;
        try {
            do {
                System.out.println("------------------------------");
                System.out.println("** PIZZA "+ i + " **");
                System.out.print("Ingrese el diametro: ");
                pizza.setDiametro(redondeo(in.nextFloat()));
                in.nextLine();

                System.out.print("¿Tiene ingrediente especiales?(true/false) ");
                pizza.setIngredientesEspeciales(in.nextBoolean());


                System.out.println(pizza.toString());


                System.out.println("-------------------------------------");
                i++;
            } while (i <= 3);

        } catch (Exception e) {
            System.out.println("Se esperaba un valor numerico(diametro) y boolean(ingrediente)");
        }
    }

    /**
     * Valor redondeado a 20, 30 o 40 unicamente
     * @param num
     * @return redondeo
     */
    public static int redondeo(float num) {
        return num <= 25 ? 20
                : num <= 30 ? 30
                : num <= 35 ? 30 : 40;
    }
}
