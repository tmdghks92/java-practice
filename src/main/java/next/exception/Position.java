package next.exception;

public class Position {
	private int x;
	private int y;

	public Position(String position) {
		x = (int) (position.charAt(0) - 'a');
		y = Integer.parseInt(position.substring(1)) - 1;
		if (x < 0 || x > 7 || y < 0 || y > 7) {
			throw new IllegalArgumentException("좌표값은 0보다 작거나 7보다 클 수 없습니다.");
		}
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}