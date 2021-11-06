package herenciayclasesabstractas.mamiferos.felino;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso,
                String nombreCientifico, Float tamanoGarras, Integer velocidad,
                Integer numManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public String comer(){
        StringBuilder sb = new StringBuilder("Los leones son ");
        sb.append("Felinos que junto a ")
                .append(numManada)
                .append(" de su misma especie ")
                .append("son  imparables cazando en ")
                .append(this.habitat);
        return sb.toString();
    }

    public String dormir(){
        return "Los leones suelen dormir 8 horas diarias";
    }

    public String correr(){
        return "Los leones tienen una velocidad máxima de " + this.velocidad  +
                "km/h que suele ser suficiente para la mayoría de sus presas";
    }

    public String comunicarse(){
        StringBuilder sb = new StringBuilder("Su potencia de rugido de ");
        sb.append(potenciaRugidoDecibel)
                .append(" decibeles los hace muy intimidatorios ")
                .append("en especial si están en manada de ")
                .append(numManada)
                .append(" ejemplares");
        return sb.toString();
    }

}