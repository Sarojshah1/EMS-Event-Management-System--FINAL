/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewComponent;

import DAO.PaymentDAO;
import Table.TableActionCellEditor;
import Table.TableActionCellRender;
import Table.TableActionEvent;
import View.Payment;
import database.DatabaseConnection;
import java.awt.Component;
import java.awt.Image;
import java.sql.Blob;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Home_Screen extends javax.swing.JPanel {
    private DefaultTableModel model;

    public Home_Screen() {
//        init();
        initComponents();
        TableActionEvent event = (int row, int id) -> {
            PaymentDAO dao=new PaymentDAO();
            dao.insertdata(id);        
            Payment pay = new Payment();
            pay.setVisible(true);
        };
        table.getColumnModel().getColumn(7).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(7).setCellEditor(new TableActionCellEditor(event));
        init();
    }
    private void init() {
        DatabaseConnection conn = new DatabaseConnection();
        model = (DefaultTableModel) table.getModel();
        String query = "SELECT * FROM events";
        model.setRowCount(0);
        try (ResultSet resultSet = conn.retrive(query)) {
            while (resultSet.next()) {
                int No = resultSet.getInt(1);
                // Assuming that the second column is a BLOB containing an image
                Blob blob = resultSet.getBlob(2);
                byte[] imageBytes = blob.getBytes(1, (int) blob.length());
                ImageIcon image = new ImageIcon(imageBytes);
                String name = resultSet.getString(3);
                int price = resultSet.getInt(4);
                String description = resultSet.getString(5);
                String venue = resultSet.getString(6);
                Date date = resultSet.getDate(10);

                // Add a custom renderer for the image column
                table.getColumnModel().getColumn(1).setCellRenderer(new ImageTableCellRenderer());

                model.addRow(new Object[]{No, image, name, description, venue, date, price});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollBarCustom1 = new scrollbar.ScrollBarCustom();
        jScrollPane7 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jScrollPane7.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setColumnHeaderView(null);
        jScrollPane7.setVerticalScrollBar(scrollBarCustom1);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Image", "Event Name", "Description", "Venue", "Date", "Ticket Price", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(60);
        jScrollPane7.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private scrollbar.ScrollBarCustom scrollBarCustom1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
class ImageTableCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);

        // Set a border to make the cell's layout more visually appealing
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        if (value instanceof ImageIcon) {
            ImageIcon imageIcon = (ImageIcon) value;
            label.setIcon(scaleImageIcon(imageIcon, 50, 50)); // Adjust the size as needed
        }

        return label;
    }

    // Helper method to scale ImageIcon
    private ImageIcon scaleImageIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
}