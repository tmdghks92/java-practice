package next.exception;

public class Pins {
	private int falledPins;

	private Pins(int falledPins) {
		if (falledPins < 0 || falledPins > 10) {
			throw new IllegalArgumentException();
		}
		this.falledPins = falledPins;
	}

	public static Pins lost(int falledPins) {
		return new Pins(falledPins);
	}

	@Override
	public String toString() {
		return "falledPins :" + falledPins;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + falledPins;
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
		Pins other = (Pins) obj;
		if (falledPins != other.falledPins)
			return false;
		return true;
	}

}
