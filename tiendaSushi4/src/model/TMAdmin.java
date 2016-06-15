package model;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Piaa FernanDaa
 */
public class TMAdmin implements TableModel{
        private List<Producto> productos;
        private Data d;

    public TMAdmin(List<Producto> productos) throws SQLException{
        this.productos = productos;
        this.d = new Data();
    }

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0: return "id";
            case 1: return "Nombre";
            case 2: return "Precio";
            case 3: return "Tipo";              
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                Producto p = productos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return p.getId();
            case 1:
                return p.getNombre();
            case 2:
                return p.getPrecio();
            case 3:

                int id = p.getTipo();
                
                {
                    try {
                        Tipo t = d.getTipoPorId(id);
                        return t.getNombreTipo();
                    } catch (SQLException ex) {
                        Logger.getLogger(TMAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
