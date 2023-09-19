package inditex.indra.prices.infraestructura.rest.resources;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import inditex.indra.prices.aplicacion.service.TarifaService;
import inditex.indra.prices.dominio.Tarifa;
import inditex.indra.prices.infraestructura.rest.dto.SalidaDto;
import inditex.indra.prices.infraestructura.rest.dto.TarifaDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class Resources {
	private final TarifaService tarifaService;
	
	public Resources(TarifaService tS) {
		tarifaService = tS;
	}
	
	@PostMapping(value = "/consultarTarifa")
	public ResponseEntity<SalidaDto> saveUser(@RequestBody TarifaDto tarifaDto) {
		
		List<Tarifa> resList = tarifaService.getPrecio(tarifaDto.getIdBrand(), tarifaDto.getIdPoducto(), tarifaDto.getFecha());
		
		int max = -10000;
		
		Tarifa res = null;
		for(Tarifa t:resList) {
			if(t.getPrioridad()>max) {
				max = t.getPrioridad();
				res = t;
			}
		}
		

		SalidaDto salida = new SalidaDto();
		if(res!=null) {
			salida.setFinalD(res.getFinalD());
			salida.setStartD(res.getStartD());
			salida.setIdBrand(res.getIdBrand());
			salida.setIdPoducto(res.getIdPoducto());
			salida.setPrecio(res.getPrecio());
			salida.setTipoPrecio(res.getTipoPrecio());
		}
		
		return new ResponseEntity<>(salida,  HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public ResponseEntity<String> testOk(){
		return new ResponseEntity<>("Éxito", HttpStatus.OK);
	}
}
