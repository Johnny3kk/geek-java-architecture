package HomeWork5;

public class Main {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator,"Manny");
        User user2 = new UserImpl(mediator,"Sally");
        User user3 = new UserImpl(mediator,"Rudy");
        User user4 = new UserImpl(mediator,"Panny");
        User user5 = new UserImpl(mediator,"Sanny");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hi to All in this chat!");
    }
}
