package org.vaccom.vcmgt.action;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vaccom.vcmgt.entity.NguoiTiemChung;


@Service
public interface NguoiTiemChungAction {
	
	public NguoiTiemChung addNguoiTiemChung(String reqBody) throws Exception;
	
	public boolean deleteNguoiTiemChung(long id) throws Exception ;
	
	public List<NguoiTiemChung> searchNguoiTiemChung(int page, int size);
	
	public NguoiTiemChung updateNguoiTiemChung(long id, String reqBody) throws Exception;
}
