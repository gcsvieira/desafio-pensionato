package entities;

public class Student {
    private String name;
    private String email;
    private Room choosenRoom;

    public Student(String name, String email, Room choosenRoom) {
        this.name = name;
        this.email = email;
        this.choosenRoom = choosenRoom;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Room getChoosenRoom() {
        return this.choosenRoom;
    }

    public void setChoosenRoom(Room choosenRoom) {
        this.choosenRoom = choosenRoom;
    }

    @Override
    public String toString() {
        return "Nome: "
                + getName()
                + ", "
                + getEmail();
    }

}
