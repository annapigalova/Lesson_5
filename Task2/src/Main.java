import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();

		ArrayList<Note> noteList = initNotes();
		for (Note note : noteList) {
			noteBook.addRecords(note);
		}
		
		// Init object for variable-length arguments
		Note note1 = new Note();
		note1.setLastName("Ivanov");
		note1.setFirstName("Ivan");
		note1.setDob(19910514);
		note1.setCellNum("01-01-01");

		Note note2 = new Note();
		note2.setLastName("Petrov");
		note2.setFirstName("Petr");
		note2.setDob(19910114);
		note2.setCellNum("02-02-02");

		noteBook.addRecords(note1, note2);

		//

		// Search by LastName
		/*
		 * ArrayList<Note> searchResult =
		 * noteBook.findByLastName("Last Name # 2"); for (Note note :
		 * searchResult){ System.out.println(note); }
		 */

		  sortByDob(noteBook.getNoteList());

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
