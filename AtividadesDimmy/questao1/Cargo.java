package questao1;

public class Cargo
{

    private String description;
    private int wheight;

    public Cargo(String description, int wheight)
    {
        this.description = description;
        this.wheight = wheight;
    }
    public String getDescription() 
    {
        return description;
    }

    public int getWeight() 
    {
        return wheight;
    }
}
