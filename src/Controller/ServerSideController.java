package Controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideController {
    public void initialize(){
        new Thread(()->{
            try {
                ServerSocket serverSocket = new ServerSocket(5000);
                System.out.println("Server Started");
                Socket accept = serverSocket.accept();
                System.out.println("Client Connected");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
