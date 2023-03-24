package Phone;

public interface Message {
    void sendMessage(String phoneNumber, String message);

    void receiveMessage(String phoneNumber, String message);
}
