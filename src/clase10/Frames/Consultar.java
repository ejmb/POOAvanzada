/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.Frames;

import clase10.Clases.Producto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author emorel
 */
public class Consultar extends javax.swing.JFrame {

    /**
     * Creates new form Consultar
     */
    public Consultar() {
        initComponents();
        
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
        txtCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtDescMax = new javax.swing.JTextField();
        txtUtilidad = new javax.swing.JTextField();
        bCerrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Productos");
        setMinimumSize(new java.awt.Dimension(470, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(179, 83, 9));
        jLabel1.setText("Consulta de Productos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(154, 11, 157, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Codigo Producto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 59, 92, 25);

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(117, 56, 35, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 87, 450, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(179, 83, 9));
        jLabel3.setText("Datos de Producto");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 115, 116, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Descripcion");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(18, 144, 65, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Tipo");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(18, 170, 24, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Precio Compra");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(260, 144, 82, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Descuento MAX");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 170, 88, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Utilidad");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 196, 43, 25);

        txtDescripcion.setEditable(false);
        getContentPane().add(txtDescripcion);
        txtDescripcion.setBounds(87, 141, 155, 25);

        txtTipo.setEditable(false);
        getContentPane().add(txtTipo);
        txtTipo.setBounds(87, 167, 90, 25);

        txtPrecioCompra.setEditable(false);
        getContentPane().add(txtPrecioCompra);
        txtPrecioCompra.setBounds(352, 141, 80, 25);

        txtDescMax.setEditable(false);
        getContentPane().add(txtDescMax);
        txtDescMax.setBounds(352, 167, 45, 25);

        txtUtilidad.setEditable(false);
        getContentPane().add(txtUtilidad);
        txtUtilidad.setBounds(352, 193, 45, 25);

        bCerrar.setBackground(new java.awt.Color(102, 102, 102));
        bCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bCerrar.setText("Cerrar");
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(bCerrar);
        bCerrar.setBounds(190, 230, 69, 23);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase10/images/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 470, 300);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if(!txtCodigo.getText().equals("")){
            getProductoFromList(Integer.parseInt(txtCodigo.getText()));
        }        
    }//GEN-LAST:event_txtCodigoFocusLost

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescMax;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUtilidad;
    // End of variables declaration//GEN-END:variables
    private final LinkedList<Producto> productList = new LinkedList<>();
    
    private void getProductoFromFile(){
        String aux = "";
        Producto prod = new Producto();
        try{
            String file = "src/clase10/files/Productos.txt";
            FileReader files = new FileReader(file);
            BufferedReader read = new BufferedReader(files);
            while((aux = read.readLine()) != null){
                String[] field = aux.split(";");
                if(field[0].equals("") == false){
                    prod.setCodigo(Integer.parseInt(field[0]));
                    prod.setDescripcion(field[1]);
                    prod.setTipo(field[2]);
                    prod.setPrecioCompra(Integer.parseInt(field[3]));
                    prod.setDescMaximo(Integer.parseInt(field[4]));
                    prod.setUtilidad(Float.parseFloat(field[5]));
                    productList.addLast(prod);
                }                
            }                
            read.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex+""+
                    "\nNo se pudo leer el archivo",
                    "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void getProductoFromList(int codigo){
        getProductoFromFile();
        for(Producto prod: productList){
            if(prod.getCodigo() == codigo){
                txtDescripcion.setText(prod.getDescripcion());
                txtTipo.setText(prod.getTipo());
                txtPrecioCompra.setText(Integer.toString(prod.getPrecioCompra()));
                txtDescMax.setText(Integer.toString(prod.getDescMaximo()));
                txtUtilidad.setText(Float.toString(prod.getUtilidad()));
            }else{
                JOptionPane.showMessageDialog(this, "Codigo de Producto "+codigo+
                        "\nNO EXISTE", 
                        "Codigo Invalido", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
