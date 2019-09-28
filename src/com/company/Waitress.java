package com.company;

import com.company.menu.Menu;
import com.company.menu.MenuItem;

import java.util.Iterator;
import java.util.List;

class Waitress {
    private List<Menu> menus;

    Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    void printMenu() {
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        System.out.print("\n");
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
