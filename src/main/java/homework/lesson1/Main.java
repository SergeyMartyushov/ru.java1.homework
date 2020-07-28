package homework.lesson1;

public class Main {

    public static void main(String[] args) {

        System.out.println(result(2,3,4,2));
        System.out.println(aBoolean(2,6));
        System.out.println(compar(-5));
        System.out.println(hello("Bob"));
        System.out.println(leapYear(300));
    }

    /*1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат, с плавающей точкой
    где a, b, c, d – целочисленные входные параметры этого метода;*/
    public static float result(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    /*2. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;*/
    public static boolean aBoolean (int a, int b){
        if((a+b)>=10 && (a+b)<=20){
            return true;
        }else return false;
    }

    /*3. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.*/
    public static String compar(int a){
        if(a>=0){
            return "Число положительное";
        }else return "Число отрицательное";
    }

    /*4. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;*/
    public static String hello (String name){
        return ("Hello, " + name +"!");
    }

    /*5. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static String leapYear(int a){
        if(a%4 == 0 && a%100 != 0 || a%400 ==0){
            return("Год високосный");
        }else return("Год не високосный");
    }

}


