package com.company;

import com.company.menu.DinerMenu;
import com.company.menu.Menu;
import com.company.menu.PancakeHouseMenu;

import java.util.ArrayList;
import java.util.List;

public class MainTextDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        List<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);

        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
