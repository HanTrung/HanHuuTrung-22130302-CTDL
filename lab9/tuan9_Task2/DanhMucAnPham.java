package tuan9_Task2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DanhMucAnPham  {
	private List<AnPham> danhSachAnPham;

    public DanhMucAnPham() {
        this.danhSachAnPham = new ArrayList<>();
    }
   
    public double tongTienAnPham() {
		double tongTien = 0.0;
		for (AnPham ap : danhSachAnPham) {
			tongTien = tongTien + ap.getGiaTien();

		}
		return tongTien;
	}
    public void themAnPham(AnPham anPham) {
        danhSachAnPham.add(anPham);
        
        
    }
    public AnPham timSachThamKhaoNhieuTrangNhat() {
    	 AnPham anPhamNhieuTrangNhat = null;
         int soTrangMax = 0;

         for (AnPham ap : danhSachAnPham) {
             int soTrangChuongMax = ap.soTrangChuongNhieuNhat();

             if (soTrangChuongMax > soTrangMax) {
                 soTrangMax = soTrangChuongMax;
                 anPhamNhieuTrangNhat = ap;
             }
         }

         return anPhamNhieuTrangNhat;
         
     }
    
    public boolean isChuaTapChi(TapChi tapChi ) {
    	for (AnPham anPham : danhSachAnPham) {
            if (anPham.getLoaiAnPham().equals("Tạp chí")) {
                if (((TapChi) anPham).getTenTapChi().equals(tapChi.getTenTapChi())) {
                    return true;
                }
            }
        }
        return false;
    }
    public List<TapChi> tapChiXuatBanTrongNam(int namXuatBan) {
        List<TapChi> tapChiList = new ArrayList<>();

        for (AnPham anPham : danhSachAnPham) {
            if (anPham.getLoaiAnPham().equals("Tạp chí") && anPham.getNamXuatBan() == namXuatBan+1) {
                tapChiList.add((TapChi) anPham);
            }
        }

        return tapChiList;
    }
    public void sapXepAnPham() {
        Collections.sort(danhSachAnPham);
        System.out.println(danhSachAnPham);
    }
    public void thongKeSoLuongTheoNam() {
        Map<Integer, Integer> soLuongTheoNam = new HashMap<>();
        for (AnPham anPham : danhSachAnPham) {
            int namXuatBan = anPham.getNamXuatBan();
            soLuongTheoNam.put(namXuatBan, soLuongTheoNam.getOrDefault(namXuatBan, 0) + 1);
        }
        System.out.println("Thống kê số lượng ấn phẩm theo năm xuất bản:");
        for (Map.Entry<Integer, Integer> entry : soLuongTheoNam.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    @Override
    public String toString() {
    	return "danhSachAnPham: " + danhSachAnPham+ "\n";
    }
 }

        
    

	
    