import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();

		ArrayList<Note> noteList = initNotes();
		for (Note note : noteList) {
			noteBook.addRecords(note);
		
		}

		// Search by LastName
		/*
		 * ArrayList<Note> searchResult =
		 * noteBook.findByLastName("Last Name # 2"); for (Note note :
		 * searchResult){ System.out.println(note); }
		 */
		
		sortByDob(noteList);

	}

	public static ArrayList<Note> initNotes() {
		ArrayList<Note> noteList = new ArrayList<>();

		String firstName = "First Name # ";
		String lastName = "Last Name # ";
		int dob = 19860101;

		for (int i = 0; i < 10; i++) {
			Note note = new Note();
			note.setFirstName(firstName + i);
			note.setLastName(lastName + i);
			note.setDob(dob + i);
			noteList.add(note);
		}

		return noteList;

	}

	public static void sortByDob(ArrayList<Note> noteList) {
		Collections.sort(noteList, NoteBook.sortByDobDesc);
		
		for (int i = 0; i < noteList.size(); i++) {
			System.out.println(noteList.get(i));
		}
	}

}
