package edu.grupo9.sigces;

public abstract class Usuario {
    /**
     * TODO - significa "Por hacer". Y acá, como ven, hay que hacer TODO.
     * Por empezar, deberían declarar las variables de clase: Nombre, apellido, dni, etc.
     * Todas las que sean comunes a los tres tipos de Usuario que utiliza esta aplicación:
     * Médico, Paciente y Admin. Todas aquellas variables que sean específicas de cada rol,
     * por ej., matrícula y especialidad, van en la clase Medico.
     */

    // Declarar variables de Usuario. Va una de ejemplo.
    private String nombre;


    // Constructores de la clase. Esto lo hace la IDE

    public Usuario() {

    }

    public Usuario(String nombre) {
        this.nombre = nombre;
    }


    // Getters y Setters de la clase. Estos también los hace la IDE :)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
