package com.company;


import org.omg.CORBA.Environment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;


public class Main {


    //Построить три класса (интерфейс и 2 потомка), описывающих некоторых работников с почасовой оплатой (один из
    //потомков) и фиксированной оплатой (второй потомок). Описать в интерфейсе абстрактный метод для расчета
    //среднемесячной заработной платы. Для «повременщиков» формула для расчета такова : «среднемесячная
    //заработная плата = 20.8 * 8 * почасовую ставку», для работников с фиксированной оплатой «среднемесячная заработная
    //плата = фиксированной месячной оплате».
    //
    //  a) Упорядочить всю последовательность работников по убыванию среднемесячного
    //заработка. Вывести идентификатор работника, имя и среднемесячный заработок для
    //всех элементов списка.
    //  b) Вывести первые 5 имен работников из полученного в пункте а) списка.
    //  c) Вывести последние 3 идентификатора работников из полученного в пункте а) списка.




    public static void main(String[] args) {



        ArrayList<Worker> workers = new ArrayList();
        workers.add(new HourPay(1, "Boss", 150));
        workers.add(new FixPay(2, "Vasya", 20000));
        workers.add(new HourPay(3, "Petia", 5));
        workers.add(new FixPay(4, "Lena", 4000));
        workers.add(new HourPay(5, "Natasha", 7));
        workers.add(new FixPay(6, "Ya", 8000));
        workers.add(new HourPay(7, "Kim", 8));


        for (com.company.Worker worker : workers) {

            System.out.println(worker.toString());
        }

//        Collections.sort(workers, new Comparator<Worker>() {
//            @Override
//            public int compare(Worker o1, Worker o2) {
//                return o1.toString().compareTo(o2.toString());
//
//            }
//
//        });

        // Не понял как работать с компаратором по этому остался только такой вариант

        for (int j = 0; j < workers.size() - 1; j++) {
            for (int i = 0; i < workers.size() - 1; i++) {
                if (workers.get(i).getAverage() < workers.get(i + 1).getAverage()) {
                    workers.add(0, workers.get(i + 1));
                    workers.remove(i + 2);
                }
            }
        }

        System.out.println("--------------------------");
        for (com.company.Worker worker : workers) {

            System.out.println(worker.toString());
        }
    }
}

