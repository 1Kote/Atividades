package questao2;
import java.util.Stack;

public class Actions
{
    private Stack<Actions> pilha;

    public void pilhaAction() 
    {
        this.pilha = new Stack<>();
    }

    public void runAction(Actions string)
    {
        pilha.push(string);
        System.out.println("Ação executada: " + string);
    }

    public void removeAction()
    {
        if (!pilha.isEmpty()) 
        {
            Actions lastAction = pilha.pop();
            System.out.println("Desfazendo ação: " + lastAction);
        } else {
            System.out.println("Sem ações!");
        }
    }

    public void runAction(String string) 
    {
    	
    	
    }
}

