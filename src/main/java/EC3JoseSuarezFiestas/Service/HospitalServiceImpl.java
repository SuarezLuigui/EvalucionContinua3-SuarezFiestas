package EC3JoseSuarezFiestas.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import EC3JoseSuarezFiestas.DTO.HospitalDTORequest;
import EC3JoseSuarezFiestas.DTO.HospitalDTOResponse;
import EC3JoseSuarezFiestas.Model.Hospital;
import EC3JoseSuarezFiestas.Repository.HospitalRepository;

@Service
public class HospitalServiceImpl  implements HospitalService {

    @Autowired
    private HospitalRepository repository;

    @Override
    public void guardarHospital(HospitalDTORequest Hospital) {

    	Hospital h = new Hospital();
        h.setIdHospital(Hospital.getIdHospital());
        h.setNombre(h.getNombre());
        h.setDescripcion(h.getDescripcion());
        h.setDistrito(h.getDistrito());

        repository.save(h);
    }

    @Override
    public void actualizarHospital(HospitalDTORequest Hospital) {
        // TODO Auto-generated method stub

    	Hospital h = new Hospital();
        h.setIdHospital(Hospital.getIdHospital());
        h.setNombre(h.getNombre());
        h.setDescripcion(h.getDescripcion());
        h.setDistrito(h.getDistrito());


        repository.saveAndFlush(h);
    }

    @Override
    public void eliminarHospital(Integer id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

    @Override
    public List<HospitalDTOResponse> listarHospital() {

        List<HospitalDTOResponse> listar = new ArrayList<>();

        HospitalDTOResponse dto = null;

        List<Hospital> h = repository.findAll();

        for (Hospital hospital : h) {

            dto = new HospitalDTOResponse();
            
            dto.setIdHospital(hospital.getIdHospital());
            dto.setNombre(hospital.getNombre());
            dto.setDescripcion(hospital.getDescripcion());
            dto.setDistrito(hospital.getDistrito());


            listar.add(dto);
        }

        return listar;
    }


    @Override
    public HospitalDTOResponse obtenerHospitalId(Integer id) {

    	Hospital hospital = repository.findById(id).orElse(null); 
    	HospitalDTOResponse dto = new HospitalDTOResponse();

    	 dto.setIdHospital(hospital.getIdHospital());
         dto.setNombre(hospital.getNombre());
         dto.setDescripcion(hospital.getDescripcion());
         dto.setDistrito(hospital.getDistrito());

        return dto;
    }

}
