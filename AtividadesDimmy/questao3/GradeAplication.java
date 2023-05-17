package questao3;
import java.util.Stack;

public class GradeAplication
{
    private Stack<Grade> pilhaNotas;

    public GradeAplication()
    {
        pilhaNotas = new Stack<>();
    }

    public void addGrade(Grade grade)
    {
        pilhaNotas.push(grade);
    }

    public void exibitInReverseOrder() 
    {
        System.out.println("Notas em ordem inversa:");

        while (!pilhaNotas.isEmpty())
        {
            Grade grade = pilhaNotas.pop();
            System.out.println("Nota: " + grade.getGrade());
        }
    }
}
