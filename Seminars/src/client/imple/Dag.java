package client.imple;

import client.Animal;
import client.Owner;

import java.time.LocalDate;

public class Dag extends Animal {

    protected boolean isHome;

    public Dag(int id, String name, LocalDate birthdate, Owner owner) {
        super(id, name, birthdate, owner);
    }
    public Dag(int id, String name, LocalDate birthdate, Owner owner, boolean isHome) {
        super(id, name, birthdate, owner);
        this.isHome = isHome;
    }
    public Integer getId(){
        return id;
    }
    public String getName() {
        return name;
    }
}
