import java.util.Random;

public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double eaterFood;

    Random random = new Random();

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }
    public void restroom()
    {
        weight = weight - (0.3 * random.nextInt(10));;
        System.out.println("Кошка сходила в туалет");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eaterFood = eaterFood + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
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