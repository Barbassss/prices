package inditex.indra.prices.aplicacion.service;

import java.util.Date;
import java.util.List;

import inditex.indra.prices.aplicacion.repository.TarifaRepository;
import inditex.indra.prices.dominio.Tarifa;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TarifaService {
	private final TarifaRepository tarifaRepository;
	
	public TarifaService(TarifaRepository t) {
		tarifaRepository = t;
	}
	
	public List<Tarifa> getPrecio(Long idB, Long idP, String fecha) {
		return tarifaRepository.buscarPorEntrada(idB, idP, fecha);
	}
}
