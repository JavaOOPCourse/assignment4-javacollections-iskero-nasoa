package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Consultation - Math");
        appointments.add("Consultation - Physics");
        appointments.add("Consultation - Programming");

        appointments.addFirst("URGENT: Academic Warning");
    }

    public void cancelLast() {
        appointments.removeLast();
    }

    public void showFirstAndLast() {
        System.out.println("First: " + appointments.getFirst());
        System.out.println("Last: " + appointments.getLast());
    }

    public void printAppointments() {
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
