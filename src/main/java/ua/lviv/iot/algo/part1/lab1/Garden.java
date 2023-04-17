package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public abstract class Garden {
    private String name ="Garden";

    /**
     *  Plocha.
     */
    private int area;
    /**
     * cvitochki.
     */
    private int numberOfFlowers;

    /**
     * Місце для овочів.
     * @return можна їх там садити чи ні
     */
    public abstract boolean hasOrchard();

    /**
     * Фруктові дерева.
     * @return Є вони там чи ні
     */
    public abstract boolean hasVegetableGarden();

    /**
     * Return int.
     * @return int
     */
    public abstract int getInt();
    /**
     * ТоString.
     * @return String
     */

    public String getHeaders (){
     return "name" + "," + "orchard" + "," + "vegetableGarden" + "," + "area" + "," + "numberOfFlowers";
    }
    public String toCSV(){
        return name + "," + hasOrchard() + "," + hasVegetableGarden() + "," + area + "," + numberOfFlowers;
    }

    public String myToString() {
        return "area -" + area + " numberOfFlowers" + numberOfFlowers;
    }
}
