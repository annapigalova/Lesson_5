
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarShow {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year = inputYear(sc);
		processCalendar(year);

	}

	private static int inputYear(Scanner sc) {
		boolean isInputOK = false;
		int year = 0;

		System.out.println("Enter year: ");

		while (!isInputOK) {
			if (sc.hasNextInt()) {
				year = sc.nextInt();
				if ((int) (year / 1000) > 0) {
					isInputOK = true;
				} else {
					System.out.println("Enter correct year: ");
				}
			} else {
				System.out.println("Enter a number: ");
				sc.next();
			}

		}
		return year;

	}

	private static void processCalendar(int year) {

		GregorianCalendar d = new GregorianCalendar();

		int todayDay = d.get(Calendar.DAY_OF_MONTH);
		int todayMonth = d.get(Calendar.MONTH);

		d.set(year, 0, 1);
		int weekDay = d.get(Calendar.DAY_OF_WEEK);
		year = d.get(Calendar.YEAR);

		do {

			int month = d.get(Calendar.MONTH);
			d.set(year, month, 1);

			System.out.println(new SimpleDateFormat("MMMM").format(d.getTime()));
			System.out.println("Su Mo Tu We Th Fr Sa");

			for (int i = Calendar.SUNDAY; i < weekDay; i++)
				System.out.print("   ");

			do {

				int day = d.get(Calendar.DAY_OF_MONTH);

				if (day < 10)
					System.out.print(" ");
				System.out.print(day);

				if (day == todayDay && todayMonth == d.get(Calendar.MONTH))
					System.out.print("*");
				else
					System.out.print(" ");

				if (weekDay == Calendar.SATURDAY)
					System.out.println();

				d.add(Calendar.DAY_OF_MONTH, 1);
				weekDay = d.get(Calendar.DAY_OF_WEEK);

			} while (d.get(Calendar.MONTH) == month);

			System.out.println(System.getProperty("line.separator"));

		} while (d.get(Calendar.YEAR) == year);

	}
}