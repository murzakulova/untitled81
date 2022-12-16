public class Main {
    public static void main(String[] args) {
        {
            Swim chulduk1 = new Duck();
            Swim chulduk2 = new Duck();
            Swim akula1 = new Shark();
            Swim akula2 = new Shark();
            Swim parrot1 = new Turtle();
            Swim parrot2 = new Turtle();

            Swim[] animals = {chulduk1, chulduk2, akula1, akula2, parrot1, parrot2};

            Duck[] chulduk = new Duck[2];
            Shark[] horses = new Shark[2];
            Turtle[] parrots = new Turtle[2];

            int i = 0;
            int j = 0;
            int k = 0;

            for (Swim animal : animals) {
                if (animal instanceof Duck) {
                    chulduk[i] = (Duck) animal;
                    i++;
                } else if (animal instanceof Shark) {
                    horses[j] = (Shark) animal;
                    j++;
                } else {
                    parrots[k] = (Turtle) animal;
                    k++;
                }
            }
            System.out.println(" Бул дагы  ");
            for (Duck dog : chulduk) {
                dog.duck();
                System.out.println(dog.getClass().getName());
            }
            System.out.println(" ");
            System.out.println(" Бул дагы ");
            for (Shark horse : horses) {
                horse.shark();
                System.out.println(horse.getClass().getName());
            }
            System.out.println(" ");
            System.out.println(" ");
            for (Turtle parrot : parrots) {
                parrot.turtle();
                System.out.println(parrots.getClass().getName());
            }

        }
    }
}