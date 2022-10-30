import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<BillWater> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            list.add(new BillWater(String.format("KH%02d", i), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        list.sort((a, b) -> {
            return b.getMoney()-a.getMoney();
        });
        list.forEach(System.out::println);
    }
}

class BillWater {
    private String id;
    private String name;
    private int oldIndex, newIndex;

    public BillWater() {
    }

    public BillWater(String id, String name, int oldIndex, int newIndex) {
        this.id = id;
        this.name = name;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getMoney() {
        float num = newIndex - oldIndex;
        if(num <= 50)
            return (int) (num*102);
        if(num <= 100)
            return (int) Math.round((50*100+(num-50)*150)*1.03);
        return (int) Math.round((50*100+50*150+(num-100)*200)*1.05);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getMoney();
    }
}