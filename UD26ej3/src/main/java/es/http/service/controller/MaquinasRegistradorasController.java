package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.MaquinasRegistradoras;
import es.http.service.service.MaquinasRegistradorasServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinasRegistradorasController {
	
	@Autowired
	MaquinasRegistradorasServiceImpl maquinasRegistradoraServiceImpl;
	
	@GetMapping("/maquinasRegistradoras")
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras(){
		return maquinasRegistradoraServiceImpl.listarMaquinasRegistradoras();
	}
	
	
	@PostMapping("/maquinasRegistradoras")
	public MaquinasRegistradoras salvarMaquinasRegistradora(@RequestBody MaquinasRegistradoras maquinasRegistradora) {
		
		return maquinasRegistradoraServiceImpl.guardarMaquinaRegistradora(maquinasRegistradora);
	}
	
	
	@GetMapping("/maquinasRegistradoras/{codigo}")
	public MaquinasRegistradoras MaquinasRegistradoraXID(@PathVariable(name="codigo") int id) {
		
		MaquinasRegistradoras MaquinasRegistradora_xid= new MaquinasRegistradoras();
		
		MaquinasRegistradora_xid=maquinasRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
		System.out.println("MaquinasRegistradora XID: "+MaquinasRegistradora_xid);
		
		return MaquinasRegistradora_xid;
	}
	
	@PutMapping("/maquinasRegistradoras/{codigo}")
	public MaquinasRegistradoras actualizarMaquinasRegistradora(@PathVariable(name="codigo")int id,@RequestBody MaquinasRegistradoras MaquinasRegistradora) {
		
		MaquinasRegistradoras MaquinasRegistradora_seleccionado= new MaquinasRegistradoras();
		MaquinasRegistradoras MaquinasRegistradora_actualizado= new MaquinasRegistradoras();
		
		MaquinasRegistradora_seleccionado= maquinasRegistradoraServiceImpl.maquinaRegistradoraXID(id);
		
		
		MaquinasRegistradora_seleccionado.setCodigo(MaquinasRegistradora.getCodigo());
		MaquinasRegistradora_seleccionado.setPiso(MaquinasRegistradora.getPiso());
		
		MaquinasRegistradora_actualizado = maquinasRegistradoraServiceImpl.actualizarMaquinaRegistradora(MaquinasRegistradora_seleccionado);
		
		System.out.println("El MaquinasRegistradora actualizado es: "+ MaquinasRegistradora_actualizado);
		
		return MaquinasRegistradora_actualizado;
	}
	
	@DeleteMapping("/maquinasRegistradoras/{codigo}")
	public void eleiminarMaquinasRegistradora(@PathVariable(name="codigo")int id) {
		maquinasRegistradoraServiceImpl.eliminarMaquinaRegistradora(id);
	}
	
	
}
