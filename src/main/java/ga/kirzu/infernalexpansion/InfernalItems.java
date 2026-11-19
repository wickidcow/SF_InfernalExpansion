package ga.kirzu.infernalexpansion;

import ga.kirzu.infernalexpansion.items.runes.BedRune;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.github.thebusybiscuit.slimefun4.utils.itemstack.ColoredFireworkStar;
import org.bukkit.Color;
import org.bukkit.Material;

public class InfernalItems {

    public static final SlimefunItemStack THERMAL_WALK_RUNE =
            new SlimefunItemStack("ANCIENT_RUNE_THERMAL_WALK", new ColoredFireworkStar(Color.fromRGB(166, 27, 27), "&7Ancient Rune &8&l[&c&lThermal Walk&8&l]", "&eDrop this rune onto dropped boots", "&eto enchant them with Thermal Walk", "", "&eThis enchantment turns nearby lava into obsidian", "&eand makes the wearer immune to fire damage"));
    public static final SlimefunItemStack BED_RUNE
            = new SlimefunItemStack("ANCIENT_RUNE_BED", new ColoredFireworkStar(Color.fromRGB(255, 123, 0), "&7Ancient Rune &8&l[&6&lBed&8&l]", "&eDrop this rune onto a bed", "&eto increase its explosion radius", "", LoreBuilder.usesLeft(BedRune.USES)));

    public static final SlimefunItemStack PORTABLE_NETHER_TELEPORTER
            = new SlimefunItemStack("PORTABLE_NETHER_TELEPORTER", Material.NETHER_STAR, "&dPortable Nether Teleporter", "", "&fTeleports you to the Nether from anywhere", "", LoreBuilder.powerCharged(0, 250), "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack PYROMANIAC_BLAZE_ROD
            = new SlimefunItemStack("PYROMANIAC_BLAZE_ROD", Material.BLAZE_ROD, "&6Pyromaniac Blaze Rod", "", "&fIgnites blocks within a 5-block radius", "", LoreBuilder.powerCharged(0, 200), "", LoreBuilder.RIGHT_CLICK_TO_USE);
    public static final SlimefunItemStack FIREBALL_LAUNCHER
            = new SlimefunItemStack("FIREBALL_LAUNCHER", Material.FIRE_CHARGE, "&6Fireball Launcher", "", "&fLaunches a fireball straight ahead", "", LoreBuilder.powerCharged(0, 250), "", LoreBuilder.RIGHT_CLICK_TO_USE);

    public static final SlimefunItemStack PIGLIN_TALISMAN
            = new SlimefunItemStack("PIGLIN_TALISMAN", Material.EMERALD, "&aPiglin Talisman", "", "&fWhile this talisman is in your inventory", "&fzombified piglins will not target you");

    public static final SlimefunItemStack PIGLIN_ATTRACTOR
            = new SlimefunItemStack("PIGLIN_ATTRACTOR", Material.RESPAWN_ANCHOR, "&ePiglin Attractor", "", "&fWhile powered", "&fAttracts nearby zombified piglins", "", LoreBuilder.powerBuffer(2_000), LoreBuilder.powerPerSecond(25));

}