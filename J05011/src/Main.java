import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Gamer> gs = new ArrayList<>();
		for (int i = 0; i < n; i++)
			gs.add(new Gamer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		gs.sort((a, b) -> {
			return b.getD().compareTo(a.getD());
		});
		gs.forEach(System.out::println);
	}
}

class Gamer {
	private String id;
	private String name;
	private String timeIn, timeOut;
	private Date d;
	private long time;

	public Gamer() {
	}

	public Gamer(String id, String name, String timeIn, String timeOut) throws ParseException {
		this.id = id;
		this.name = name;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		Date tI = sdf.parse(timeIn);
		Date tO = sdf.parse(timeOut);
		time = tO.getTime()-tI.getTime();
		d = new Date(time);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(String timeIn) {
		this.timeIn = timeIn;
	}

	public String getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

	public String getTotalTime() throws ParseException {
		return String.format("%d gio %d phut", time/3600000, (time/60000)%60);
	}

	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	@Override
	public String toString() {
		try {
			return id + " " + name + " " + getTotalTime();
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}