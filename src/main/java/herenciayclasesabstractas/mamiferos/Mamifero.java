package herenciayclasesabstractas.mamiferos;

abstract public class Mamifero {

    protected String habitat;
    protected Float altura;
    protected Float largo;
    protected Float peso;
    protected String nombreCientifico;

    public Mamifero(){

    }

    public Mamifero(String habitat, Float altura, Float largo, Float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitat() {
        return habitat;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getLargo() {
        return largo;
    }

    public Float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();
}