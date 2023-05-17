package questao2;

public class main 
{
    public static void main(String[] args) 
    {
        Actions action = new Actions();

        action.runAction("Look Up");
        action.runAction("Next Page");
        action.runAction("play next music");

        action.removeAction();
        action.removeAction();

    }
}
