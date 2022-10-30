import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ip = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(ip[0]);
        int m = Integer.parseInt(ip[1]);
        Student[] students = new Student[n];
        Group[] groups = new Group[m+1];
        for (int i = 1; i <= m; i++)
            groups[i] = new Group();
        for (int i = 0; i < n; i++) {
            students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            groups[students[i].getGroup()].list.add(students[i]);
        }
        for (int i = 1; i <= m; i++)
            groups[i].setHw(sc.nextLine());
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int group = sc.nextInt();
            System.out.format("DANH SACH NHOM %d:\n", group);
            System.out.println(groups[group]);
        }
    }
}

class Group {
    private String hw;
    public ArrayList<Student> list;

    public Group() {
        list = new ArrayList<>();
    }

    public Group(String hw, ArrayList<Student> list) {
        this.hw = hw;
        this.list = list;
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public String getHw() {
        return hw;
    }

    public void setHw(String hw) {
        this.hw = hw;
    }

    @Override
    public String toString() {
        final String[] res = {""};
        list.forEach(e -> {res[0] += e + "\n";});
        return res[0] + String.format("Bai tap dang ky: %s", hw);
    }
}

class Student {
    private String id;
    private String name;
    private String phone;
    private int group;

    public Student() {
    }

    public Student(String id, String name, String phone, int group) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.group = group;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone;
    }
}