package client;

import core.IceCreamFactory;
import core.IceCreamType;

public class Main {
    public static void main(String[] args) {
        var vanillaIceCream = IceCreamFactory.getIceCream(IceCreamType.Vanilla);
        var chocolateIceCream = IceCreamFactory.getIceCream(IceCreamType.Chocolate);
        var coconutIceCream = IceCreamFactory.getIceCream(IceCreamType.Coconut);

        System.out.println(vanillaIceCream.getType());
        System.out.println(chocolateIceCream.getType());
        System.out.println(coconutIceCream.getType());
    }
}
