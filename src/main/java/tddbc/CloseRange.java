package tddbc;

public class CloseRange {

	int lowerEndPoint;

	int upperEndPoint;

	public CloseRange(int lowerEndPoint, int upperEndPoint) {
		if (upperEndPoint < lowerEndPoint) {
			throw new IllegalArgumentException(
					"upperEndPointがlowerEndPointよりも大きい値になっています。 "+
					"upperEndPoint=" + upperEndPoint + 
					", lowerEndPoint=" + lowerEndPoint);
		}
		this.lowerEndPoint = lowerEndPoint;
		this.upperEndPoint = upperEndPoint;

	}

	public int getLowerEndPoint() {
		return lowerEndPoint;
	}

	public int getUpperEndPoint() {
		return upperEndPoint;
	}

	@Override
	public String toString() {
		return String.format("[%d,%d]", this.lowerEndPoint, this.upperEndPoint);
	}

	public boolean contains(int value) {
		return (this.lowerEndPoint <= value && value <= this.upperEndPoint);
	}

	public boolean equals(CloseRange range) {
		return ((this.lowerEndPoint == range.lowerEndPoint) && (this.upperEndPoint == range.upperEndPoint));
	}

	public boolean isConnectedTo(CloseRange range) {
		// final boolean isLowerOutOfRange = range.upperEndPoint <
		// this.lowerEndPoint;
		// final boolean isHigherOutOfRange = this.upperEndPoint <
		// range.lowerEndPoint;
		// return !(isLowerOutOfRange || isHigherOutOfRange );
		return !isNotConnectedTo(range);
	}

	private boolean isNotConnectedTo(CloseRange range) {
		final boolean isLowerOutOfRange = range.upperEndPoint < this.lowerEndPoint;
		final boolean isHigherOutOfRange = this.upperEndPoint < range.lowerEndPoint;
		return isLowerOutOfRange || isHigherOutOfRange;
	}

}
