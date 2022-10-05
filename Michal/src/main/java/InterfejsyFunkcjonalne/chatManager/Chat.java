package InterfejsyFunkcjonalne.chatManager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Chat {
    private String chatName;
    private List<Subscriber> subscribers = new ArrayList<>();
    private String chatHistory;

    public String getChatName() {
        return chatName;
    }

    public String getChatHistory() {
        return chatHistory;
    }

    public Chat(String chatName) {
        this.chatName = chatName;
    }

    public void addSubscriber (User user){
        subscribers.add(user);
    }

  public void removeSubscriber (User user){
        subscribers.remove(user);
  }

    public void notifyAllUsers() {
    subscribers.forEach(s -> s.update(this));
    }


    public void updateChatHistory(String s) {
        chatHistory = chatHistory + s + "\n";
    }
}
