import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        IPshnik();
    }
    public static void IPshnik(){
        int earnings = 0;
        int spendigs = 0;
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию и её номер");
            System.out.println("1.Добавить новый доход");
            System.out.println("2.Добавить новый расход");
            System.out.println("3.Выбрать систему налогооблажения");
            String input = scanner.nextLine();
            if ("end".equals(input)){
                break;
            }else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Введите сумму дохода");
                        String moneyStr = scanner.nextLine();
                        int money = Integer.parseInt(moneyStr);
                        earnings+=money;
                        break;
                    case 2:
                        System.out.println("Введите сумму расхода");
                        String moneyStr1 = scanner.nextLine();
                        int money1 = Integer.parseInt(moneyStr1);
                        spendigs+=money1;
                        break;
                    case 3:
                        if (taxEarnings(earnings)<taxEarningsMinusSpendigs(earnings, spendigs)){
                            System.out.println("рекомендуем усн 6%");
                            System.out.println("Ваш налог составит: "+taxEarnings(earnings));
                            System.out.println("Экономия:"+(taxEarningsMinusSpendigs(earnings, spendigs)-taxEarnings(earnings)));
                        }else{
                            System.out.println("рекомендуем 15%");
                            System.out.println("Ваш налог составит: "+taxEarningsMinusSpendigs(earnings, spendigs));
                            System.out.println("Экономия:"+(taxEarnings(earnings)-taxEarningsMinusSpendigs(earnings, spendigs)));
                        }
                        break;
                    default:
                        System.out.println("Такой операции не сущ");
                        break;
                }
        }
        }System.out.println("Программа завершена");
    }

    public static int taxEarningsMinusSpendigs(int earnings, int spendigs){
        int tax1=(earnings-spendigs)*15/100;
        if (tax1>=0){
            return tax1;
        }else{
            return 0;
        }

    }
    public static int taxEarnings(int earnings){
        int tax2=earnings *6/100;
        if(tax2>=0){
            return tax2;
        }else{
            return 0;
        }
    }
}
