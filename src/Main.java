
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte a = 5;
        short b = 900;
        int m = 100000;
        long c = 36849683279123L;
        float f = 15.7f;
        double s = 15.0000000009;
        System.out.println("значение переменной " + a + " с типом byte равно " + a);
        System.out.println("значение переменной " + b + " с типом short равно " + b);
        System.out.println("значение переменной " + m + " с типом int равно " + m);
        System.out.println("значение переменной " + c + " с типом long равно " + c);
        System.out.println("значение переменной " + f + " с типом float равно " + f);
        System.out.println("значение переменной " + s + " с типом double равно " + s);
        // задание 1 окончено

        byte a1 = 67;
        System.out.println(a1);
        short b1 = -159;
        System.out.println(b1);
        short c1 = 569;
        System.out.println(c1);
        int v1 = 27897;
        System.out.println(v1);
        long m1 = 987678965549L;
        System.out.println(m1);
        float k1 = 27.12f;
        System.out.println(k1);
        double h1 = 2.786;
        System.out.println(h1);
        // задание 2 окончена


        byte teacherLuda = 23;
        byte teacherAnna = 27;
        byte teacherKatya = 30;
        short paper = 480;
        int totalStudents = teacherLuda + teacherAnna + teacherKatya;
        int paperStudents = paper / totalStudents;
        System.out.println("На каждго ученика расчитано " + paperStudents + " листов бумаги");
        // 3 задача завершина

        int bottleMinute = 16 / 2;
        int bottles20Minute = 20 * bottleMinute;
        int minutePerDay = 24 * 60;
        int bottlesPerDay = minutePerDay * bottleMinute;
        int bottlesPer3Day = 3 * bottlesPerDay;
        int bottlesPerMonth = 31 * bottlesPerDay;

        System.out.println("за 20 минут машина произвела " + bottles20Minute + " штук бутылок");
        System.out.println("за день машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("за 3 дня машина произвела " + bottlesPer3Day + " штук бутылок");
        System.out.println("за месяц машина произвела " + bottlesPerMonth + " штук бутылок");
        //4 задание окончено


        byte paints = 120;
        byte whitePaintsRoom = 2;
        byte brownPaintsRoom = 4;
        int allRooms = paints / (whitePaintsRoom + brownPaintsRoom);
        int whitePaints = allRooms * whitePaintsRoom;
        int brownPaints = allRooms * brownPaintsRoom;
        System.out.println("в школе где " + allRooms + " классов, нужно " + whitePaints + " банок белой краски и " + brownPaints + " банок коричневой краски");
        // 5 задание окончено

        byte bananas = 5;
        byte milk = 2;
        byte icCream = 2;
        byte eggs = 4;
        byte gramBananas = 80;
        byte gramMilk = 105;
        byte gramIcCream = 100;
        byte gramEggs = 70;
        int allGrams = bananas * gramBananas;
        System.out.println(allGrams + " г");
        int allGrams2 = milk * gramMilk;
        System.out.println(allGrams2 + " г");
        int allGrams3 = icCream * gramIcCream;
        System.out.println(allGrams3 + " г");
        int allGrams4 = eggs * gramEggs;
        System.out.println(allGrams4 + " г");
        int totalWeight = allGrams + allGrams2 + allGrams3 + allGrams4;
        int totalGram = 1000;
        float weightKg = totalWeight / (float) totalGram;
        System.out.println("Общий вес спортзавтрака " + weightKg + " кг!");
        // задание 6 окончено


        byte targetKg = 7;
        short minGramDay = 250;
        short maxGramDay = 500;
        int targetGram = targetKg * 1000;
        int minimum = targetGram / minGramDay;
        int maximum = targetGram / maxGramDay;
        int daysAverage = (minimum + maximum) / 2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм - " + minimum + " дней");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм - " + maximum + " дней");
        System.out.println("если будет терять в среднем - " + daysAverage + " дней");
        // задание 7 окончено


        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;
        double coefficient = 0.1;
        int months = 12;

        double mashaPremium = masha * coefficient;
        double denisPremium = denis * coefficient;
        double kristinaPremium = kristina * coefficient;

        double mashaNew = masha + mashaPremium;
        double denisNew = denis + denisPremium;
        double kristinaNew = kristina + kristinaPremium;

        double mashaOldYear = months * masha;
        double denisOldYear = months * denis;
        double kristinaOldYear = months * kristina;

        double mashaNewYear = months * mashaNew;
        double denisNewYear = months * denisNew;
        double kristinaNewYear = months * kristinaNew;

        double mashaIncomeDifference = mashaNewYear - mashaOldYear;
        double denisIncomeDifference = denisNewYear - denisOldYear;
        double kristinaIncomeDifference = kristinaNewYear - kristinaOldYear;

        System.out.println("Маша теперь получает " + mashaNew + " Рублей. Годовой доход вырос на " + mashaIncomeDifference + " рублей");

        System.out.println("Денис теперь получает " + denisNew + " Рублей. Годовой доход вырос на " + denisIncomeDifference + " рублей");

        System.out.println("Кристина теперь получает " + kristinaNew + " Рублей. Годовой доход вырос на " + kristinaIncomeDifference + " рублей");
    }
}