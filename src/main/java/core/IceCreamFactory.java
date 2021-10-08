package core;

public class IceCreamFactory {
    public static IceCream getIceCream(IceCreamType type) {
        return type.getConstructor().get();
    }
}
