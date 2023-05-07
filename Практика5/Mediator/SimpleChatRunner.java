package Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat, "Администратор");
        User user1 = new SimpleUser(chat, "Пользователь 1");
        User user2 = new SimpleUser(chat, "Пользователь 2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Привет, я Пользователь 1");
        admin.sendMessage("Здравствуйте, я админ данного чата");

    }
}
