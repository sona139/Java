import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

class IntSet {
    TreeSet tree;

    public IntSet(int[] a) {
        tree = new TreeSet();
        for (int i = 0; i < a.length; i++)
            this.tree.add(a[i]);
    }

    public IntSet(TreeSet a) {
        this.tree = a;
    }

    public IntSet union(IntSet a) {
        this.tree.addAll(a.tree);
        return new IntSet(this.tree);
    }

    @Override
    public String toString() {
        tree.forEach(e -> System.out.print(e + " "));
        return "";
    }
}
