package net.Marko.modproba.item;

import net.Marko.modproba.Modproba;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import java.rmi.registry.Registry;

public class Moditem {

    private  static  Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Modproba.MOD_ID, name), item);

    }

    public static void registerModItems() {


            System.out.println("Regisering Items for Mod " + Modproba.MOD_ID);
    }
}
