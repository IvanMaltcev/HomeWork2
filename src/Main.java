public class Main {
    public static void main(String[] args) {

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        var coefficient = 4;
        dog = dog + coefficient;
        cat = cat + coefficient;
        paper = paper + coefficient;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общая масса бойцов равна "
                + (firstBoxerWeight + secondBoxerWeight) + " кг.");
        System.out.println("Разница между массами бойцов равна "
                + (secondBoxerWeight - firstBoxerWeight) + " кг.");

        //Задача 7
        var boxerWeightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница весов бойцов равна " + boxerWeightDifference + " кг.");

        //Задача 8
        var totalHours = 640;
        var hoursPerWorker = 8;
        var amountWorkers = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + amountWorkers + " человек.");

        var newAmountWorkers = amountWorkers + 94;
        var newTotalHours = newAmountWorkers * hoursPerWorker;
        System.out.println("Если в компании работает " + newAmountWorkers
                + " человек, то всего " + newTotalHours
                + " часов работы может быть поделено между сотрудниками.");

        // Задача 6. Повышенная сложность.
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d * e));
        System.out.println(-1*result);

        // Задача 7. Повышенная сложность.
        int f = 5;
        int g = 7;

        f = g * f / f;
        g = (f * f - (f + f)) / f;
        System.out.println("f = " + f + " g = " + g);

        // Задача 8. Повышенная сложность.
        int h = 123;

        int k = (h / 10) % 10;
        System.out.println("k = " + k);





    }
}