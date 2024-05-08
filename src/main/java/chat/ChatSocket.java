package chat;

import java.io.*;
import java.net.Socket;

public class ChatSocket extends Thread {

    private final Socket socket;
    private final ChatServiceImpl chatService;
    private final BufferedReader in;
    private final PrintWriter out;

    public ChatSocket(Socket socket, ChatServiceImpl chatService) throws IOException {
        this.socket = socket;
        this.chatService = chatService;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
    }

    @Override
    public void run() {
        try {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                String response = chatService.processMessage(inputLine);
                out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendString(String message) {
        out.println(message);
    }
}