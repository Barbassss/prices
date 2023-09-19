package inditex.indra.prices.infraestructura.db.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import inditex.indra.prices.dominio.Tarifa;
import jakarta.persistence.SqlResultSetMapping;

@Repository
public interface SpringDataTarifaRepository  extends JpaRepository<Tarifa, Long> {
	@Query(value = "SELECT "
			+ "t.ID, t.ID_BRAND, t.START_DATE, t.END_DATE, t.PRICE_LIST, t.PRODUCT_ID, t.PRIORITY, t.PRICE, t.CURR "
			+ "FROM TARIFA t "
			+ "WHERE t.PRODUCT_ID = ?2 AND t.ID_BRAND= ?1 AND t.END_DATE>= ?3 AND t.START_DATE<= ?3", nativeQuery = true)
	List<Tarifa> findByEntrada(Long idB, Long idP, String fecha);
}
