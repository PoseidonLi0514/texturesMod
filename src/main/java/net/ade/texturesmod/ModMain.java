package net.ade.texturesmod;

import net.ade.texturesmod.common.regisrtyitem.ItemInit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModMain.MODID)
public class ModMain {
    public static final String MODID = "texturesmod";
    public ModMain()
    {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
