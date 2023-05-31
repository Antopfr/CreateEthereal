package net.antopfr.create_ethereal;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateEthereal.MOD_ID)
public class CreateEthereal {
    public static final String MOD_ID = "create_ethereal";
    public static final String NAME = "Create Ethereal";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateEthereal.MOD_ID);

    public static final CreativeModeTab itemGroup = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(net.antopfr.create_ethereal.AllBlocks.MITHRIL_BLOCK.get());
        }
    };

    public CreateEthereal()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        /*
         For adding simple kinetic blocks this is all you need but for fluids etc.
         see the Create GitHub repo -
         https://github.com/Creators-of-Create/Create/tree/mc1.18/dev/src/main/java/com/simibubi/create
         */

        AllBlocks.register();
        AllItems.register(eventBus);
        AllTileEntities.register();
    }

    private void setup(final FMLCommonSetupEvent event) {}

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}
