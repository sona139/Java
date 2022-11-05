package view;

import java.util.Iterator;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Subject;

public class InvoiceView {
	public InvoiceView() {
	}

	public static void show(Invoice invoice) {
		System.out.println("Mã sinh viên: " + invoice.getSt().getCode());
		System.out.println("Họ tên: " + invoice.getSt().getName());
		System.out.println("Các môn học:");
		Iterator var1 = invoice.getAlSubject().iterator();

		while(var1.hasNext()) {
			Subject subject = (Subject)var1.next();
			System.out.println(subject.getName());
		}

		System.out.println("Học phí phải nộp là: " + invoice.getAmount());
		System.out.println("Theo QĐ: " + invoice.getRule().getCode());
	}
}