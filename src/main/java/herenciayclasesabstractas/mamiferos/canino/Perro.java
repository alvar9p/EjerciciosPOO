package herenciayclasesabstractas.mamiferos.canino;

import herenciayclasesabstractas.mamiferos.canino.Canino;

public class Perro extends Canino{

    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso,
                 String nombreCientifico, String color, Float tamanoColmillos,
                 Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Pueden ingerir alimento balanceado o carnes ya que su fuerza de mordida es " +
                " de " + fuerzaMordida + "psi";
    }

    @Override
    public String dormir() {
        return "Los " + nombreCientifico + " suelen dormir generalmente unas " +
                "8 horas repartidas durante el día y la noche";
    }

    @Override
    public String correr() {
        return "Son perros muy ágiles, pueden alcanzar velocidades de hasta 50km/h";
    }

    @Override
    public String comunicarse() {
        return "Su comunicación es mediante ladridos";
    }
}