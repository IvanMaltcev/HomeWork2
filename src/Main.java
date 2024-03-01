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

        // 1 задание
        int m = 47;
        int n = 13;
        
        int remainder = m % n;
        int result = m / n;
        System.out.println("Результат = " + result + " и " + remainder + " в остатке");

        // 2 задание
        int s = 44;
        
        int firstNumber = s / 10;
        int secondNumber = s % 10;
        int sum = firstNumber + secondNumber;
        System.out.println("Сумма цифр числа = " + sum);

        // 3 задание
        int number = 345;

        int number1 = number / 100;
        int number2 = number % 100 / 10;
        int number3 = number % 100 % 10;
        System.out.println("Сумма цифр числа = " + (number1 + number2 + number3));

        // 4 задание
        int priceFlowers = 4899;
        int pricePostcard = 157;
        int discount = 10;

        int purchasePrice = priceFlowers + pricePostcard;
        double sale = purchasePrice * discount / 100f;
        double totalPrice = purchasePrice - sale;
        System.out.println("Сумма двух покупок = " + totalPrice);
        System.out.println("Сумма скидки двух покупок = " + sale);

        // 5 задание
        int orangePrice = 73;
        int orangeDiscount = 15;
        int bananaPrice = 95;
        int orangeWeight = 10;
        int bananaWeight = 2;

        double totalPurchasePrice = (orangePrice * (100 - orangeDiscount) / 100f) * orangeWeight
                + bananaPrice * bananaWeight;
        System.out.println("Стоимость покупки = " + totalPurchasePrice);

        int champagnePrice = 2870;
        int champagneDiscount = 50;
        int breadPrice = 27;
        int champagneAmount = 7;
        int breadAmount = 1;

        double sumPurchase = (champagnePrice * (100 - champagneDiscount) / 100f) * champagneAmount
                + breadPrice * breadAmount;
        System.out.println("Стоимость покупки = " + sumPurchase);

        int mushroomsPrice = 436;
        int whiteMushroomsPrice = 578;
        int whiteMushroomsDiscount = 5;
        double mushroomsWeight = 2.5;
        double whiteMushroomsWeight = 3.75;

        double sumPrice = mushroomsPrice * mushroomsWeight
                + (whiteMushroomsPrice * (100 - whiteMushroomsDiscount) / 100f) * whiteMushroomsWeight;
        System.out.println("Стоимость покупки = " + sumPrice);

        // 6 задание
        double x = 0.40;
        double y = 0.87;

        System.out.println(11 * x + y);
        System.out.println((x + 10 * y) - 15 * (x / y));

        // Задача 6. Повышенная сложность.
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result3 = a * (b + (c - d * e));
        System.out.println(-1*result3);

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