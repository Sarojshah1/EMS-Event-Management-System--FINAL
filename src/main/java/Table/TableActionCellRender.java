
package Table;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TableActionCellRender extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable,Object o,boolean isselected,boolean bln1,int row,int column){
        Component com= super.getTableCellRendererComponent(jtable,o,isselected,bln1,row,column);
        PanelAction action=new PanelAction();
        if(isselected==false && row%2==0){
            action.setBackground(Color.white);
             
        }else{
            action.setBackground(com.getBackground());
        }
        return action;
        
    }
    
}
