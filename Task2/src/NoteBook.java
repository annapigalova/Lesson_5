import java.util.ArrayList;

public class NoteBook {

	private ArrayList<Note> noteList = new ArrayList<>();

	public ArrayList<Note> getNoteList() {
		return noteList;
	}

	public void addRecords(Note... args) {
		for (Note n : args) {
			noteList.add(n);
		}
	}

	public void removeRecord(Note note) {
		noteList.remove(note);
	}

	public ArrayList<Note> findByLastName(String lastName) {

		ArrayList<Note> resultList = new ArrayList<>();

		for (Note note : noteList) {
			if (lastName.equals(note.getLastName())) {
				resultList.add(note);
			}
		}
		return resultList;

	}
}
