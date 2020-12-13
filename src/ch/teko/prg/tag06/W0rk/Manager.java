package ch.teko.prg.tag06.W0rk;

public class Manager extends Person
{
    private int managerID;

    public Manager(String name, String vorname, int alter, int gehalt, int ferien, int mitarbeiterID)
    {
        super(name, vorname, alter, gehalt, ferien);
        this.managerID  = managerID;
    }

    public int getManagerID()
    {
        return managerID;
    }
}
