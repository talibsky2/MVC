public class Controller {
    ModelUsers user = new ModelUsers("Kolya", "Rest", 20);
    ModelUsers user1 = new ModelUsers("Vasya", "Tor", 22);
    View view = new View();
    void execute (){
        view.showUser(user);
        view.showUser(user1);
    }
}
