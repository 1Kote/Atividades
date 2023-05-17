package questao3;

public class main 
{
    public static void main(String[] args) 
    {
        GradeAplication appGrade = new GradeAplication();

        Grade nota1 = new Grade(6);
        Grade nota2 = new Grade(10);
        Grade nota3 = new Grade(7);

        appGrade.addGrade(nota1);
        appGrade.addGrade(nota2);
        appGrade.addGrade(nota3);

        
        appGrade.exibitInReverseOrder();
    }
}
   