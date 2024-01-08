import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] weight = new int[10];
        int avWeight = 0;
        int number = 0;
        int number2 = 0;
        int number3 = 0;


        int i;
        for (i = 0; i < weight.length; i++) {
            weight[i] = new Random().nextInt(40, 101); //weight[i]= (new Random().nextInt() * 60) + 40;
            avWeight = avWeight + weight[i];
            System.out.println(weight[i] + " kg");//avWeight += weight[i];
            if (weight[i] >= 60 && weight[i] <= 80) {
                number++;
            }
            if (weight[i] < 60) {
                number2++;
            }
            if (weight[i] > 80) {
                number3++;
            }
        }

        System.out.println("Общий вес: " + avWeight);
        System.out.println("Средний вес: " + avWeight / weight.length);

        //количество людей у которых вес находится в пределах от 60 до 80 кг включительно

        System.out.println("Всего людей: " + weight.length);
        System.out.println("Количество до 60: " + number2);
        System.out.println("Количество от 60 до 80: " + number);
        System.out.println("Количество от 81 до 100: " + number3);


    }
}
