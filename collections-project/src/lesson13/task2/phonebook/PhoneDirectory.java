package lesson13.task2.phonebook;

import java.util.ArrayList;

public class PhoneDirectory {
    ArrayList<Note> notes = new ArrayList<>();

    public void add(Note note){
        notes.add(note);
    }

    public Note find(String fullname){
        Note foundNote = null;
        for (Note note: notes) {
            if(note.getName().split(" ")[1].equals(fullname)){
                foundNote = note;
                break;
            }
        }
        return foundNote;
    }

    public ArrayList<Note> findAll(String fullname){
        ArrayList<Note> foundNotes = new ArrayList<>();
        for (Note note: notes) {
            if(note.getName().split(" ")[1].equals(fullname)){
                foundNotes.add(note);
            }
        }
        return foundNotes;
    }

    @Override
    public String toString() {
        return notes.toString();
    }
}