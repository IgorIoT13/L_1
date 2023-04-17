package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class BotanicGarden extends Garden {
    /**
     * Кіл. теплиць
     */
    private int countGreenhouses;
    /**
     * Конструктор.
     * @param area площа
     * @param consCountGreenhouses теплиць
     * @param numberOfFlowers квіточки
     */
    public BotanicGarden(final int area,
                         final int numberOfFlowers,
                         final int consCountGreenhouses) {
        super(area, numberOfFlowers);
        this.countGreenhouses = consCountGreenhouses;
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
        return countGreenhouses;
    }

    /**
     * ТоString.
     * @return String
     */
    @Override
    public String myToString() {
        return super.myToString() + " countGreenhouses " + countGreenhouses;
    }
}
