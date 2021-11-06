package herenciayclasesabstractas.mamiferos.felino;

public class Guepardo extends Felino{

    public Guepardo(String habitat, Float altura, Float largo, Float peso,
                    String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public String comer(){
        return "Los geopardos pueden ingerir hasta 85 libras de carne" +
                " como así también pasar días sin comer";
    }

    public String dormir(){
        return "Pueden dormir en lugares a la interperie o donde les guste de" +
                " su habitat, como por ejemplo " + this.habitat;
    }

    public String correr(){
        StringBuilder sb = new StringBuilder("El geopardo es el animal");
        sb.append(" terrestre mas veloz del mundo")
                .append(" con una velocidad máxima de ")
                .append(this.velocidad)
                .append("km/h que es alcanzada en 3 segundos");
        return sb.toString();
    }

    public String comunicarse(){
        return "El geopardo no puede rugir, emite un sonido agudo";
    }
}