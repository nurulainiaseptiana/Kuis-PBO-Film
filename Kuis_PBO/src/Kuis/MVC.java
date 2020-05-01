//Nurul Ainia Septiana (123180042)

package Kuis;

public class MVC 
{
    View view = new View();
    Model model = new Model();
    DAO DAO = new DAO();
    Controller controller = new Controller(model, view, DAO);
}
