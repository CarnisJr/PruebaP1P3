package Logica;

public class Guerrero {
    private String nombre;
    private String raza;            //Saiyajin, Namekusein, terricola
    private String habilidad;       //Kamehameha, canio especial, onda explosiva
    private int nivelPoder;

    public Guerrero(String nombre, String raza, String habilidad, int nivelPoder) {

        this.nombre = nombre;
        this.raza = raza;
        this.habilidad = habilidad;
        this.nivelPoder = nivelPoder;
    }

    public Guerrero(){

        this.nombre = "Pedro";
        this.raza = "Saiyajin";
        this.habilidad = "Kamehameha";
        this.nivelPoder = 203;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }
}
