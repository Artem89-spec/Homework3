public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte myByteVariable = 10;
        short myShortVariable = 1000;
        int myIntVariable = 100000;
        long myLongVariable = 10000000000L;
        float myFloatVariable = 3.14f;
        double myDoubleVariable = 2.718;
        System.out.println("Значение переменной myByteVariable с типом byte равно: " + myByteVariable);
        System.out.println("Значение переменной myShortVariable с типом short равно: " + myShortVariable);
        System.out.println("Значение переменной myIntVariable с типом int равно: " + myIntVariable);
        System.out.println("Значение переменной myLongVariable с типом long равно: " + myLongVariable);
        System.out.println("Значение переменной myFloatVariable с типом float равно: " + myFloatVariable);
        System.out.println("Значение переменной myDoubleVariable с типом double равно: " + myDoubleVariable);
        System.out.println();

        //Задача 2
        byte myByteVariable2 = 67;
        short myShortVariable2 = 27897;
        short myShortVariable3 = - 159;
        short myShortVariable4 = 569;
        int myIntVariable2 = 100000;
        long myLongVariable2 = 987678965549L;
        float myFloatVariable2 = 27.12f;
        double myDoubleVariable2 = 2.786;

        //Задача 3
        int numberStudentsLudmila = 23;
        int numberStudentsAnna = 27;
        int numberStudentsEkaterina = 30;

        int totalStudents = numberStudentsLudmila + numberStudentsAnna + numberStudentsEkaterina;
        int totalSheets = 480;

        int sheetsPerStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
        System.out.println();

        // Задача 4
        int bottlesPer2Minutes = 16;
        int minutesInHours = 60;
        int hoursInDay = 24;
        int dayInMonth = 30;

        int bottlesPerMinute = bottlesPer2Minutes / 2;
        int  bottlesIn20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes +  " штук бутылок.");

        int bottlesInDay = bottlesPerMinute * minutesInHours * hoursInDay;
        System.out.println("За сутки машина произвела " + bottlesInDay +  " штук бутылок.");

        int bottlesIn3Day = bottlesInDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Day +  " штук бутылок.");

        int bottlesInMonth = bottlesInDay * dayInMonth;
        System.out.println("За месяц машина произвела " + bottlesInMonth +  " штук бутылок.");
        System.out.println();

        // Задача 5
        int totalCans = 120; // Общее количество банок краски
        int perClassWhiteCans = 2; // Количество белой краски на класс
        int perClassBrownCans = 4; // Количество коричневой краски на класс

        // Общее количество банок, необходимых для одного класса
        int perClassCans = perClassWhiteCans + perClassBrownCans;

        // Общее количество классов
        int totalClasses = totalCans / perClassCans;

        // Общее количество банок белой и коричневой краски
        int totalWhiteCans = perClassWhiteCans * totalClasses;
        int totalBrownCans = perClassBrownCans * totalClasses;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans  + " банок коричневой краски.");
        System.out.println();

        //Задача 6
        //Вес каждого ингредиента в граммах
        int weight1Banana = 80;
        int weight100Milk = 105;
        int weightIceCream = 100;
        int weightEgg = 70;

        //Количество каждого ингредиента
        int numberOfBananas = 5;
        int volumeOfMilkInMl = 200;
        int numberOfIceCream = 2;
        int numberOfEggs = 4;

        //Вес коктейля в граммах
        int weightGrCocktail = (weight1Banana * numberOfBananas) +
                               (weight100Milk * volumeOfMilkInMl / 100) +
                               (weightIceCream * numberOfIceCream) +
                               (weightEgg * numberOfEggs);

        //Вес коктейля в килограммах
        double weight1KgInGrammes = 1000;
        double weightKgCocktail = weightGrCocktail / weight1KgInGrammes;

        System.out.println(weightGrCocktail + " грамм или " + weightKgCocktail + " кг.");
        System.out.println();

        //Задача 7
        int inDay500Gr = 500;
        int inDay250Gr = 250;
        int targetIndicator = 7;
        int weight1KgInGrammes2 = 1000;

        int numberOfDaysAt500 = targetIndicator * weight1KgInGrammes2 / inDay500Gr;
        System.out.println("Если спортсмен будет терять 500 грамм в день, то ему понадобится " +
                           numberOfDaysAt500 + " дней для достижения результата в 7 кг.");

        int numberOfDaysAt250 = targetIndicator * weight1KgInGrammes2 / inDay250Gr;
        System.out.println("Если спортсмен будет терять 250 грамм в день, то ему понадобится " +
                           numberOfDaysAt250 + " дней для достижения результата в 7 кг.");
        System.out.println();

        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double increasePerYear = 10; // увеличение в год в %
        double increaseRatio = increasePerYear / 100; // коэффициент 0,1
        int monthOfYear = 12;

        double newMashaSalary = mashaSalary * increaseRatio + mashaSalary;
        double incomeDifference1 = (newMashaSalary * monthOfYear) - (mashaSalary * monthOfYear);
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " +  incomeDifference1 + " рублей.");

        double newDenisSalary = denisSalary * increaseRatio + denisSalary;
        double incomeDifference2 = (newDenisSalary * monthOfYear) - (denisSalary * monthOfYear);
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " +  incomeDifference2 + " рублей.");

        double newKristinaSalary = kristinaSalary * increaseRatio + kristinaSalary;
        double incomeDifference3 = (newKristinaSalary * monthOfYear) - (kristinaSalary * monthOfYear);
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " +  incomeDifference3 + " рублей.");
    }
}