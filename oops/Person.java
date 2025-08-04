
public abstract class Person {
   String Name;
   int id;

    public Person(String Name,int id) {
        this.Name=Name;
        this.id=id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    abstract void showDetails();
}

