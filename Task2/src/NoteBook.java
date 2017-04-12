import java.util.ArrayList;
import java.util.Comparator;

public class NoteBook {

	private ArrayList<Note> noteList = new ArrayList<>();

	public ArrayList<Note> getNoteList() {// при использовании коллекций лучше возвращать List, Set, т.е. интерфейсы
		// а так - молодец!
		return noteList;
	}

	public void addRecords(Note... args) {
		for (Note n : args) {
			addRecord(n);
		}
	}
	
	public void addRecord(Note note)
	{
		noteList.add(note);
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

	public static Comparator<Note> sortByLastFirstName = new Comparator<Note>() {
		public int compare(Note n1, Note n2) {
			String lastName1 = n1.getLastName();
			String lastName2 = n2.getLastName();

			int lastNameSort = lastName1.compareTo(lastName2);

			if (lastNameSort == 0) {
				String firstName1 = n1.getFirstName();
				String firstName2 = n2.getFirstName();
				return firstName1.compareTo(firstName2);
			} else {
				return lastNameSort;
			}

		}

	};

	public static Comparator<Note> sortByDobDesc = new Comparator<Note>() {
		public int compare(Note n1, Note n2) {

			return Integer.compare(n2.getDob(), n1.getDob());

		}
	};
}
