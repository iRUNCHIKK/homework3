public class Main {
    public static void main(String[] args) {
        //task1
        int flags = 150;
        System.out.println("Значение переменной flags с типом int равно " + flags);

        byte mice = 3;
        System.out.println("Значение переменной mice с типом byte равно " + mice);

        short cucumbers = 876;
        System.out.println("Значение переменной cucumbers с типом short равно " + cucumbers);

        long meters = 1600900000L;
        System.out.println("Значение переменной meters с типом long равно " + meters);

        float treeHeight = 14f;
        System.out.println("Значение переменной treeHeight с типом float равно " + treeHeight);

        double liters = 67.17800976;
        System.out.println("Значение переменной liters с типом double равно " + liters);

        //task2
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        int e = -159;
        System.out.println(e);
        int f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);

        //task3
        byte pupilsNumberOneClass = 23;
        byte pupilsNumberTwoClass = 27;
        byte pupilsNumberThreeClass = 30;
        short paperNumber = 480;
        int pupilsNumber = pupilsNumberOneClass + pupilsNumberTwoClass + pupilsNumberThreeClass;
        int paperForPupils = paperNumber / pupilsNumber;
        System.out.println("На каждого ученика расчитано " + paperForPupils + " листов бумаги");

        //task4
        int performanceBottleInOneMinute = 16/2;
        int performanceBottleInTwentyMinutes = performanceBottleInOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + performanceBottleInTwentyMinutes + " штук бутылок");
        int conversionToMinutesOne = 24 * 60;
        int performanceBottleInDay = performanceBottleInOneMinute * conversionToMinutesOne;
        System.out.println("За сутки машина произвела " + performanceBottleInDay + " штук бутылок");
        int conversionToMinutesTwo = conversionToMinutesOne * 3;
        int performanceBottleInThreeDays = performanceBottleInOneMinute * conversionToMinutesTwo;
        System.out.println("За 3 дня машина произвела " + performanceBottleInThreeDays + " штук бутылок");
        int conversionToMinutesThree = conversionToMinutesOne * 29;//количество минут в 29 днях(29-ср. количество дней в месяце в 2024г)
        long performanceBottlesInMonth = performanceBottleInOneMinute * conversionToMinutesThree;
        System.out.println("За месяц машина произвела " + performanceBottlesInMonth + " штук бутылок");

        //task5
        int allPaintNumber = 120;
        int paintForOneClass = 2 + 4;
        int classNumber = allPaintNumber / paintForOneClass;
        int whitePaintNumber = 2 * classNumber;
        int brownPaintNumber = 4 * classNumber;
        System.out.println("В школе, где " + classNumber + " классов, нужно " + whitePaintNumber + " банок белой краски и " + brownPaintNumber + " банок коричневой краски");

        //task6
        int bananasWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 70 * 4;
        double sportBreakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double sportBreakfastWeightInKilograms = sportBreakfastWeight / 1000;
        System.out.println("Спортзавтрак весит " + sportBreakfastWeightInKilograms + " кг");

        //task7
        int conversion = 7 * 1000;
        int dayNumberOne = conversion / 250;
        System.out.println("Если спортсмен будет терять ежедневно по 250 грамм веса, то ему понадобится " + dayNumberOne + " дней, чтобы подготовиться к соревнованиям");
        int dayNumberTwo = conversion / 500;
        System.out.println("Если спортсмен будет терять ежедневно по 500 грамм веса, то ему понадобится " + dayNumberTwo + " дней, чтобы подготовиться к соревнованиям");
        System.out.println("В среднем спортсмену понадобится " + (dayNumberOne + dayNumberTwo) / 2 + " день, чтобы подготовиться к соревнованиям");

        //task8
        int salaryInMonthMasha = 67760;
        int salaryIncreaseMasha = (salaryInMonthMasha * 10) / 100;
        int newSalaryInMonthMasha = salaryInMonthMasha + salaryIncreaseMasha;
        int firstYearIncomeMasha = salaryInMonthMasha * 12;
        int newYearIncomeMasha = newSalaryInMonthMasha * 12;
        int incomeDifferenceMasha = newYearIncomeMasha - firstYearIncomeMasha;
        System.out.println("Маша теперь получает " + newSalaryInMonthMasha + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей");

        int salaryInMonthDenis = 83690;
        int salaryIncreaseDenis = (salaryInMonthDenis * 10) / 100;
        int newSalaryInMonthDenis = salaryInMonthDenis + salaryIncreaseDenis;
        int firstYearIncomeDenis = salaryInMonthDenis * 12;
        int newYearIncomeDenis = newSalaryInMonthDenis * 12;
        int incomeDifferenceDenis = newYearIncomeDenis - firstYearIncomeDenis;
        System.out.println("Денис теперь получает " + newSalaryInMonthDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей");

        int salaryInMonthKristina = 76230;
        int salaryIncreaseKristina = (salaryInMonthKristina * 10) / 100;
        int newSalaryInMonthKristina = salaryInMonthKristina + salaryIncreaseKristina;
        int firstYearIncomeKristina = salaryInMonthKristina * 12;
        int newYearIncomeKristina = newSalaryInMonthKristina * 12;
        int incomeDifferenceKristina = newYearIncomeKristina - firstYearIncomeKristina;
        System.out.println("Кристина теперь получает " + newSalaryInMonthKristina + " рублей. Годовой доход вырос на " + incomeDifferenceKristina + " рублей");
    }
}