package stt09_PhamThiThuHa_23680571_PhongHoc;

import java.util.Iterator;
import java.util.List;

public class TestPH {

	public static void main(String[] args) {
		ListPhongHoc ph = new ListPhongHoc();
		ph.themPhong(new PhongLT("A01", "Day A", 100, 30, true));
		ph.themPhong(new PhongMT("H04", "Day H", 90, 25, 60));
		ph.themPhong(new PhongMT("H02", "day H", 120, 40, 70));
		ph.themPhong(new PhongTN("B02", "Day F", 80, 35, "Hoa Hoc", 50, true));
		
		System.out.println("Danh sach phong hoc");
		System.out.println(ph);
		
		String  mp ="A01";
		System.out.println("Phong hoc voi ma: " +mp);
		System.out.println(ph.timPhong(mp));
		
		List<PhongHoc> pDC = ph.danhSachDC();
		System.out.println("Danh sach phong dat chuan");
		for (PhongHoc p : pDC) {
			System.out.println(p);
		}
		
		ph.sapXepTheoDayNha();
		System.out.println("Danh sach phong hoc theo day nha: ");
		System.out.println(ph);
		
		ph.sapXepTheoDientich();
		System.out.println("Danh sach phong hoc theo dien tich: ");
		System.out.println(ph);
		
		ph.sapXepTheoBongDen();
		System.out.println("Danh sach phong hoc theo bong den: ");
		System.out.println(ph);
	}
			

}
