package org.example;
//Создайте две переменные isEdekaOpen и isReweOpen, значения которых зависят от того, открыты магазины или нет.
//Реализует логический метод canBuy,  возвращающий boolean
//Значение этой переменной должно быть true, если хотя бы один магазин открыт, иначе false.
//Отобразите строку «Я могу купить еду, это ……» и значение.
public class ShoppingExample {
        public static void main(String[] args) {
            boolean isEdekaOpen = true;
            boolean isReweOpen = false;

            boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);

            String canBuyMessage = "Я могу купить еду, это " + (canBuy ? "правда" : "ложь");
            System.out.println(canBuyMessage);
        }

        public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
            return isEdekaOpen || isReweOpen;
        }
    }


