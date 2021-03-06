package de.forsthaus.backend.model;

// Generated 01.12.2008 17:20:23 by Hibernate Tools 3.2.2.GA

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Artikel generated by hbm2java
 */
public class Artikel implements java.io.Serializable {

	private static final long serialVersionUID = -9061377715848712924L;

	private long artId = Long.MIN_VALUE;
	private int version;
	private String artKurzbezeichnung = "";
	private String artLangbezeichnung = "";
	private String artNr = "";
	private BigDecimal artPreis = new BigDecimal(0.00);
	private Set<Auftragposition> auftragpositions = new HashSet<Auftragposition>(0);

	public boolean isNew() {
		return (getArtId() == Long.MIN_VALUE);
	}

	public Artikel() {
	}

	public Artikel(long artId, String artKurzbezeichnung, String artNr, BigDecimal artPreis) {
		this.artId = artId;
		this.artKurzbezeichnung = artKurzbezeichnung;
		this.artNr = artNr;
		this.artPreis = artPreis;
	}

	public Artikel(long artId, String artKurzbezeichnung, String artLangbezeichnung, String artNr, BigDecimal artPreis,
			Set<Auftragposition> auftragpositions) {
		this.artId = artId;
		this.artKurzbezeichnung = artKurzbezeichnung;
		this.artLangbezeichnung = artLangbezeichnung;
		this.artNr = artNr;
		this.artPreis = artPreis;
		this.auftragpositions = auftragpositions;
	}

	public long getArtId() {
		return this.artId;
	}

	public void setArtId(long artId) {
		this.artId = artId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getArtKurzbezeichnung() {
		return this.artKurzbezeichnung;
	}

	public void setArtKurzbezeichnung(String artKurzbezeichnung) {
		this.artKurzbezeichnung = artKurzbezeichnung;
	}

	public String getArtLangbezeichnung() {
		return this.artLangbezeichnung;
	}

	public void setArtLangbezeichnung(String artLangbezeichnung) {
		this.artLangbezeichnung = artLangbezeichnung;
	}

	public String getArtNr() {
		return this.artNr;
	}

	public void setArtNr(String artNr) {
		this.artNr = artNr;
	}

	public BigDecimal getArtPreis() {
		return this.artPreis;
	}

	public void setArtPreis(BigDecimal artPreis) {
		this.artPreis = artPreis;
	}

	public Set<Auftragposition> getAuftragpositions() {
		return this.auftragpositions;
	}

	public void setAuftragpositions(Set<Auftragposition> auftragpositions) {
		this.auftragpositions = auftragpositions;
	}

	@Override
	public int hashCode() {
		return Long.valueOf(getArtId()).hashCode();
	}

	public boolean equals(Artikel artikel) {
		return getArtId() == artikel.getArtId();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Artikel) {
			Artikel artikel = (Artikel) obj;
			return equals(artikel);
		}

		return false;
	}

}
