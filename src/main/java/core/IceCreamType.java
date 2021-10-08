package core;

import core.model.ChocolateIceCream;
import core.model.CoconutIceCream;
import core.model.VanillaIceCream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

@RequiredArgsConstructor
@Getter
public enum IceCreamType {
    Vanilla(VanillaIceCream::new),
    Chocolate(ChocolateIceCream::new),
    Coconut(CoconutIceCream::new);

    private final Supplier<IceCream> constructor;
}
