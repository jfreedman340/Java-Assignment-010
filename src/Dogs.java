import java.util.Scanner;

public class Dogs {
    private String breed;
    private String color;
    private int size;
    private int age;

    public Dogs (String breed, int size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }
    public void eat (int ozMeat) {
        System.out.println("Your " + breed + " ate " + ozMeat + "oz of leftover meat for breakfast,");
    }
    public void run (int yards) {
        System.out.printf("ran " + yards + " yards in the dog marathon today");
        if (yards >= 100){
            System.out.print(" and won!");
        } else {
            System.out.print(" and didn't win the marathon...");
        }
    }
    public void sleep (int hours) {
        System.out.print(" Your " + breed + " then slept " + hours + " hours tonight and ");
        if (hours >= 8){
            System.out.print("that was a great amount of sleep!");
        } else {
            System.out.print("and that wasn't enough sleep...");
        }
    }
    public String name (String breed) {
        return breed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your dog's breed");
        String b = scanner.nextLine();
        System.out.println("What is your dog's color?");
        String c = scanner.nextLine();
        System.out.println("How old is your dog?");
        int age = scanner.nextInt();
        System.out.println("How tall is your dog in inches?");
        int i = scanner.nextInt();
        System.out.println("How many oz of food did your dog eat for breakfast?");
        int oz = scanner.nextInt();
        System.out.println("How many yards did your dog run today?");
        int y = scanner.nextInt();
        System.out.println("How many hours did your dog sleep?");
        int h = scanner.nextInt();


        Dogs dogs = new Dogs(b, i, c, age);

        System.out.println("Breed: " + dogs.name(b));
        System.out.println("Height: " + i + '"');
        System.out.println("Color: " + c);
        System.out.println("Age: " + age);
        System.out.println("");

        dogs.eat(oz);
        dogs.run(y);
        dogs.sleep(h);

    }
}
