package stt09_PhamThiThuHa_23680571_PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	private List<PhongHoc> dsP;
	public ListPhongHoc() {
		dsP = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhong(PhongHoc p) {
		if(dsP.contains(p))
			return false;
		dsP.add(p);
		return true;
	}
	
	public PhongHoc timPhong(String maPhong) {
		for(PhongHoc p:dsP) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}
		return null;
	}
	public List<PhongHoc> danhSachDC(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc p : dsP) {
			if(p.getDatChuan())
				dsDC.add(p);
		}
		return dsDC;
	}
	
	public void sapXepTheoDayNha() {
		dsP.sort((p1,p2)-> p1.getDayNha().compare;
	}
	
	@Override
	public String toString() {
		StringBuilder sb= new StringBuilder();
		for(PhongHoc p :dsP) {
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}
}
