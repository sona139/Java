import vn.edu.ptit.Invoice;
import view.InvoiceView;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		PaymentController pc = new PaymentController();
		Invoice invoice = pc.getInvoice();
		InvoiceView.show(invoice);
	}
}

class PaymentController {
	public Invoice getInvoice() {
		Scanner sc = new Scanner(System.in);
		Student st = new Student(sc.nextLine(), sc.nextLine());

		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Subject> alSubject = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String code = sc.nextLine();
			String name = sc.nextLine();
			alSubject.add(new Subject(name, code, Integer.parseInt(sc.nextLine())));
		}

		Rule rule = new Rule(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));

		Invoice invoice = new Invoice(rule);
		invoice.setId(1);
		invoice.setAlSubject(alSubject);
		invoice.setSt(st);
		invoice.setAmount(getAmount(rule, alSubject));
		return invoice;
	}

	private double getAmount(Rule rule, ArrayList<Subject> alSubject) {
		return alSubject.stream().collect(Collectors.summingDouble(Subject::getCredit))*rule.getCreditPrice();
	}
}