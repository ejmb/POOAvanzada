/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10.Frames;

import clase10.Clases.Usuario;
import clase8.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emorel
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        loadUsers();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        bConfirm = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(179, 83, 9));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase10/images/userIcon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase10/images/passIcon.png"))); // NOI18N

        bConfirm.setBackground(new java.awt.Color(255, 255, 255));
        bConfirm.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bConfirm.setForeground(new java.awt.Color(179, 83, 9));
        bConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clase10/images/confIcon.png"))); // NOI18N
        bConfirm.setText("CONFIRMAR");
        bConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(179, 83, 9));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(bConfirm)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUser)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bConfirm)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmActionPerformed
        int countLogin = 0; 
        String encodedPass = "";
        String usr = txtUser.getText();
        char[] passChar = txtPassword.getPassword();
        String pass = new String(passChar);
        
        //Validar Campos
        if(validateFields(usr, pass)){ 
            //Encriptar Contraseña para verificacion
            try {                    
                encodedPass = encodePassword(pass);                    
            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
            //Validar Intentos de Logueo
            if(countLogin < 3){
                //Verificar si existe Usuario/Contraseña
                if(verifyCredentials(usr, encodedPass)){
                    countLogin = 0;
                    //Go PRINCIPAL
                    Principal p = new Principal();
                    p.setVisible(true);
                    this.dispose();                                            
                }else{ 
//                    JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrectos!\n"+
//                        "Intentos Nº"+ countLogin,
//                        "Credenciales incorrectas", JOptionPane.WARNING_MESSAGE);
                    countLogin++;
                    //Limpia el frame
                    cleanLogin();
                    //Añade usuario, IP y fecha al archivo Log.txt
                    addUserLog(usr);                        
                }
            }else{ 
                JOptionPane.showMessageDialog(this, "Limite de Intentos permitidos",
                    "Login", JOptionPane.ERROR_MESSAGE);
                System.exit(0); 
            }
        }
    }//GEN-LAST:event_bConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Usuario> users = new ArrayList();
    
    //Se abre y lee el archivo Usuarios para guardar los Datos    
    private ArrayList loadUsers() {        
        String aux = "";
        try{
            String archivo = "src/clase10/files/Usuarios.txt";
            FileReader archivos = new FileReader(archivo);
            BufferedReader read = new BufferedReader(archivos);
            while((aux = read.readLine()) != null){
                String[] field = aux.split(";");
                if(field[0].equals("") == false){
                    addUserArray(field[0], field[1]);
                }                
            }                
            read.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex+""+
                    "\nNo se pudo leer el archivo",
                    "ADVERTENCIA!", JOptionPane.WARNING_MESSAGE);
        }
        return users;
    }
    
    //Codificar Password introducido a MD5 para verificar
    private static String encodePassword(String clear) throws Exception {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] b = md.digest(clear.getBytes());

            int size = b.length;
            StringBuffer h = new StringBuffer(size);
            for (int i = 0; i < size; i++) {
                int u = b[i] & 255;
                if (u < 16) {
                h.append("0" + Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        return h.toString();
    }
    
    //Verificar Usuario/Contraseña
    private boolean verifyCredentials(String user, String password){
        for (Usuario usr : users){
            if(usr.getUser().equals(user) && usr.getPassword().equals(password)){
                return true;
            }                      
        }
        return false;
    }
    
    //Agregar Usuario a ArrayList
    private void addUserArray(String user, String password){
        Usuario usr = new Usuario(user, password);
        users.add(usr);
    }
    
    //Agregar Usuario a archivo Usuarios.txt
    private boolean addUserLog(String usr){
        FileWriter fichero = null;
        PrintWriter pw = null;
        try{
            String archivo = "src/clase10/files/Log.txt";
            File f = new File(archivo);
            if (f!=null){
                fichero = new FileWriter(f, true);
                pw = new PrintWriter(fichero);
                
                pw.write(usr+";");
                pw.write(getIP()+";");
                //Cambie el write por el println porque 
                //el write no me toma el \n
                pw.println(getDate()+";\n");
            }
        } catch (Exception e){
            return false;
        }
        finally{
            try{
                fichero.close();
            }catch (Exception e){
                return false;
            }
        }
        return true;
    }
    
    //Limpiar Frame al guardar nuevo Usuario
    private void cleanLogin(){
        txtUser.setText("");
        txtPassword.setText("");
        txtUser.requestFocus();
    }
    
    //Validar Campos
    private boolean validateFields(String usr, String psw){
        //Validar Usuario vacio
        if(usr.equals("")){
            JOptionPane.showMessageDialog(this, "Campo Usuario no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            txtUser.requestFocus();
            return false;           
        }
        //Validar Contraseña vacia
        if(psw.equals("")){
            JOptionPane.showMessageDialog(this, "Campo Contraseña no puede estar VACIO",
                    "Error:", JOptionPane.ERROR_MESSAGE);
            txtPassword.requestFocus();
            return false;           
        }
        return true;
    }
    
    //Obtener IP Local
    private String getIP() throws UnknownHostException{
        InetAddress IP=InetAddress.getLocalHost();
        String ipAddress = IP.getHostAddress();
        return ipAddress;
    }
    
    //Obtener Fecha Actual
    private String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date); 
    }
}