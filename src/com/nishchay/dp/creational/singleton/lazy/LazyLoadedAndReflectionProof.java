package com.nishchay.dp.creational.singleton.lazy;


// The ONLY singleton pattern that is both lazy-loaded AND 100% reflection-proof is the hybrid pattern using Bill-Pugh initialization WITH an Enum gatekeeper.
public class LazyLoadedAndReflectionProof {

    private LazyLoadedAndReflectionProof() {
        // Optional: extra guard
        if (EnumHolder.INSTANCE_INITIALIZER != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    // Lazily initializes Singleton when getInstance() is called
    private static class Holder {
        private static final LazyLoadedAndReflectionProof INSTANCE = new LazyLoadedAndReflectionProof();
    }

    // Enum protects against reflection (cannot instantiate enum reflectively)
    private enum EnumHolder {
        INSTANCE_INITIALIZER;

        private final LazyLoadedAndReflectionProof instance;

        EnumHolder() {
            instance = Holder.INSTANCE;
        }
    }

    public static LazyLoadedAndReflectionProof getInstance() {
        return EnumHolder.INSTANCE_INITIALIZER.instance;
    }
}