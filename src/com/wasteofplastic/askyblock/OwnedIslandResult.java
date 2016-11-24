package com.wasteofplastic.askyblock;

import java.lang.ref.WeakReference;

public class OwnedIslandResult
{
    private boolean hasNether;
    private boolean hasRegular;
    private WeakReference<Island> netherIsland;
    private WeakReference<Island> regularIsland;

    public OwnedIslandResult(boolean hasNether, boolean hasRegular)
    {
        this.setHasNether(hasNether);
        this.setHasRegular(hasRegular);
    }

    public void setNetherIsland(Island island)
    {
        netherIsland = new WeakReference(island);
    }

    public void setRegularIsland(Island island)
    {
        regularIsland = new WeakReference(island);
    }

    public Island getNetherIsland()
    {
        return netherIsland.get();
    }

    public Island getRegularIsland()
    {
        return regularIsland.get();
    }

    public boolean hasAnyIslands()
    {
        return hasNether || hasRegular;
    }

    public boolean hasNether()
    {
        return hasNether;
    }

    public void setHasNether(boolean hasNether)
    {
        this.hasNether = hasNether;
    }

    public boolean hasRegular()
    {
        return hasRegular;
    }

    public void setHasRegular(boolean hasRegular)
    {
        this.hasRegular = hasRegular;
    }
}
