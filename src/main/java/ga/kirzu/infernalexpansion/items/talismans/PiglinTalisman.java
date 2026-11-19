package ga.kirzu.infernalexpansion.items.talismans;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.magical.talismans.Talisman;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.ParametersAreNonnullByDefault;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.entity.PigZombieAngerEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.Nullable;

/**
 * Protects players carrying a normal or Ender-infused Piglin Talisman.
 * No reflective access to Slimefun's private talisman methods is required.
 */
public class PiglinTalisman extends Talisman {

    public PiglinTalisman(
            SlimefunItemStack item,
            ItemStack[] recipe,
            boolean consumable,
            boolean cancelEvent,
            @Nullable String messageSuffix,
            PotionEffect... effects) {
        super(item, recipe, consumable, cancelEvent, messageSuffix, effects);
    }

    @ParametersAreNonnullByDefault
    public static boolean trigger(Event event, SlimefunItem item) {
        if (!(event instanceof PigZombieAngerEvent angerEvent)
                || !(angerEvent.getTarget() instanceof Player player)) {
            return false;
        }

        return trigger(player, item);
    }

    @ParametersAreNonnullByDefault
    public static boolean trigger(Player player, SlimefunItem item) {
        if (!(item instanceof Talisman talisman)) {
            return false;
        }

        if (ThreadLocalRandom.current().nextInt(100) >= talisman.getChance()) {
            return false;
        }

        // Prefer the normal talisman in the player's inventory.
        if (SlimefunUtils.containsSimilarItem(player.getInventory(), talisman.getItem(), true)) {
            return talisman.canUse(player, true);
        }

        // Slimefun registers the Ender-infused variant with the ENDER_ prefix.
        SlimefunItem enderVariant = SlimefunItem.getById("ENDER_" + talisman.getId());
        return enderVariant != null
                && SlimefunUtils.containsSimilarItem(player.getEnderChest(), enderVariant.getItem(), true)
                && talisman.canUse(player, true);
    }
}
