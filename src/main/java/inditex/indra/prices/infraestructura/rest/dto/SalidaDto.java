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
public class SalidaDto {
	private Long idPoducto;
	
	private Long idBrand;
	
	private Long tipoPrecio;
	
	private Date startD;
	
	private Date finalD;
	
	private Double precio;

	public Long getIdPoducto() {
		return idPoducto;
	}

	public void setIdPoducto(Long idPoducto) {
		this.idPoducto = idPoducto;
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
	}

	public Long getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(Long tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public Date getStartD() {
		return startD;
	}

	public void setStartD(Date startD) {
		this.startD = startD;
	}

	public Date getFinalD() {
		return finalD;
	}

	public void setFinalD(Date finalD) {
		this.finalD = finalD;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
