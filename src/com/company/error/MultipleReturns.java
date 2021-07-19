package com.company.error;

import static com.company.Book.print;

public class MultipleReturns {
    public static void f(int i){
        print("Инициализация, требующая завершения");
        try {
            print("Точка 1");
            if(i == 1) return;
            print("Точка 2");
            if(i == 2) return;
            print("Точка 3");
            if(i == 3) return;
            print("Конец");
            return;
        } finally {
            print("Завершающее действие");
        }

    }

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            f(i);
        }
    }
}
