/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

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
