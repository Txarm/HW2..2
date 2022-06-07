public interface Have4Wheels {
    default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
