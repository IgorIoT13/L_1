package ua.lviv.iot.algo.part1.lab1;

public class Clumba extends Garden {

    /**
     * Constractor.
     * @param area plocha
     * @param numberOfFlowers kvitki
     */
    public Clumba(final int area,
                  final int numberOfFlowers) {
        super("Clumba",area, numberOfFlowers);
    }

    /**
     * Місце для овочів.
     * @return можна їх там садити чи ні
     */
    @Override
    public boolean hasOrchard() {
        return false;
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
        return super.getNumberOfFlowers();
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
