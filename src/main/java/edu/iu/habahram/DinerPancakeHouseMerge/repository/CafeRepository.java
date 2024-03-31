package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public class CafeRepository {
    public MenuItem[] getTheMenu() {
        CafeMenu cafeMenu = new CafeMenu();
        return cafeMenu.getItems().values().toArray(new MenuItem[0]);
    }

    public Iterator<MenuItem> getTheMenuIterator() {
        Menu cafeMenu = new CafeMenu();
        return cafeMenu.createIterator();
    }
}