import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();

		ArrayList<Note> result = initNotes();
		for (Note note : result) {
			noteBook.addRecords(note);
			//System.out.println(note);
		}
		ArrayList<Note> bla = noteBook.findByLastName("Last Name # 2");
		for (Note note : bla) {
			System.out.println(note);
		}

	}

	public static ArrayList<Note> initNotes() {
		ArrayList<Note> result = new ArrayList<>();

		String firstName = "First Name # ";
		String lastName = "Last Name # ";
		for (int i = 0; i < 100; i++) {
			Note note = new Note();
			note.setFirstName(firstName + i);
			note.setLastName(lastName + i);
			result.add(note);
		}

		return result;

	}

}
