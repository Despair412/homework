//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1: Объявление переменных различных типов данных
        int intVar = 100;
        byte byteVar = 120;
        short shortVar = 30000;
        long longVar = 123456789L;
        float floatVar = 3.14f;
        double doubleVar = 2.71828;

        System.out.println("Задача 1:");
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);

        // Задача 2: Инициализация переменных с данными значениями
        double val1 = 27.12;
        long val2 = 987678965549L;
        float val3 = 2.786f;
        int val4 = 569;
        short val5 = -159;
        int val6 = 27897;
        byte val7 = 67;

        System.out.println("\nЗадача 2:");
        System.out.println("Значение переменной val1 равно " + val1);
        System.out.println("Значение переменной val2 равно " + val2);
        System.out.println("Значение переменной val3 равно " + val3);
        System.out.println("Значение переменной val4 равно " + val4);
        System.out.println("Значение переменной val5 равно " + val5);
        System.out.println("Значение переменной val6 равно " + val6);
        System.out.println("Значение переменной val7 равно " + val7);

        // Задача 3: Расчёт количества листов бумаги на каждого ученика
        int lyudmilaStudents = 23;
        int annaStudents = 27;
        int ekaterinaStudents = 30;
        int totalPaperSheets = 480;

        int totalStudents = lyudmilaStudents + annaStudents + ekaterinaStudents;
        int paperPerStudent = totalPaperSheets / totalStudents;

        System.out.println("\nЗадача 3:");
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Задача 4: Расчёт производительности машины по изготовлению бутылок
        int bottlesPer2Min = 16;
        int bottlesPer1Min = bottlesPer2Min / 2;

        int bottlesIn20Min = bottlesPer1Min * 20;
        int bottlesIn1Day = bottlesPer1Min * 60 * 24;
        int bottlesIn3Days = bottlesIn1Day * 3;
        int bottlesIn1Month = bottlesIn1Day * 30;

        System.out.println("\nЗадача 4:");
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " бутылок");
        System.out.println("За сутки машина произвела " + bottlesIn1Day + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " бутылок");

        // Задача 5: Расчёт количества банок краски для ремонта школы
        int totalPaintCans = 120;
        int whitePaintCansPerClass = 2;
        int brownPaintCansPerClass = 4;

        int totalClasses = totalPaintCans / (whitePaintCansPerClass + brownPaintCansPerClass);
        int totalWhitePaintCans = totalClasses * whitePaintCansPerClass;
        int totalBrownPaintCans = totalClasses * brownPaintCansPerClass;

        System.out.println("\nЗадача 5:");
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaintCans + " банок белой краски и " + totalBrownPaintCans + " банок коричневой краски");

        // Задача 6: Расчёт веса спортивного завтрака
        int bananasCount = 5;
        int bananaWeight = 80; // в граммах
        int milkVolume = 200; // в миллилитрах
        int milkWeightPer100ml = 105; // в граммах
        int iceCreamWeight = 200; // два брикета по 100 грамм
        int eggsCount = 4;
        int eggWeight = 70; // в граммах

        int totalWeightGrams = (bananasCount * bananaWeight) +
                (milkVolume / 100 * milkWeightPer100ml) +
                iceCreamWeight +
                (eggsCount * eggWeight);

        double totalWeightKg = totalWeightGrams / 1000.0;

        System.out.println("\nЗадача 6:");
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGrams);
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKg);

        // Задача 7: Расчёт дней для похудения
        int weightLossGoal = 7; // в килограммах
        int weightLossPerDayMin = 250; // граммов
        int weightLossPerDayMax = 500; // граммов

        int daysToLoseMin = (weightLossGoal * 1000) / weightLossPerDayMax;
        int daysToLoseMax = (weightLossGoal * 1000) / weightLossPerDayMin;
        int averageDays = (daysToLoseMin + daysToLoseMax) / 2;

        System.out.println("\nЗадача 7:");
        System.out.println("Если спортсмен теряет по 250 грамм в день, то похудение займет " + daysToLoseMin + " дней");
        System.out.println("Если спортсмен теряет по 500 грамм в день, то похудение займет " + daysToLoseMax + " дней");
        System.out.println("Среднее количество дней для похудения: " + averageDays);

        // Задача 8: Расчёт повышения зарплаты для сотрудников
        double masyaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double increaseRate = 0.10;
        double masyaNewSalary = masyaSalary * (1 + increaseRate);
        double denisNewSalary = denisSalary * (1 + increaseRate);
        double kristinaNewSalary = kristinaSalary * (1 + increaseRate);

        double masyaIncomeBefore = masyaSalary * 12;
        double denisIncomeBefore = denisSalary * 12;
        double kristinaIncomeBefore = kristinaSalary * 12;

        double masyaIncomeAfter = masyaNewSalary * 12;
        double denisIncomeAfter = denisNewSalary * 12;
        double kristinaIncomeAfter = kristinaNewSalary * 12;

        double masyaIncomeDifference = masyaIncomeAfter - masyaIncomeBefore;
        double denisIncomeDifference = denisIncomeAfter - denisIncomeBefore;
        double kristinaIncomeDifference = kristinaIncomeAfter - kristinaIncomeBefore;

        System.out.println("\nЗадача 8:");
        System.out.println("Маша теперь получает " + masyaNewSalary + " рублей. Годовой доход вырос на " + masyaIncomeDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncomeDifference + " рублей.");
    }
}