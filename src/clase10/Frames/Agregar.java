/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.Frames;

import clase10.Clases.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Agregar extends javax.swing.JFrame {

    /**
     * Creates new form Agregar
     */
    public Agregar() {
        initComponents();
        loadProductTypes();
        //this.setIconImage(new ImageIcon(Agregar.class.getResource("../images/addIcon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fTxtCodigo = new javax.swing.JFormattedTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        fTxtPrecio = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        fTxtUtilidad = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        spDescuento = new javax.swing.JSpinner();
        bLimpiar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        bCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Productos");
        setIconImage(new ImageIcon(Agregar.class.getResource("../images/frameIcon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(470, 350));
        setPreferredSize(new java.awt.Dimension(470, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(179, 83, 9));
        jLabel1.setText("Agregar Producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 124, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 70, 38, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Descripcion");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 65, 14);

        fTxtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fTxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fTxtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(fTxtCodigo);
        fTxtCodigo.setBounds(100, 60, 35, 25);

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(100, 90, 160, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Tipo");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 100, 24, 14);

        getContentPane().add(cbTipo);
        cbTipo.setBounds(310, 90, 140, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Precio Compra");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 200, 82, 14);

        fTxtPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        fTxtPrecio.setToolTipText("");
        getContentPane().add(fTxtPrecio);
        fTxtPrecio.setBounds(120, 190, 85, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Utilidad");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 230, 43, 14);

        fTxtUtilidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.0"))));
        fTxtUtilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(fTxtUtilidad);
        fTxtUtilidad.setBounds(120, 220, 65, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descuento MAX");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 200, 88, 14);

        spDescuento.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spDescuento);
        spDescuento.setBounds(360, 190, 50, 25);

        bLimpiar.setBackground(new java.awt.Color(153, 153, 153));
        bLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(bLimpiar);
        bLimpiar.setBounds(100, 280, 75, 23);

        bGuardar.setBackground(new java.awt.Color(179, 83, 9));
        bGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bGuardar.setForeground(new java.awt.Color(255, 255, 255));
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(bGuardar);
        bGuardar.setBounds(190, 280, 79, 23);

        bCerrar.setBackground(new java.awt.Color(102, 102, 102));
        bCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(bCerrar);
        bCerrar.setBounds(290, 280, 69, 23);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(28, 136, 421, 10);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("[20% ~ 50%]");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(190, 220, 80, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("%");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(420, 190, 20, 20);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase10/images/backgroundImage.png"))); // NOI18N
        jLabel8.setText("asdf");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 470, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        cleanFields();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void fTxtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fTxtCodigoKeyTyped
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
	}
    }//GEN-LAST:event_fTxtCodigoKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (Character.isDigit(evt.getKeyChar())){
            evt.consume();
	}
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        // TODO add your handling code here:
        if(fTxtCodigo.getText().equals("")){
            this.dispose();
        }else if(addListToFile()){
            JOptionPane.showMessageDialog(this, "Lista Guardada", "Datos Guardados",
                        JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Error al Guardar", 
                    "Datos No Guardados", JOptionPane.ERROR_MESSAGE);
            this.dispose();
        }          
    }//GEN-LAST:event_bCerrarActionPerformed

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        // TODO add your handling code here:
        if(validateFields()){
            Producto p = new Producto();
            Number codigo = (Number)fTxtCodigo.getValue();
            Number utilidad = (Number)fTxtUtilidad.getValue();
            Number precio = (Number)fTxtPrecio.getValue();
            p.setCodigo(codigo.intValue());
            p.setDescripcion(txtDescripcion.getText());
            p.setTipo(cbTipo.getSelectedItem().toString());
            p.setPrecioCompra(precio.intValue());
            p.setDescMaximo((Integer)spDescuento.getValue());            
            p.setUtilidad(utilidad.floatValue());
            if(addProductList(p)){
                JOptionPane.showMessageDialog(this, p.toString(), "Datos Guardados",
                        JOptionPane.INFORMATION_MESSAGE);
                cleanFields();
            }else{
                JOptionPane.showMessageDialog(this, "Error al Guardar", 
                        "Datos No Guardados", JOptionPane.ERROR_MESSAGE);
            }                        
        }
    }//GEN-LAST:event_bGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JFormattedTextField fTxtCodigo;
    private javax.swing.JFormattedTextField fTxtPrecio;
    private javax.swing.JFormattedTextField fTxtUtilidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner spDescuento;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
    private final LinkedList<Producto> productList = new LinkedList<>();  
    
    //Carga TiposProductos.txt al ComboBox
    private void loadProductTypes() {        
        String aux = "";
        try{
            String archivo = "src/clase10/files/TiposProductos.txt";
            FileReader archivos = new FileReader(archivo);
            BufferedReader read = new BufferedReader(archivos);
            while((aux = read.readLine()) != null){
                cbTipo.addItem(aux);
            }                
            read.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex+""+
                    "\nNo se pudo leer el archivo",
                    "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
        }
    }  
    
    //Limpia los Campos y hace Foco en el primer Campo    
    private void cleanFields(){
        fTxtCodigo.setText("");
        txtDescripcion.setText("");
        cbTipo.setSelectedIndex(0);
        fTxtPrecio.setText("");
        spDescuento.setValue(0);
        fTxtUtilidad.setText("");
        fTxtCodigo.requestFocus();
    }
   
    //Valida los Campos
    private boolean validateFields() {
        
        //Validar Codigo vacio
        if(fTxtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Codigo no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            fTxtCodigo.requestFocus();
            return false;           
        }
        //Validar Descripcion vacia
        if(txtDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Descripcion no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            txtDescripcion.requestFocus();
            return false;           
        }
        //Validar Precio vacio
        if(fTxtPrecio.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Precio no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            fTxtPrecio.requestFocus();
            return false;           
        }
        //Validar Utilidad vacia
        if(fTxtUtilidad.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Campo Utilidad no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            fTxtUtilidad.requestFocus();
            return false;           
        }
        //Validar Rango Utilidad
        Number value = (Number)fTxtUtilidad.getValue();
        if(value.floatValue()<20 || value.floatValue()>50){
            JOptionPane.showMessageDialog(this, "Campo Utilidad fuera de Rango\n [20% ~ 50%]",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            fTxtUtilidad.requestFocus();
            return false;           
        }
        return true;
    }
    
    //Agrega el Producto al LinkedList
    private boolean addProductList(Producto p){              
        try{
            productList.addLast(p);            
        }catch(Exception e){
            return false;
        }        
        return true;
    }
    
    //Agrega el LinkedList Producto al archivo Productos.txt
    private boolean addListToFile(){
        FileWriter file = null;
        PrintWriter pw = null;
        try{            
            String archivo = "src/clase10/files/Productos.txt";
            File f = new File(archivo);
            if (f!=null){
                file = new FileWriter(f, true);
                pw = new PrintWriter(file);
                for(Producto prod: productList){
                    pw.write(prod.getCodigo()+";");
                    pw.write(prod.getDescripcion()+";");
                    pw.write(prod.getTipo()+";");
                    pw.write(prod.getPrecioCompra()+";");
                    pw.write(prod.getDescMaximo()+";");                
                    //Cambie el write por el println porque 
                    //el write no me toma el \n 
                    pw.println(prod.getUtilidad());
                }            
            }
        }catch(Exception e){
            return false;
        }
        finally{
            try{
                file.close();
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }
}
