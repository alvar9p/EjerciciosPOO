package herenciayclasesabstractas.mamiferos.canino;

import herenciayclasesabstractas.mamiferos.canino.Canino;

public class Lobo extends Canino{

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso,
                String nombreCientifico, String color, Float tamanoColmillos,
                Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    public String comer(){
        StringBuilder sb = new StringBuilder("La especie ");
        sb.append(especieLobo)
                .append(" puede comer hasta 6kg de carne por vez");
        return sb.toString();
    }

    public String dormir(){
        return "Generalmente descansa en valles de ríos, bosques y claros";
    }

    public String correr(){
        return "Los " + this.nombreCientifico + " pueden alcanzar hasta 65km/h";
    }

    public String comunicarse(){
        StringBuilder sb = new StringBuilder("Los ");
        sb.append(nombreCientifico)
                .append(" constituyen grandes camadas de ")
                .append(numCamada)
                .append(" ejemplares")
                .append(" y se comunican mediante aullidos");
        return sb.toString();
    }
}