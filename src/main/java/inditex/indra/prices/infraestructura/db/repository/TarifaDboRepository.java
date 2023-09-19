package inditex.indra.prices.infraestructura.db.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import inditex.indra.prices.aplicacion.repository.TarifaRepository;
import inditex.indra.prices.dominio.Tarifa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TarifaDboRepository implements TarifaRepository {
	
	private final SpringDataTarifaRepository tRepository;
	
	public TarifaDboRepository(SpringDataTarifaRepository tR) {
		tRepository = tR;
	}
	
	@Override
	public List<Tarifa> buscarPorEntrada(Long idB, Long idP, String fecha) {
		return tRepository.findByEntrada(idB, idP, fecha);
	}
	
}
