package InterfejsyFunkcjonalne.chatManager;

import java.util.*;

public class User implements Subscriber {
    private String username;
    private String password;
   private Map<Chat,Integer> messagesFromChat = new HashMap<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void update(Chat chat) {
        messagesFromChat.put(chat, messagesFromChat.get(chat)+1);
    }

    public void getMessagesFromChats() {
    }
}
