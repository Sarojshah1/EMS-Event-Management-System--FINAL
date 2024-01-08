package Table;

import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TableActionCellEditor extends DefaultCellEditor {

     private TableActionEvent event;

    public TableActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
        int id = getIdFromTable(jtable, row);
        PanelAction action = new PanelAction();
        action.initEvent(event, row,id);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
    private int getIdFromTable(JTable table, int row) {
        // Implement a method to retrieve the id from the table model or any other source
        // For example, assuming the id is stored in the first column:
        return (int) table.getValueAt(row, 0);
    }
}
