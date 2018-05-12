/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import paint.behaviours.OnMenuClicked;
import javax.swing.JTable;
import paint.models.Line;
import paint.models.Rectangle;
import paint.models.Shape;
import paint.models.Circle;
import paint.models.Ellipse;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bilal-Laptop
 */
public class MainPanel extends javax.swing.JPanel implements OnMenuClicked {

    JTable table;
    DefaultTableModel model;
    ArrayList<Shape> drawnShapes;
    Color currentColor;
    Shape shape;
    JFrame topFrame;
    FileNameExtensionFilter filter;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        this.drawnShapes = new ArrayList<>();
        initComponents();
        ((DefaultEditor) jSpinner1.getEditor()).getTextField().setEditable(false);
        topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        filter = new FileNameExtensionFilter("Paint files summary", "pfs");
        model = (DefaultTableModel) jTable1.getModel();

    }

    public void configureLine(Line line) {
        shape_detail_label.setText(line.toString());
        this.shape = line;
    }

    public void configurecir(Circle c) {
        shape_detail_label.setText(c.toString());
        this.shape = c;
    }

    public void configurerec(Rectangle rc) {
        shape_detail_label.setText(rc.toString());
        this.shape = rc;
    }

    public void config_elip(Ellipse el) {
        shape_detail_label.setText(el.toString());
        this.shape = el;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        shape_detail_label = new javax.swing.JLabel();
        btn_color = new javax.swing.JButton();
        lbl_color = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        deleteBtn = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(50000, 50000));
        setName("Paint"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1150, 600));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "color", "Font"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Shape", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Script", 0, 13), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel1.setToolTipText("New");
        jPanel1.setName("New shape"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Line", "Circle", "Rectangle", "Ellipse" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jComboBox1, org.jdesktop.beansbinding.ObjectProperty.create(), jComboBox1, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btn_color.setText("Choose color");
        btn_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_colorActionPerformed(evt);
            }
        });

        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner1KeyTyped(evt);
            }
        });

        jLabel1.setText("Thickness");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_color)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(shape_detail_label))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(shape_detail_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_color)
                    .addComponent(lbl_color, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(46, 46, 46))
        );

        jButton1.setText("Draw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (shape == null) {
            JOptionPane.showMessageDialog(new JFrame(), "No shape is specified", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (currentColor == null) {
            JOptionPane.showMessageDialog(new JFrame(), "Please, Specify a color first", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (Integer.parseInt(jSpinner1.getValue().toString()) <= 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Thickness must be greater than 0", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        shape.setColor(currentColor);
        shape.setFontWidth(Integer.parseInt(jSpinner1.getValue().toString()));
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                Line line = (Line) shape;
                drawnShapes.add(line);
                drawLine(line);
                model.addRow(new Object[]{"Line", line.getColor(), line.getFontWidth()});
                break;
            case 2:
                Circle cr = (Circle) shape;
                drawnShapes.add(cr);
                drawCircle(cr);
                model.addRow(new Object[]{"Circle", cr.getColor(), cr.getFontWidth()});
                break;
            case 3:
                Rectangle rec = (Rectangle) shape;
                drawnShapes.add(rec);
                drawRectangle(rec);
                model.addRow(new Object[]{"Rectangle", rec.getColor(), rec.getFontWidth()});
                break;
            case 4:
                Ellipse els = (Ellipse) shape;
                drawnShapes.add(els);
                drawEllipse(els);
                model.addRow(new Object[]{"Ellipse", els.getColor(), els.getFontWidth()});
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSpinner1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_jSpinner1KeyTyped

    private void btn_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_colorActionPerformed
        currentColor = JColorChooser.showDialog(this, "Choose color", Color.yellow);
        lbl_color.setOpaque(true);
        lbl_color.setBackground(currentColor);
    }//GEN-LAST:event_btn_colorActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        shape = null;
        switch (jComboBox1.getSelectedIndex()) {
            case 1:
                JFrame window = new JFrame("Line parameters");
                LineSelector content = new LineSelector(this);
                window.setContentPane(content);
                window.setSize(360, 360);
                window.setLocation(100, 100);
                window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window.setAlwaysOnTop(true);
                window.setVisible(true);
                break;
            case 2:
                JFrame window3 = new JFrame("Circle parameters");
                cirselector content3 = new cirselector(this);
                window3.setContentPane(content3);
                window3.setSize(360, 360);
                window3.setLocation(100, 100);
                window3.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window3.setAlwaysOnTop(true);
                window3.setVisible(true);
                break;
            case 3:
                JFrame window2 = new JFrame("Rectangle parameters");
                recselector content2 = new recselector(this);
                window2.setContentPane(content2);
                window2.setSize(360, 360);
                window2.setLocation(100, 100);
                window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window2.setAlwaysOnTop(true);
                window2.setVisible(true);
                break;
            case 4:
                JFrame window4 = new JFrame("Ellipse parameters");
                Ellipseselector content4 = new Ellipseselector(this);
                window4.setContentPane(content4);
                window4.setSize(360, 360);
                window4.setLocation(100, 100);
                window4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                window4.setAlwaysOnTop(true);
                window4.setVisible(true);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selected = jTable1.getSelectedRow();
        if (selected > -1) {
            drawnShapes.remove(selected);
            model.removeRow(selected);
//            jPanel3.repaint();
            Graphics2D g = GraphicsInstance.getInstance(jPanel3);
            super.paintComponent(g);
            g.setColor(Color.white);
            g.fillRect(0, 0, jPanel3.getWidth(), jPanel3.getHeight());
            drawnShapes.forEach((shape) -> {
                if (shape instanceof Line) {
                    drawLine((Line) shape);
                } else if (shape instanceof Circle) {
                    drawCircle((Circle) shape);
                } else if (shape instanceof Rectangle) {
                    drawRectangle((Rectangle) shape);
                } else if (shape instanceof Ellipse) {
                    drawEllipse((Ellipse) shape);
                }
            });
        }
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_color;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_color;
    private javax.swing.JLabel shape_detail_label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onNewClicked() {
        System.out.println("new");
        for (int i = 0; i < drawnShapes.size(); i++) {
            model.removeRow(0);
        }
        drawnShapes.clear();
        jPanel3.repaint();
    }

    @Override
    public void onLoadClicked() {
        System.out.println("load");
        onNewClicked();
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(filter);
        int retrival = chooser.showOpenDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner scanner = new Scanner(chooser.getSelectedFile());
                JSONObject total = (JSONObject) JSONValue.parse(scanner.next());
                JSONArray array = (JSONArray) total.get(JSONContract.SHAPES);
                for (int i = 0; i < array.size(); i++) {
                    JSONObject shapeObject = (JSONObject) array.get(i);
                    String type = (String) shapeObject.get(JSONContract.TYPE);
                    if (type.contentEquals("Line")) {
                        Line line = new Line();
                        line.setX1(Integer.parseInt(shapeObject.get(JSONContract.X).toString()));
                        line.setX2(Integer.parseInt(shapeObject.get(JSONContract.X_END).toString()));
                        line.setY1(Integer.parseInt(shapeObject.get(JSONContract.Y).toString()));
                        line.setY1(Integer.parseInt(shapeObject.get(JSONContract.Y_END).toString()));
                        line.setColor(new Color(Integer.parseInt(shapeObject.get(JSONContract.COLOR).toString())));
                        line.setFontWidth(Integer.parseInt(shapeObject.get(JSONContract.FONT).toString()));
                        drawnShapes.add(line);
                        drawLine(line);
                        model.addRow(new Object[]{"Line", line.getColor(), line.getFontWidth()});
                    } else if (type.contentEquals("Circle")) {
                        Circle circle = new Circle();
                        circle.setx(Integer.parseInt(shapeObject.get(JSONContract.X).toString()));
                        circle.setY1(Integer.parseInt(shapeObject.get(JSONContract.Y).toString()));
                        circle.setRadius(Integer.parseInt(shapeObject.get(JSONContract.RADIUS).toString()));
                        circle.setColor(new Color(Integer.parseInt(shapeObject.get(JSONContract.COLOR).toString())));
                        circle.setFontWidth(Integer.parseInt(shapeObject.get(JSONContract.FONT).toString()));
                        drawnShapes.add(circle);
                        drawCircle(circle);
                        model.addRow(new Object[]{"Circle", circle.getColor(), circle.getFontWidth()});
                    } else if (type.contentEquals("Rectangle")) {
                        Rectangle rect = new Rectangle();
                        rect.setx(Integer.parseInt(shapeObject.get(JSONContract.X).toString()));
                        rect.sety(Integer.parseInt(shapeObject.get(JSONContract.Y).toString()));
                        rect.setheight(Integer.parseInt(shapeObject.get(JSONContract.HEIGHT).toString()));
                        rect.setwidth(Integer.parseInt(shapeObject.get(JSONContract.WIDTH).toString()));
                        rect.setColor(new Color(Integer.parseInt(shapeObject.get(JSONContract.COLOR).toString())));
                        rect.setFontWidth(Integer.parseInt(shapeObject.get(JSONContract.FONT).toString()));
                        drawnShapes.add(rect);
                        drawRectangle(rect);
                        model.addRow(new Object[]{"Rectangle", rect.getColor(), rect.getFontWidth()});
                    } else if (type.contentEquals("Ellipse")) {
                        Ellipse ellipse = new Ellipse();
                        ellipse.setx(Integer.parseInt(shapeObject.get(JSONContract.X).toString()));
                        ellipse.sety(Integer.parseInt(shapeObject.get(JSONContract.Y).toString()));
                        ellipse.setheight(Integer.parseInt(shapeObject.get(JSONContract.HEIGHT).toString()));
                        ellipse.setwidth(Integer.parseInt(shapeObject.get(JSONContract.WIDTH).toString()));
                        ellipse.setColor(new Color(Integer.parseInt(shapeObject.get(JSONContract.COLOR).toString())));
                        ellipse.setFontWidth(Integer.parseInt(shapeObject.get(JSONContract.FONT).toString()));
                        drawnShapes.add(ellipse);
                        drawEllipse(ellipse);
                        model.addRow(new Object[]{"Ellipse", ellipse.getColor(), ellipse.getFontWidth()});
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void onSaveClicked() {
        if (drawnShapes.size() > 0) {
            System.out.println("save");
            JSONObject object = new JSONObject();
            JSONArray array = new JSONArray();
            for (Shape shape : drawnShapes) {
                array.add(shape.getInfo());
            }
            object.put(JSONContract.SHAPES, array);
            System.out.println(object.toString());

            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(filter);
            int retrival = chooser.showSaveDialog(null);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                try (FileWriter fw = new FileWriter(chooser.getSelectedFile() + ".pfs")) {
                    fw.write(object.toString());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    void drawLine(Line line) {
        Graphics2D graphics = GraphicsInstance.getInstance(jPanel3);
        graphics.setColor(line.getColor());
        graphics.setStroke(new BasicStroke(line.getFontWidth()));
        graphics.drawLine(line.getX1(), jPanel3.getHeight() - line.getY1(), line.getX2(), jPanel3.getHeight() - line.getY2());
    }

    void drawCircle(Circle circle) {
        Graphics2D graphics3 = GraphicsInstance.getInstance(jPanel3);
        graphics3.setColor(circle.getColor());
        graphics3.setStroke(new BasicStroke(circle.getFontWidth()));
        graphics3.drawOval(circle.getx() - (circle.getRadius() / 2), jPanel3.getHeight() - circle.gety() - (circle.getRadius() / 2), circle.getRadius(), circle.getRadius());
    }

    void drawRectangle(Rectangle rec) {
        Graphics2D graphics2 = GraphicsInstance.getInstance(jPanel3);
        graphics2.setColor(rec.getColor());
        graphics2.setStroke(new BasicStroke(rec.getFontWidth()));
        graphics2.drawRect(rec.getx(), jPanel3.getHeight() - rec.gety(), rec.getwidth(), rec.getheight());
    }

    void drawEllipse(Ellipse els) {
        Graphics2D graphics4 = GraphicsInstance.getInstance(jPanel3);
        graphics4.setColor(els.getColor());
        graphics4.setStroke(new BasicStroke(els.getFontWidth()));
        graphics4.drawOval(els.getx(), jPanel3.getHeight() - els.gety(), els.getwidth(), els.getheight());
    }
}
