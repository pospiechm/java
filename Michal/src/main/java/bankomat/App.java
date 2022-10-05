package bankomat;

public class App {
    public static void main(String[] args) {
        Gui ui = new Gui();
        RequestHandler requestHandler = new RequestHandler();
        AtmOperations atm = new AtmOperations();
        CardRepository cardRepository = new CardRepository();


        while (true) {
            atm.cardNumberIdx();
            ui.userChoice();
            int choice = ui.getUserChoice();

            if (choice == 4) {
                break;
            }
            requestHandler.handle(choice, ui, atm);
        }
    }
}