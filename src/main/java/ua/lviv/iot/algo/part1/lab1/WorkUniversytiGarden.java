package ua.lviv.iot.algo.part1.lab1;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorkUniversytiGarden extends Garden {
    /**
     * Sculptures in garden.
     */
    private int countSculptures;

    /**
     * Constructor.
     * @param area plocha
     * @param numberOfFlowers kvitochki
     * @param constcountSculptures Sculptures
     */
    public WorkUniversytiGarden(
            final int area,
             final int numberOfFlowers,
             final int constcountSculptures) {
        super(area, numberOfFlowers);
        this.countSculptures = constcountSculptures;
    }

    /**
     * return int.
     * @return Sculptures
     */
    @Override
    public final int getInt() {
        return countSculptures;
    }
    /**
     * Місце для овочів.
     * @return можна їх там садити чи ні
     */
    @Override
    public final boolean hasOrchard() {
        return false;
    }
    /**
     * Фруктові дерева.
     * @return Є вони там чи ні
     */
    @Override
    public final boolean hasVegetableGarden() {
        return false;
    }
    /**
     * ТоString.
     * @return String
     */
    @Override
    public final String myToString() {
        return super.myToString() + " countSculptures " + countSculptures;
    }


}
