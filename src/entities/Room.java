package entities;

public class Room {
    private int id;
    private double rent;
    private Student studentOwner;

    public Room(int id, double rent, Student studentOwner) {
        this.id = id;
        this.rent = rent;
        this.studentOwner = studentOwner;
    }

    public Room(int id) {
        this.id = id;
        this.rent = 0.00;
        this.studentOwner = null;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRent() {
        return this.rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Student getStudentOwner() {
        return this.studentOwner;
    }

    public void setStudentOwner(Student studentOwner, double rent) {
        this.rent = rent;
        this.studentOwner = studentOwner;
    }

}
