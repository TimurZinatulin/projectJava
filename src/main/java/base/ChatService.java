package base;

import chat.ChatSocket;

public interface ChatService {

    void sendMessage(String data);
    void add(ChatSocket webSocket);
    void remove(ChatSocket webSocket);
}
