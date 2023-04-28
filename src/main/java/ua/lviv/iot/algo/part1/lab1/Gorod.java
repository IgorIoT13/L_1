package ua.lviv.iot.algo.part1.lab1;

public class Gorod extends Garden {

    /**
     * Constractor.
     * @param area plocha
     * @param numberOfFlowers kvitki
     */
    public Gorod(final int area,
                 final int numberOfFlowers) {
        super("Gorod",area, numberOfFlowers);
    }
    /**
     * Місце для овочів.
     * @return можна їх там садити чи ні
     */
    @Override
    public boolean hasOrchard() {
        return true;
    }

    /**
     * Фруктові дерева.
     * @return Є вони там чи ні
     */
    @Override
    public boolean hasVegetableGarden() {
        return false;
    }
    /**
     * Повертає теплиці.
     * @return повертає теплиці
     */
    @Override
    public int getInt() {
        return super.getArea();
    }

    /**
     * ТоString.
     * @return String
     */
    @Override
    public String myToString() {
        return super.myToString();
    }
}
