/**
 * Ac� va la descripci�n de la aplicaci�n.
 * Este formato se llama Javadoc. �Invest�guenlo!
 */

package edu.grupo9.sigces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bienvenida();
    }

    private static void bienvenida() {
        System.out.println("Hola!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("�C�mo te llam�s?");
//        Usuario usuario = new Usuario(scanner.nextLine());
//        System.out.println("�Hola, " + usuario.getNombre() + "!");
        Paciente paciente = new Paciente(scanner.nextLine());
        System.out.println("�Hola, " + paciente.getNombre() + "!");
    }


}
