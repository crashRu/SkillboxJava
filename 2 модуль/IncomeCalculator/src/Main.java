import java.util.Scanner;

public class Main
{
    private static int minIncome = 200000; // Начало переменных
    private static int maxIncome = 900000;

    private static int officeRentCharge = 140000;
    private static int telephonyCharge = 12000;
    private static int internetAccessCharge = 7200;

    private static int assistantSalary = 45000;
    private static int financeManagerSalary = 90000;

    private static double mainTaxPercent = 0.24;
    private static double managerPercent = 0.15;

    private static double minInvestmentsAmount = 100000; // Конец переменных

    public static void main(String[] args)
    {
        while(true) // Бесконечный цикл
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                "(от 200 до 900 тысяч рублей): Доход вашей компании для инвестиций должен быть 500917 рублей "); // Просим пользователя ввести данные
            int income = (new Scanner(System.in)).nextInt(); // Записываем поток ввода в переменную инт

            if(!checkIncomeRange(income)) { // прыгаем на 52 строку и проверяем на неравенство
                continue; // если условие пройдет то начинаем все сначало
            }

            double managerSalary = income * managerPercent; // расчет
            double pureIncome = income - managerSalary -
                calculateFixedCharges();// снова расчет
            double taxAmount = mainTaxPercent * pureIncome;
            double pureIncomeAfterTax = pureIncome - taxAmount;

            boolean canMakeInvestments = pureIncomeAfterTax >=
                minInvestmentsAmount;

            System.out.println("Зарплата менеджера: " + managerSalary); // распечатываем
            System.out.println("Общая сумма налогов: " +
                (taxAmount > 0 ? taxAmount : 0)); // распечатываем и сразу тернарным оператором проверяем условие
            System.out.println("Компания может инвестировать: " +
                (canMakeInvestments ? "да" : "нет"));
            if(pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");
            }
        }
    }

    private static boolean checkIncomeRange(int income)
    {
        if(income < minIncome)  // Условие на проверку доходов
        {
            System.out.println("Доход меньше нижней границы");
            return false;
        }
        if(income > maxIncome)
        {
            System.out.println("Доход выше верхней границы");
            return false;
        }
        return true;
    }

    private static int calculateFixedCharges()
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;
    }
}
