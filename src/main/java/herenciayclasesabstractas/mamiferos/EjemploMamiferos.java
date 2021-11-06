package herenciayclasesabstractas.mamiferos;

import herenciayclasesabstractas.mamiferos.felino.Guepardo;
import herenciayclasesabstractas.mamiferos.felino.Tigre;
import herenciayclasesabstractas.mamiferos.felino.Leon;
import herenciayclasesabstractas.mamiferos.canino.Perro;
import herenciayclasesabstractas.mamiferos.canino.Lobo;

import java.util.ArrayList;
import java.util.List;

public class EjemploMamiferos {
    public static void main(String[] args) {

        List<Mamifero> mamiferos = new ArrayList<>();

        Tigre bengala = new Tigre("India", 1.1f, 3.1f,226f,
                "Tigres de Bengala", 6.5f, 80,
                "Bengala");
        mamiferos.add(bengala);

        Leon nubia = new Leon("Este de África",1.2f,2.5f, 185f,
                "Leones de Nubia", 5f, 70,
                6, 25.6f);
        mamiferos.add(nubia);

        Guepardo tanzano = new Guepardo("Kenia", 0.9f, 1.5f,65f,
                "Guepardos de Tanzania", 5f, 96);


        Lobo siberiano = new Lobo("Rusia", 0.9f, 1.4f, 40f,
                "Lobos Siberianos", "Gris oscuro", 9f,
                45, "Siberiano");
        mamiferos.add(siberiano);

        Perro labrador = new Perro("Canadá", 0.6f,1.2f, 40f,
                "Labrador Retriever", "Amarillo claro", 3f,
                230);
        mamiferos.add(labrador);

        for (Mamifero m: mamiferos){
            System.out.println();
            System.out.println("Nombre: " + m.getNombreCientifico() + "\n");
            System.out.println(m.comer());
            System.out.println(m.dormir());
            System.out.println(m.correr());
            System.out.println(m.comunicarse());
            System.out.println("\n==========");
        }

    }
}