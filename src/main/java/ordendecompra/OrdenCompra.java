package ordendecompra;

import java.util.Date;

public class OrdenCompra {

    private Integer identificador;
    private static int ultimoIdentificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;
    private int indiceProducto = 0;
    public static String LINEAS_SEPARADORAS= "-------------------";

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ultimoIdentificador ++;
        this.productos = new Producto[4];
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto (Producto producto){
        if(indiceProducto<this.productos.length) {
            this.productos[indiceProducto++] = producto;
        }
    }

    public int calcularGranTotal(){
        int tempTotal = 0;
        for(Producto p: productos){
            tempTotal += p.getPrecio();
        }
        return tempTotal;
    }

}
