package tddbc;

public class OpenRange {

	private final int lowerEndPoint;
	private final int upperEndPoint;
	public OpenRange(int lowerEndPoint, int upperEndPoint) {
		if ( upperEndPoint <= lowerEndPoint ) {
			throw new IllegalArgumentException();
		}
		this.lowerEndPoint = lowerEndPoint;
		this.upperEndPoint = upperEndPoint;
	}

}
