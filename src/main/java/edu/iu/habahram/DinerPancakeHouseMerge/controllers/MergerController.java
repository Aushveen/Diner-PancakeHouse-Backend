package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {
    private final DinerRepository dinerRepository;
    private final PancakeHouseRepository pancakeHouseRepository;

    public MergerController(DinerRepository dinerRepository, PancakeHouseRepository pancakeHouseRepository) {
        this.dinerRepository = dinerRepository;
        this.pancakeHouseRepository = pancakeHouseRepository;
    }

    @GetMapping
    public List<MenuItem> getMergedMenu() {
        List<MenuItem> mergedMenu = new ArrayList<>();

        // Get menu items from DinerRepository
        MenuItem[] dinerMenuItems = dinerRepository.getTheMenu();
        mergedMenu.addAll(Arrays.asList(dinerMenuItems));

        // Get menu items from PancakeHouseRepository
        List<MenuItem> pancakeHouseMenuItems = pancakeHouseRepository.getTheMenu();
        mergedMenu.addAll(pancakeHouseMenuItems);

        // Sort the merged menu by name
        mergedMenu.sort(Comparator.comparing(MenuItem::getName));

        return mergedMenu;
    }
}