package Model;

public class FileType {

    public int ID;

    public FileType(int ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public String Name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
