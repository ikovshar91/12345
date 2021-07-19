package com.company.error;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    Inning() throws BaseballException {}
    void event () throws BaseballException {
        // На самом деле ничего не выбрасывает
    }
    abstract void atBat() throws Strike, Foul;
    void walk() {} // Ничего не выбрасывает
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning
        implements Storm {
    // можно добавить новое исключение для
    // конструкторов, но вы должны работать
    // с базовым исключеним конструктора:
    StormyInning() throws RainedOut,
            BaseballException {}
    StormyInning(String s) throws Foul,
            BaseballException {}
    // Обычный метод должен соответствовать базовому классу:
//! void walk() throws PopFoul {} //Ошибка компиляции
    // Интерфейс НЕ МОДЕТ добавлять исключения к существующим
    // методам базового класса:
//! public void event() throws RainedOut {}
    // Если метод еще не существует в базовом классе
    // исключение допустимо:
    public void rainHard() throws RainedOut {}
    // Вы можете решить не выбрасывать исключений вообще,
    // даже если версия базового класса делает это:
    public void event() {}
    // Перегруженные методы могут выбрасывать
    // унаследованные исключения:
    void atBat() throws PopFoul {}
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch(PopFoul e) {
            System.err.println("Pop foul");
        } catch(RainedOut e) {
            System.err.println("Rained out");
        } catch(BaseballException e) {
            System.err.println("Generic error");
        }
        // Strike не выбрасывается в унаследованной версии.
        try {
            // Что случится при обратном приведении?
            Inning i = new StormyInning();
            i.atBat();
            // Вы должны ловить исключения от метода
            // версии базового класса:
        } catch(Strike e) {
            System.err.println("Strike");
        } catch(Foul e) {
            System.err.println("Foul");
        } catch(RainedOut e) {
            System.err.println("Rained out");
        } catch(BaseballException e) {
            System.err.println(
                    "Generic baseball exception");
        }
    }
}