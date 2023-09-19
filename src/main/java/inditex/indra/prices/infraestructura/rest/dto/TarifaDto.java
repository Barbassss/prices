package inditex.indra.prices.infraestructura.rest.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TarifaDto {
	private Long idBrand;
	
	private String fecha;
	
	private Long idPoducto;


	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Long getIdPoducto() {
		return idPoducto;
	}

	public void setIdPoducto(Long idPoducto) {
		this.idPoducto = idPoducto;
	}
}
