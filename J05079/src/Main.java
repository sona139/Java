import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Student[] sts = new Student[n];
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sts[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            map.put(sts[i].getId(), sts[i].getName());
        }
        Arrays.sort(sts, (a, b) -> {
            return a.getGroup().compareTo(b.getGroup());
        });
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            String id = sc.nextLine();
            System.out.format("Danh sach nhom lop mon %s:\n", map.get(id));
            for (int j = 0; j < n; j++)
                if(sts[j].getId().equals(id))
                    System.out.println(sts[j]);
        }
    }
}

class Student {
    private String id;
    private String name;
    private String group;
    private String nameP;

    public Student() {
    }

    public Student(String id, String name, String group, String nameP) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.nameP = nameP;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getNameP() {
        return nameP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    @Override
    public String toString() {
        return group + " " + nameP;
    }
}