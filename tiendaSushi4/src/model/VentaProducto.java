package model;

/**
 *
 * @author Piaa FernanDaa
 */
public class VentaProducto {
    private int id;
    private int idCliente;
    private int idProducto;
    private int cantidadProductos;
    private int subTotal;

    public VentaProducto(int id, int idCliente, int idProducto, int cantidadProductos, int subTotal) {
        this.id = id;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.cantidadProductos = cantidadProductos;
        this.subTotal = subTotal;
    }

    public VentaProducto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }
    

}
