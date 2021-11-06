package herenciayclasesabstractas.mamiferos.felino;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, Float altura, Float largo, Float peso,
                 String nombreCientifico, Float tamanoGarras, 
                  Integer velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    public String comer(){
        return "Las hembras de la especie de Tigre de " + especieTigre + " se destaca por cazar" +
                " en solitario";
    }

    public String dormir(){
        return "Los tigres de la especie " + especieTigre + " suelen dormir 6 horas diarias" +
                " durante la noche";
    }

    public String correr(){
        return "La velocidad para perseguir a sus presas es de: " + this.velocidad + "km/h";
    }

    public String comunicarse(){
        return "Se comunican mediante rugidos, ronroneos, soplidos entre otros";
    }
}