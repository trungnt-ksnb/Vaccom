package org.vaccom.vcmgt.action;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vaccom.vcmgt.entity.NguoiDung;

@Service
public interface NguoiDungAction {
	
	public NguoiDung addNguoiDung(String reqBody) throws Exception;
	
	public boolean deleteNguoiDung(long id) throws Exception;
	
	public void initNguoiDung() throws Exception;
	
	public List<NguoiDung> findAll(int page, int size);
	
	public NguoiDung lockNguoiDung(long id, boolean isKhoaTaiKhoan) throws Exception;
	
	public NguoiDung changeMatKhau(long id, String matKhauMoi) throws Exception;
	
	public NguoiDung updateNguoiDung(long id, String reqBody) throws Exception;
}
