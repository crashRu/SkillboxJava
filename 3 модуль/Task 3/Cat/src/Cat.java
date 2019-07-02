import java.util.Random;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double eaterFood;
    private static int count;

    Random random = new Random();

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

    }

    public static String getCount() {
        return "После всех бед кошек осталось " + count;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        deleteCat();
    }
    public void restroom()
    {
        weight = weight - (0.3 * random.nextInt(10));;
        System.out.println("Кошка сходила в туалет");
        deleteCat();
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eaterFood = eaterFood + amount;
        deleteCat();
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        deleteCat();
    }

    public Double getWeight()
    {
        return weight;
    }

    public void deleteCat()
        {
            if(weight < minWeight) {
                count--;
            } else if (weight > maxWeight) {
                count--;
            }
        }

    public double getEaterFood()
    {
        return eaterFood;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}