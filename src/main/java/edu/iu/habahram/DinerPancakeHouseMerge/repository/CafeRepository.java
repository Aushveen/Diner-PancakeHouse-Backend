package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.CafeMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class CafeRepository {
    public List<MenuItem> getTheMenu() {
        CafeMenu cafeMenu = new CafeMenu();
        List<MenuItem> menuItems = new ArrayList<>();
        Iterator<MenuItem> iterator = cafeMenu.createIterator();
        while (iterator.hasNext()) {
            menuItems.add(iterator.next());
        }
        return menuItems;
    }
}