package herencia.ejercicio2;

public class EjemploProductosAlmacen {
    public static void main(String[] args) {

        Producto[] productos;

        System.out.println("Ingresando productos: ");
        Lacteo lacteo1 = new Lacteo("Queso Petacones", 3.50, 2, 200);
        Lacteo lacteo2 = new Lacteo("Queso rayado", 2.25, 2, 400);
        Fruta fruta1 = new Fruta("Manzana", 1.00, 0.50, "Rojo");
        Fruta fruta2 = new Fruta("Pera", 0.99, 0.45, "verde");
        Limpieza limpieza1 = new Limpieza("Detergente", 10.00, "polvo", 3.78);
        Limpieza limpieza2 = new Limpieza("Escoba", 7.25, "Palo y escobilla", 0.00);
        NoPerecible noPerecible1 = new NoPerecible("Miel de abeja", 5.00, 1, 100);
        NoPerecible noPerecible2 = new NoPerecible("Ron Botran", 18.75, 5, 1000);

        Producto[] producto = new Producto[8];
        producto[0] = lacteo1;
        producto[1] = lacteo2;
        producto[2] = fruta1;
        producto[3] = fruta2;
        producto[4] = limpieza1;
        producto[5] = limpieza2;
        producto[6] = noPerecible1;
        producto[7] = noPerecible2;

        for(int i = 0; i < 8; i++){
            System.out.println(producto[i]);
        }
    }
}