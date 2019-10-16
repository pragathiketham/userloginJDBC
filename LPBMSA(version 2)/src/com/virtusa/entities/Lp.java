package com.virtusa.entities;

public class Lp {

	private String lpId;
	public Lp() {}
	public String getLpId() {
		return lpId;
	}
	public void setLpId(String lpId) {
		this.lpId = lpId;
	}
	@Override
	public String toString() {
		return "Lp [lpId=" + lpId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lpId == null) ? 0 : lpId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lp other = (Lp) obj;
		if (lpId == null) {
			if (other.lpId != null)
				return false;
		} else if (!lpId.equals(other.lpId))
			return false;
		return true;
	}
	
}
