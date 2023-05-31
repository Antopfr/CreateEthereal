package net.antopfr.create_ethereal;

import static com.simibubi.create.AllTags.AllItemTags.CREATE_INGOTS;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;

public class AllItems {
    private static final CreateRegistrate REGISTRATE = CreateEthereal.registrate()
            .creativeModeTab(() -> CreateEthereal.itemGroup);

    public static final ItemEntry<Item> MITHRIL_INGOT = taggedIngredient("mithril_ingot", CREATE_INGOTS.tag);

    public static void register(IEventBus eventBus) {

    }

    @SafeVarargs
    private static ItemEntry<Item> taggedIngredient(String name, TagKey<Item>... tags) {
        return REGISTRATE.item(name, Item::new)
                .tag(tags)
                .register();
    }
}
