package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenTest {

    @Test
    void testHasOrchard() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        assertEquals(garden.hasOrchard(), false);
    }

    @Test
    void testHasVegetableGarden() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        assertEquals(garden.hasVegetableGarden(), false);
    }

    @Test
    void testGetInt() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
    };
        assertEquals(garden.getInt(),0);
    }

    @Test
    void testGetArea() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        garden.setArea(5);
        assertEquals(garden.getArea(),5);
    }

    @Test
    void testGetNumberOfFlowers() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        garden.setNumberOfFlowers(5);
        assertEquals(garden.getNumberOfFlowers(),5);
    }

    @Test
    void testSetArea() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        garden.setArea(5);
        assertEquals(garden.getArea(),5);
    }

    @Test
    void setNumberOfFlowers() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };
        garden.setNumberOfFlowers(5);
        assertEquals(garden.getNumberOfFlowers(),5);

    }

    @Test
    void testToString() {
        Garden garden= new Garden() {
            @Override
            public boolean hasOrchard() {
                return false;
            }

            @Override
            public boolean hasVegetableGarden() {
                return false;
            }

            @Override
            public int getInt() {
                return 0;
            }
        };

        garden.setArea(5);
        garden.setNumberOfFlowers(5);

        String returner, tostr, meseg;
        returner= garden.myToString();
        tostr = "area -"+ 5 + " numberOfFlowers" + 5;
        meseg="ToString working uncorect";
        assertEquals(returner , tostr, meseg);
    }


}