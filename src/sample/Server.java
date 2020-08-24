package sample;
import java.io.*;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        boolean stopServer = false;
        while (!stopServer) {
            Socket socket = serverSocket.accept();


            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String  login, password;
            String  username, word;
            int     scoreAdd;

            String answer = bufferedReader.readLine();
            switch (answer) {
                case "LogPass": {
                    login = bufferedReader.readLine();
                    password = bufferedReader.readLine();
                    break;
                }
                case "stud": {
                    username = bufferedReader.readLine();
                    word = bufferedReader.readLine();
                    break;
                }
                case "score": {
                    username = bufferedReader.readLine();
                    scoreAdd = bufferedReader.read();
                    break;
                }
                case "StopServer": stopServer = true;
            }


            bufferedReader.close();
            socket.close();
        }

    }

}
