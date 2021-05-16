package taller06;

public class Ciudad {

    private String nombreDeLaCiudad;
    private String provinciaDeLaCiudad;

    public Ciudad(String nombreCiudad, String provinciaCiudad) {

        this.nombreDeLaCiudad = nombreCiudad;
        this.provinciaDeLaCiudad = provinciaCiudad;
    }

    public void establecerNombreDeLaCiudad(String nombreCiudad) {
        this.nombreDeLaCiudad = nombreCiudad;
    }
    
    public String obtenerNombreDeLaCiudad() {
        return nombreDeLaCiudad;
    }    

    public void establecerProvinciaDeLaCiudad(String provinciaCiudad) {
        this.provinciaDeLaCiudad = provinciaCiudad;
    }
    
    public String obtenerProvinciaDeLaCiudad() {
        return provinciaDeLaCiudad;
    }
}
