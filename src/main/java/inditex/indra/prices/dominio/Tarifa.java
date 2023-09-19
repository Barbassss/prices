package inditex.indra.prices.dominio;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "TARIFA")
public class Tarifa {
	public Tarifa() {}
	
	public Tarifa(Long id, Long idBrand, Date startD, Date finalD, Long tipoPrecio, Long idPoducto, Integer prioridad, Double precio, String moneda) {
		this.id = id;
		this.idBrand = idBrand;
		this.startD = startD;
		this.finalD = finalD;
		this.tipoPrecio = tipoPrecio;
		this.idPoducto = idPoducto;
		this.prioridad = prioridad;
		this.precio = precio;
		this.moneda = moneda;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
	private Long id;
	
	@Column(name = "ID_BRAND")
	private Long idBrand;
	
	@Column(name = "START_DATE")
	private Date startD;
	
	@Column(name = "END_DATE")
	private Date finalD;
	
	@Column(name = "PRICE_LIST")
	private Long tipoPrecio;
	
	@Column(name = "PRODUCT_ID")
	private Long idPoducto;
	
	@Column(name = "PRIORITY")
	private Integer prioridad;
	
	@Column(name = "PRICE")
	private Double precio;
	
	@Column(name = "CURR")
	private String moneda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(Long idBrand) {
		this.idBrand = idBrand;
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

	public Long getTipoPrecio() {
		return tipoPrecio;
	}

	public void setTipoPrecio(Long tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}

	public Long getIdPoducto() {
		return idPoducto;
	}

	public void setIdPoducto(Long idPoducto) {
		this.idPoducto = idPoducto;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
}
