package singleton;

import singleton.eager.EagerRegistry;
import singleton.lazy.LazyRegistryIODH;
import singleton.lazysynch.LazyRegistryWithDCL;

public class Client {

    public static void main(String[] args) {
        LazyRegistryIODH singleton;

        singleton = LazyRegistryIODH.getInstance();
        LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
        System.out.println(singleton == singleton2);

        LazyRegistryWithDCL lazyRegistryWithDCL = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL lazyRegistryWithDCL1 = LazyRegistryWithDCL.getInstance();
        System.out.println(lazyRegistryWithDCL == lazyRegistryWithDCL1);

        EagerRegistry eagerRegistry = EagerRegistry.getInstance();
        EagerRegistry eagerRegistry1 = EagerRegistry.getInstance();
        System.out.println(eagerRegistry == eagerRegistry1);
    }
}
