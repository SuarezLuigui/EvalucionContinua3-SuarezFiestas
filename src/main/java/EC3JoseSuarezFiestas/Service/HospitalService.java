package EC3JoseSuarezFiestas.Service;

import java.util.List;

import EC3JoseSuarezFiestas.DTO.HospitalDTORequest;
import EC3JoseSuarezFiestas.DTO.HospitalDTOResponse;

public interface HospitalService {
	
	 void guardarHospital(HospitalDTORequest hospital);
	 void actualizarHospital(HospitalDTORequest hospital);
	 void eliminarHospital(Integer id);
	 List<HospitalDTOResponse> listarHospital();
	 HospitalDTOResponse obtenerHospitalId(Integer id);

}
