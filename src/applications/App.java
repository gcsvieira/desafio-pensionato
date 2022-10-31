package applications;

import java.util.Scanner;

import javax.print.DocPrintJob;

import entities.Room;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Room[] room = new Room[10];
        Student[] student;
        int numberStudents;

        do {
            System.out.print("Quantos quartos serão alugados? ");
            numberStudents = Integer.parseInt(sc.nextLine());

            if (numberStudents > 10 || numberStudents <= 0)
                System.out.println("\n\nNúmero inválido! Tente novamente.\n");
        } while (numberStudents > 10);

        for (int i = 0; i < room.length; i++) {
            room[i] = new Room(i);
        }

        student = new Student[numberStudents];

        for (int i = 0; i < student.length; i++) {
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Aluguel: ");
            double rent = Double.parseDouble(sc.nextLine());
            System.out.print("Quarto: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println();

            student[i] = new Student(nome, email, room[id]);
            room[id].setStudentOwner(student[i], rent);
        }

        System.out.println("\nQuartos ocupados: ");

        for (int i = 0; i < room.length; i++) {
            if (room[i].getStudentOwner() != null) {
                System.out.println(i + ": " + room[i].getStudentOwner().toString());
            }
        }

        sc.close();
    }
}
