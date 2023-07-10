package gameMake;

public class Game {
	private String name;
	private String weapon;
	private int level;
	private int money;
	private int boss;

	public Game(String name, String weapon, int level, int money, int boss) {
		this.name = name;
		this.weapon = weapon;
		this.level = level;
		this.money = money;
		this.boss = boss;
	}

	public String getName() {
		return this.name;
	}

	public String getWeapon() {
		return this.weapon;
	}

	public int getLevel() {
		return this.level;
	}

	public int getMoney() {
		return this.money;
	}

	public int getBoss() {
		return this.boss;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setBoss(int boss) {
		this.boss = boss;
	}
}
