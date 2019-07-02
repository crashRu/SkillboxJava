import java.util.Random;

public class Cat {
	public static final int EYES = 2;
	public static final double MIN_CAT_WEIGHT = 150.0; // ГРАММ
	public static final double MAX_CAT_WEIGHT = 10000;// ГРАММ

	private static int count;

	private double originWeight;
	private double weight;
	private double minWeight;
	private double maxWeight;
	private double eaterFood;
	private boolean catAlive = true;
	private ColorCat colorCat;

	Random random = new Random();


	public Cat() {
		weight = (1500.0 + 3000.0 * Math.random());
		originWeight = weight;
		minWeight = 1000.0;
		maxWeight = 9000.0;
		count++;

	}

	public Cat(double weight) {
		this();
		this.weight = weight;
		count++;
	}

	public static String getCount() {
		return "После всех бед кошек осталось " + count;
	}

	public ColorCat getColorCat() {
		return colorCat;
	}

	public void setColorCat(ColorCat colorCat) {
		this.colorCat = colorCat;
	}

	public static Cat createTwin(Cat original) {
			Cat copy = new Cat();
			copy.originWeight = original.originWeight;
			copy.weight = original.weight;
			copy.eaterFood = original.eaterFood;
			return copy;
	}


	public void meow() {
		if (aliveOrDead()) {
			weight = weight - 1;
			System.out.println("Meow");
			if (!aliveOrDead()) deleteCat();
		}
	}

	public void restroom() {
		if(aliveOrDead()) {
			weight = weight - (0.3 * random.nextInt(10));
			System.out.println("Кошка сходила в туалет");
			if (weight < MIN_CAT_WEIGHT) {
				if (!aliveOrDead()) deleteCat();
			}
		}
	}

	public void feed(Double amount) {
		if(aliveOrDead()) {
			weight = weight + amount;
			eaterFood = eaterFood + amount;
			if (!aliveOrDead()) deleteCat();
		}
	}

	public void drink(Double amount) {
		if (aliveOrDead()) {
			weight = weight + amount;
			if (!aliveOrDead()) deleteCat();
		}
	}

	public Double getWeight() {
		return weight;
	}

	public void deleteCat() {
		count--;
		System.out.println("Кот выбежал на улицу и его переехал танк. Вы потеряли своего кота, " +
				"можете попробывать отшкрябать его с асфальта!!!");
	}

	public double getEaterFood() {
		return eaterFood;
	}

	public boolean aliveOrDead() {
		if(getStatus().equals("Sleeping") || getStatus().equals("Playing")) {
			catAlive = true;
		} else if(getStatus().equals("Dead") || getStatus().equals("Exploded")) {
			catAlive = false;
		}
		return catAlive;
	}

	public String getStatus() {
		if (weight < minWeight) {
			return "Dead";
		} else if (weight > maxWeight) {
			return "Exploded";
		} else if (weight > originWeight) {
			return "Sleeping";
		} else {
			return "Playing";
		}
	}
}