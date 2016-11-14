
package clase14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * A simple Swing-based client for the chat server.  Graphically
 * it is a frame with a text field for entering messages and a
 * textarea to see the whole dialog.
 *
 * The client follows the Chat Protocol which is as follows.
 * When the server sends "SUBMITNAME" the client replies with the
 * desired screen name.  The server will keep sending "SUBMITNAME"
 * requests as long as the client submits screen names that are
 * already in use.  When the server sends a line beginning
 * with "NAMEACCEPTED" the client is now allowed to start
 * sending the server arbitrary strings to be broadcast to all
 * chatters connected to the server.  When the server sends a
 * line beginning with "MESSAGE " then all characters following
 * this string should be displayed in its message area.
 */
public class ClientChat {
   
    BufferedReader in;
    PrintWriter out;
    JFrame frame = new JFrame("Mi Chat");
    JTextField textField = new JTextField(40);
    JTextArea messageArea = new JTextArea(8, 40);
    JButton bCerrar = new JButton("Cerrar");
    String name;
    /**
     * Constructs the client by laying out the GUI and registering a
     * listener with the textfield so that pressing Return in the
     * listener sends the textfield contents to the server.  Note
     * however that the textfield is initially NOT editable, and
     * only becomes editable AFTER the client receives the NAMEACCEPTED
     * message from the server.
     */
    public ClientChat() {
        
        // Layout GUI
        textField.setEditable(false);
        messageArea.setEditable(false);
        frame.getContentPane().add(textField, "North");
        frame.getContentPane().add(new JScrollPane(messageArea), "Center");
        frame.getContentPane().add(bCerrar, "South");
        frame.setResizable(false);
        frame.pack();

        addListeners();
        
    }

    /**
     * Connects to the server then enters the processing loop.
     */
    private void run() throws IOException {

        // Make connection and initialize streams
        //String serverAddress = getServerAddress();
        InetAddress serverAddress = getServerAddress();
        Socket socket;
        try {
            socket = new Socket(serverAddress, 9001);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame,"No se pudo conectar al Servidor\n"+ex,"ERROR", JOptionPane.ERROR_MESSAGE);
            throw ex;
        }
        in = new BufferedReader(new InputStreamReader(
            socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
        // Process all messages from server, according to the protocol.
        while (true) {
            String line = in.readLine();            
            if (line.startsWith("SUBMIT_NAME")) {
                name = getName();
                out.println(name);
            }else if(line.startsWith("NAME_IN_USE")){
                JOptionPane.showMessageDialog(frame,"Nick Name esta EN USO","ATENCION", JOptionPane.INFORMATION_MESSAGE);
            }else if (line.startsWith("NAME_ACCEPTED")) {
                frame.setTitle("Mi Chat - NickName: "+name);
                textField.setEditable(true);
                textField.requestFocus();
            } else if (line.startsWith("MESSAGE")) {
                messageArea.append(line.substring(8) + "\n");
            } else if (line.startsWith("SERVER")) {
                messageArea.append(line.substring(7) + "\n");
            }
        }
    }

    /**
     * Runs the client as an application with a closeable frame.
     */
    public static void main(String[] args)  {
        ClientChat client = new ClientChat();
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        client.frame.setVisible(true);
        
        try {
            client.run();
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(0);
        }
    }

    /**
     * Prompt for and return the address of the server.
     */
//    private String getServerAddress() {
//        return JOptionPane.showInputDialog(
//            frame, "Ingrese dirección IP del Servidor de Chat:",
//           "Bienvenido Programa de Chat", JOptionPane.QUESTION_MESSAGE);
//    }
    private InetAddress getServerAddress() throws UnknownHostException{
        InetAddress serverAddress = InetAddress.getLocalHost();
        System.out.println("Server: "+serverAddress);
        return serverAddress;
    }

    /**
     * Prompt for and return the desired screen name.
     */
    private String getName() {
        String name = JOptionPane.showInputDialog(
            frame, "Elija un nick name",
            "Nick name selection",
            JOptionPane.PLAIN_MESSAGE);
        if(name == null){
            System.exit(0);
        }else if(name.equals("")){
            JOptionPane.showMessageDialog(frame,"Nick Name NO puede estar VACIO!","ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        return name;
    }
    
    private void addListeners() {
        textField.addActionListener(new ActionListener() {
            /**
             * Responds to pressing the enter key in the textfield by sending
             * the contents of the text field to the server.    Then clear
             * the text area in preparation for the next message.
             */
            public void actionPerformed(ActionEvent e) {
                if(!textField.getText().equals("")){
                    out.println(textField.getText());
                    textField.setText("");
                }else{
                    JOptionPane.showMessageDialog(frame,"Mensaje NO puede estar VACIO!","ERROR", JOptionPane.ERROR_MESSAGE);
                    textField.requestFocus();
                }                
            }
        });
        bCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {                
                System.exit(0);
            }     
        });
    }
}