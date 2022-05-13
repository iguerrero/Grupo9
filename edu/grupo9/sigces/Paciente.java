package edu.grupo9.sigces;

public class Paciente extends Usuario {

    /**
     * Esta clase, al igual que Medico y Admin, hereda de Usuario, así que hay que ponerlo.
     * Así -> public class Paciente extends Usuario { }
     */

    // Declarar variables de Usuario. Va una de ejemplo.



    // Constructores de la clase. Esto lo hace la IDE

    public Paciente() {
    }

    public Paciente(String nombre) {
        this.nombre = nombre;
    }
}
