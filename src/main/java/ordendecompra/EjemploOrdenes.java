package ordendecompra;

import java.util.Date;

public class EjemploOrdenes {

    public static void main(String[] args) {

        OrdenCompra oc1 = new OrdenCompra("Almacenes Potoware");

            oc1.addProducto(new Producto("Colanta", "Queso Chedar ", 15400));
        oc1.addProducto(new Producto("Bukanero", "Alitas BBQ ", 16500));
        oc1.addProducto(new Producto("Pietran", "Jamon Ahumado", 12500));
        oc1.addProducto(new Producto("Festival", "Galletas ChocoMix", 4500));
            oc1.setCliente(new Cliente("Juan", "Contreras"));
            oc1.setFecha(new Date());

        OrdenCompra oc2 = new OrdenCompra("Almacenes Potoware");
        oc2.addProducto(new Producto("Bic","Caja Esferos",10000));
        oc2.addProducto(new Producto("Norma","Cuaderno cuadriculado ",2800));
        oc2.addProducto(new Producto("Nata","Borrador ",500));
        oc2.addProducto(new Producto("Dispapeles","Carpeta Plastica",2500));
        oc2.setCliente(new Cliente("Zulma","Farid"));
        oc2.setFecha(new Date());

        OrdenCompra oc3 = new OrdenCompra("Almacenes Potoware");
        oc3.addProducto(new Producto("Lenovo","Portatil x240 ",2500000));
        oc3.addProducto(new Producto("Dell","Portatil Latitude ",4600000));
        oc3.addProducto(new Producto("Kingston","SSD BX500 256GB ",120000));
        oc3.addProducto(new Producto("Kingston","USB 64GB",45000));
        oc3.setCliente(new Cliente("Alejandro","Potosi"));
        oc3.setFecha(new Date());

        OrdenCompra[] ocs =new OrdenCompra[3];

        ocs[0] = oc1;
        ocs[1] = oc2;
        ocs[2] = oc3;


        for (OrdenCompra o: ocs)
        {
            System.out.println(o.LINEAS_SEPARADORAS);
            System.out.println(o.getDescripcion());
            System.out.println(o.LINEAS_SEPARADORAS);
            System.out.println("Factura #"+o.getIdentificador()+" - Fecha: "+o.getFecha());
            System.out.println(o.getCliente().toString());
            System.out.println("Productos:");
            for (Producto p: o.getProductos())
            {
                System.out.println(p.getNombre()+"  "+p.getFabricante()+"   "+p.getPrecio());
            }
            System.out.println("Total: " + o.calcularGranTotal());
            System.out.println(o.LINEAS_SEPARADORAS);
        }

        System.out.println(oc1.calcularGranTotal());

    }
}