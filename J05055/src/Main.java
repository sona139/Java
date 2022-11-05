import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Athlete> list = new ArrayList<>();
		for (int i = 0; i < n; i++)
			list.add(new Athlete(String.format("VDV%02d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
		list.sort((a, b) -> {
			return a.getFinalTime() - b.getFinalTime();
		});
		list.get(0).setRank(1);
		for (int i = 1; i < n; i++)
			if(list.get(i).getFinalTime() == (list.get(i-1).getFinalTime()))
				list.get(i).setRank(list.get(i-1).getRank());
			else list.get(i).setRank(i+1);
		list.sort((a, b) -> {
			return a.getId().compareTo(b.getId());
		});
		list.forEach(System.out::println);
	}
}

class Athlete {
	private String id;
	private String name;
	private String DOB;
	private String timeStart;
	private String timeEnd;
	private int rank;

	public Athlete(String id, String name, String DOB, String timeStart, String timeEnd) throws ParseException {
		this.id = id;
		this.name = name;
		this.DOB = DOB;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
	}

	public int getYear() {
		return Integer.parseInt(DOB.substring(6));
	}

	public int getAge() {
		return 2021-getYear();
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

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	private int getPriorityTime(){
		int age = getAge();
		if(age >= 32) return 3;
		if(age >= 25) return 2;
		if(age >= 18) return 1;
		return 0;
	}

	private int getTime(String time) {
		return Integer.parseInt(time.substring(0, 2))*3600 + Integer.parseInt(time.substring(3, 5))*60 + Integer.parseInt(time.substring(6));
	}

	private int getTotalTime() {
		return getTime(timeEnd) - getTime(timeStart);
	}
	public int getFinalTime() {
		return getTotalTime() - getPriorityTime();
	}

	private String format(int time) {
		return String.format("%02d:%02d:%02d", time/3600, time%3600/60, time%60);
	}

	@Override
	public String toString() {
		return id + " " + name + " " + format(getTotalTime()) + " " + format(getPriorityTime()) + " " + format(getFinalTime()) +  " " + rank;
	}
}