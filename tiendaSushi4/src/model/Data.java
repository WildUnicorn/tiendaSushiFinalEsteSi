package model;

import bd.Conexion;
import model.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Piaa FernanDaa
 */
public class Data {
    private Conexion c;
    private String q;
    private ResultSet rs;
    private List<Producto> productos;
    private List<Tipo> tipo;
    private List<VentaProducto> compras;
    private List<Cliente> clientes;
    
    public Data() throws SQLException {
        c = new Conexion(
                "localhost",
                "bd_tienda",
                "root",
                "");
    }
    public void crearProducto(Producto p) throws SQLException{
        q = "insert into producto values (null, "
                + "'"+p.getNombre()+"',"
                + "'"+p.getPrecio()+"',"
                + "'"+p.getTipo()+"')";
        System.out.println(q);
        c.ejecutar(q);
    }
    
    public List<Producto> getProductos() throws SQLException{
        productos = new ArrayList<>();
        Producto p;
        q = "SELECT * FROM producto";
        rs = c.ejecutarSelect(q);            
        while(rs.next()){
            p = new Producto();
            
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setPrecio(rs.getInt(3));
            p.setTipo(rs.getInt(4));
            
            productos.add(p);

        }
        c.desconectar();
        return productos;
    }
    
    //solo un producto
    public Producto getProductoPorId(int id) throws SQLException{
        
        q = "select * from producto where id = '"+id+"'";
        productos = new ArrayList<>();
        rs = c.ejecutarSelect(q);
        Producto p = null;
        if(rs.next()){
            p = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
            productos.add(p);
        }
        c.desconectar();
            
        return p;
    }
    
    public void eliminarProducto(int id) throws SQLException{
        q = "delete from producto where id = '"+ id +"'";
        c.ejecutar(q);       
    }

    public List<Producto> BuscarProducto (String filtro) throws SQLException{
        productos = new ArrayList<>();
        Producto p ;
        q = "select * from Producto where nombre like '%"+filtro+"%'";
        rs = c.ejecutarSelect(q);        
        while(rs.next()){
            p = new Producto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));

            productos.add(p);
        }
        c.desconectar();
        return productos;
    }

    public Tipo getTipoPorId(int id) throws SQLException {
        q = "select * from tipo where id = '"+id+"'";
        System.out.println(q);
        tipo = new ArrayList<>();
        rs = c.ejecutarSelect(q);
        Tipo t = null;
        /*Mientras exista un siguiente registro*/
        if(rs.next()){
            t = new Tipo();
            
            t.setId(rs.getInt(1));
            t.setNombre(rs.getString(2));
            
            tipo.add(t);
        }
        c.desconectar();
        
        return t;
    }
    public List <Tipo> getTipo() throws SQLException{
        tipo = new ArrayList<>();
        Tipo t;
        
        q = "select * from tipo";
        
        tipo = new ArrayList<>();
        rs = c.ejecutarSelect(q);
        
        /*Mientras exista un siguiente registro*/
        
        while(rs.next()){
            t = new Tipo();
            
            t.setId(rs.getInt(1));
            t.setNombre(rs.getString(2));
  
            
            tipo.add(t);
        }
        c.desconectar();
        return tipo;
        
    }
    public void agregarCliente (Cliente cl) throws SQLException{
       
            q = "insert into cliente values (NULL,"
                    + "'"+cl.getNombre()+"',"
                    + "'"+cl.getApellido()+"',"
                    + "'"+cl.getTelefono()+"',"
                    + "'"+cl.getDireccion()+"',"
                    + "'"+cl.getRut()+"',"
                    + "'"+cl.getClave()+"')";
            System.out.println(q);
            c.ejecutar(q);
            
    }
    public Cliente buscarClienteRut (String filtro) throws SQLException{
        q = "select * from cliente where rut like '%"+filtro+"%'";
        clientes = new ArrayList<>();
        System.out.println(q);
        rs = c.ejecutarSelect(q);    
        Cliente cl = null;
        
        while(rs.next()){

            cl = new Cliente(
                    rs.getInt(1),
                    rs.getString(2), 
                    rs.getString(3), 
                    rs.getInt(4), 
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7));

            clientes.add(cl);
        }
        c.desconectar();
        return cl;
    }
    public Cliente buscarDireccionCliente (String filtro) throws SQLException{
        q = "select direccion from cliente where rut like '%"+filtro+"%'";
        clientes = new ArrayList<>();
        System.out.println(q);
        rs = c.ejecutarSelect(q); 
        Cliente cl = null;
        if (rs.next()){
            cl = new Cliente();
            clientes.add(cl);
        }
        c.desconectar();
        return cl;
    }
    public boolean isRegistrado(String rut, String clave) throws SQLException{
        String q = "SELECT * FROM cliente WHERE rut = '"+rut+"' AND clave = '"+clave+"'";
        rs = c.ejecutarSelect(q);
        return rs.next();
    }
    public boolean isRutRegistrado(String rut) throws SQLException{
        String q = "SELECT * FROM cliente WHERE rut = '"+rut+"'";
        rs = c.ejecutarSelect(q);
        return rs.next();
    }

    public void crearBoleta (VentaProducto b) throws SQLException{
        q = "insert into ventaProducto values (NULL, "
                    + "'"+b.getIdCliente()+"',"
                    + "'"+b.getIdProducto()+"',"
                    + "'"+b.getCantidadProductos()+"',"
                    + "'"+b.getSubTotal()+"')";
        System.out.println(q);    
        c.ejecutar(q);
            
    }
    
    public List<VentaProducto> cargarBoletaPorId(int id) throws SQLException {
        compras = new ArrayList<>();
        VentaProducto vp;
        q = "select * from ventaProducto where id like '%" + id + "%'";
        rs = c.ejecutarSelect(q);
        while (rs.next()) {
            vp = new VentaProducto(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5));

            compras.add(vp);

        }
        c.desconectar();
        return compras;
    }    
}
