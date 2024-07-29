import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        greatest = (first > second) ? first : second;
        greatest = (greatest > third) ? greatest : third;

        smallest = (first < second) ? first : second;
        smallest = (smallest < third) ? smallest : third;

        average = ((greatest == first) && (smallest == second) || (greatest == second && smallest == first)) ? third : (((greatest == third) && (smallest == second) || (greatest == second && smallest == third)) ? first : (((greatest == third) && (smallest == first) || (greatest == first && smallest == third)) ? second : first));


        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}
