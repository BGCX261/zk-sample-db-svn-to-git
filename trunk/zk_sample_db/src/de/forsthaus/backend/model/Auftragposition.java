package de.forsthaus.backend.model;

// Generated 01.12.2008 17:20:23 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;

/**
 * Auftragposition generated by hbm2java
 */
public class Auftragposition implements java.io.Serializable {

	private static final long serialVersionUID = -1714867949815379740L;

	private long aupId = Long.MIN_VALUE;
	private int version;
	private Auftrag auftrag;
	private Artikel artikel;
	private Integer aupPosition;
	private BigDecimal aupMenge;
	private BigDecimal aupEinzelwert;
	private BigDecimal aupGesamtwert;

	public boolean isNew() {
		return (getAupId() == Long.MIN_VALUE);
	}

	public Auftragposition() {
	}

	public Auftragposition(long aupId, Auftrag auftrag) {
		this.aupId = aupId;
		this.auftrag = auftrag;
	}

	public Auftragposition(long aupId, Auftrag auftrag, Artikel artikel, Integer aupPosition, BigDecimal aupMenge,
			BigDecimal aupEinzelwert, BigDecimal aupGesamtwert) {
		this.aupId = aupId;
		this.auftrag = auftrag;
		this.artikel = artikel;
		this.aupPosition = aupPosition;
		this.aupMenge = aupMenge;
		this.aupEinzelwert = aupEinzelwert;
		this.aupGesamtwert = aupGesamtwert;
	}

	public long getAupId() {
		return this.aupId;
	}

	public void setAupId(long aupId) {
		this.aupId = aupId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Auftrag getAuftrag() {
		return this.auftrag;
	}

	public void setAuftrag(Auftrag auftrag) {
		this.auftrag = auftrag;
	}

	public Artikel getArtikel() {
		return this.artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public Integer getAupPosition() {
		return this.aupPosition;
	}

	public void setAupPosition(Integer aupPosition) {
		this.aupPosition = aupPosition;
	}

	public BigDecimal getAupMenge() {
		return this.aupMenge;
	}

	public void setAupMenge(BigDecimal aupMenge) {
		this.aupMenge = aupMenge;
	}

	public BigDecimal getAupEinzelwert() {
		return this.aupEinzelwert;
	}

	public void setAupEinzelwert(BigDecimal aupEinzelwert) {
		this.aupEinzelwert = aupEinzelwert;
	}

	public BigDecimal getAupGesamtwert() {
		return this.aupGesamtwert;
	}

	public void setAupGesamtwert(BigDecimal aupGesamtwert) {
		this.aupGesamtwert = aupGesamtwert;
	}

	@Override
	public int hashCode() {
		return Long.valueOf(getAupId()).hashCode();
	}

	public boolean equals(Auftragposition auftragposition) {
		return getAupId() == auftragposition.getAupId();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Auftragposition) {
			Auftragposition auftragposition = (Auftragposition) obj;
			return equals(auftragposition);
		}

		return false;
	}

}
