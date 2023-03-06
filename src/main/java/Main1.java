import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Double();
    }

    public static void Double() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Операции над double/flat");
            System.out.println("1.Сравить");
            System.out.println("2.Округлить");
            System.out.println("3.Отбросить дробную часть");
            String input = scanner.nextLine();
            if("end".equals(input)){
                break;
            }else{

                int operation=Integer.parseInt(input);
                switch (operation){
                    case 1:
                        System.out.println("Введите первое число");
                        String firtsOperation = scanner.nextLine();
                        double first=Double.parseDouble(firtsOperation);
                        System.out.println("Ввведит второе число");
                        String firstoperation1=scanner.nextLine();
                        float second=Float.parseFloat(firstoperation1);
                        if(first==second){
                            System.out.println("Числа равны");
                            return;
                        }else if(first-second>0){
                            System.out.println("Числа не равны,первое больше");
                        }else {
                            System.out.println("числа не равны, второе больше");
                        }
                        break;
                    case 2:
                        System.out.println("введите число");
                        String secondoperation=scanner.nextLine();
                        double second1=Double.parseDouble(secondoperation);
                        System.out.println(Math.round(second1));
                        break;
                    case 3:
                        System.out.println("введите число");
                        String thirdoperation=scanner.nextLine();
                        float third=Float.parseFloat(thirdoperation);
                        long value = (long) third;
                        System.out.println(value);
                        break;
                    default:
                        System.out.println("такой операции нет");
                }
            }
        }
    }
}

