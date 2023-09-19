package inditex.indra.prices.aplicacion.repository;

import java.util.Date;
import java.util.List;

import inditex.indra.prices.dominio.Tarifa;

public interface TarifaRepository {
	List<Tarifa> buscarPorEntrada(Long idB, Long idP, String fecha);
}
