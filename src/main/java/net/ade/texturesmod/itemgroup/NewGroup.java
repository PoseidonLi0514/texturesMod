package net.ade.texturesmod.itemgroup;

import net.ade.texturesmod.common.regisrtyitem.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class NewGroup extends ItemGroup {
    public NewGroup() {
        super("new_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemInit.A1.get());
    }

    public static final ItemGroup newGroup = new NewGroup();
}
