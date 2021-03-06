package de.forsthaus.backend.model;

// Generated 31.01.2009 22:31:49 by Hibernate Tools 3.2.2.GA

/**
 * SecUserrole generated by hbm2java
 */
public class SecUserrole implements java.io.Serializable {

	private static final long serialVersionUID = 6613720067926409622L;

	private long urrId = Long.MIN_VALUE;
	private int version;
	private SecUser secUser;
	private SecRole secRole;

	public boolean isNew() {
		return (getUrrId() == Long.MIN_VALUE);
	}

	public SecUserrole() {
	}

	public SecUserrole(long urrId) {
		this.urrId = urrId;
	}

	public SecUserrole(long urrId, SecUser secUser, SecRole secRole) {
		this.urrId = urrId;
		this.secUser = secUser;
		this.secRole = secRole;
	}

	public long getUrrId() {
		return this.urrId;
	}

	public void setUrrId(long urrId) {
		this.urrId = urrId;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public SecUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecUser secUser) {
		this.secUser = secUser;
	}

	public SecRole getSecRole() {
		return this.secRole;
	}

	public void setSecRole(SecRole secRole) {
		this.secRole = secRole;
	}

	@Override
	public int hashCode() {
		return Long.valueOf(getUrrId()).hashCode();
	}

	public boolean equals(SecUserrole secUserrole) {
		return getUrrId() == secUserrole.getUrrId();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof SecUserrole) {
			SecUserrole secUserrole = (SecUserrole) obj;
			return equals(secUserrole);
		}

		return false;
	}

}
