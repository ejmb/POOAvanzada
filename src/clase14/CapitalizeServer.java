
package clase14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * A server program which accepts requests from clients to capitalize strings.  
 * When clients connect, a new thread is started to handle an interactive 
 * dialog in which the client sends in a string and the server thread sends 
 * back the capitalized version of the string.
 *
 * The program is runs in an infinite loop, so shutdown in platform
 * dependent.  If you ran it from a console window with the "java"
 * interpreter, Ctrl+C generally will shut it down.
 */
public class CapitalizeServer {

    public CapitalizeServer() {
        System.out.print("El servidor está corriendo en la IP: ");
        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            System.out.println("Error al obtener la IP " + ex.getMessage());
        }
        
        int clientNumber = 0;
        ServerSocket listener = null;
        try {
            listener = new ServerSocket(9898);
            while (true) {
                new Capitalizer(listener.accept(), ++clientNumber).start();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if(listener != null) {
                try {
                    listener.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el ServerSocket \n" + 
                            ex.getMessage());
                }
            }   
        }
    }

    /**
     * Application method to run the server runs in an infinite loop
     * listening on port 9898.  When a connection is requested, it
     * spawns a new thread to do the servicing and immediately returns
     * to listening.  The server keeps a unique client number for each
     * client that connects just to show interesting logging
     * messages.  It is certainly not necessary to do this.
     */
    public static void main(String[] args) {
        new CapitalizeServer();
    }

    /**
     * A private thread to handle capitalization requests on a particular
     * socket.  The client terminates the dialogue by sending a single line
     * containing only a period.
     */
    private class Capitalizer extends Thread {
        private Socket socket;
        private int clientNumber;

        public Capitalizer(Socket socket, int clientNumber) {
            this.socket = socket;
            this.clientNumber = clientNumber;
            log("Nueva conexion con Cliente # " + clientNumber + " en " + socket);
        }

        /**
         * Services this thread's client by first sending the
         * client a welcome message then repeatedly reading strings
         * and sending back the capitalized version of the string.
         */
        public void run() {
            try {

                // Decorate the streams so we can send characters
                // and not just bytes.  Ensure output is flushed
                // after every newline.
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                // Send a welcome message to the client.
                out.println("Hola, Ud es cliente #" + clientNumber);
                out.println("Ingrese una linea y un punto para salir\n");

                // Get messages from the client, line by line; return them
                // capitalized
                while (true) {
                    String input = in.readLine();
                    if (input == null || input.equals(".")) {
                        break;
                    }
                    out.println(input.toUpperCase());
                    System.out.println(input);
                }
            } catch (IOException e) {
                log("Error manejando cliente # " + clientNumber + ": " + e);
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    log("Error al cerrar el socket \n" + e.getMessage() );
                }
                log("Conexion con cliente# " + clientNumber + " cerrado");
            }
        }

        /**
         * Logs a simple message.  In this case we just write the
         * message to the server applications standard output.
         */
        private void log(String message) {
            
        }
    }
}
