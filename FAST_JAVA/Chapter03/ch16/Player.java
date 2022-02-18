package ch16;

public class Player {

	private int level;

	public Player(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel p) {
		if (p instanceof BeginnerLevel) {
			BeginnerLevel b = (BeginnerLevel) p;
			b.showLevelMessage();
		} else if (p instanceof AdvancedLevel) {
			AdvancedLevel a = (AdvancedLevel) p;
			a.showLevelMessage();
		} else if (p instanceof SuperLevel) {
			SuperLevel s = (SuperLevel) p;
			s.showLevelMessage();
		}
	}

	public void play() {
		if (level == 1) {
			PlayerLevel level1 = new BeginnerLevel();
			level1.go(level);
		} else if (level == 2) {
			PlayerLevel level2 = new AdvancedLevel();
			level2.go(level);
		} else if (level == 3) {
			PlayerLevel level3 = new SuperLevel();
			level3.go(level);
		}
	}
}
