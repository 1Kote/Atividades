package questao1;
import java.util.Stack;

public class Truck
{
    
    private String placa;
    private String name;
    private Stack<Cargo> pilhacarga;

    public Truck(String name, String placa,Stack<Cargo> pilhacarga)
    {
        this.name = name;
        this.placa = placa;
        this.pilhacarga = new Stack<>();
    }
    
    public String getPlaca()
     {
        return placa;
    }

    public String getName()
    {
        return name;
    }

    public void addCargo(Cargo cargo)
    {
        pilhacarga.push(cargo);
    }

    public Cargo removeCargo()
    {
        return pilhacarga.pop();
    }

    public boolean checkCargo()
    {
        return !pilhacarga.isEmpty();
    }
}
