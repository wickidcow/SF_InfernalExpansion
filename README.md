# Infernal Expansion

A maintained, English-language Nether addon for [Slimefun Legacy](https://github.com/wickidcow/Slimefun-Legacy), based on [NotKirzu's original InfernalExpansion](https://github.com/NotKirzu/InfernalExpansion).

### Download and build status
- [Development JARs (GitHub Actions)](https://github.com/wickidcow/SF_InfernalExpansion/actions/workflows/build.yml)
- [Releases](https://github.com/wickidcow/SF_InfernalExpansion/releases) (published only after build verification)
- [Bug reports and requests](https://github.com/wickidcow/SF_InfernalExpansion/issues)

### Requirements (modernized development branch)
- **Java 25**
- **Paper 26.3** (compiled against the 26.3.build.249-stable API); Paper 26.2 compatibility has not been runtime-tested
- **Slimefun Legacy 4.1.81** ([official maintained fork release](https://github.com/wickidcow/Slimefun-Legacy/releases/tag/v4.1.81))

**GhuizanLib is not required** and is not declared as a dependency. The plugin declares only Slimefun as its required runtime plugin; Paper and Slimefun APIs are compile-time-provided and not bundled.

### Building from source
GitHub Actions downloads the exact Slimefun Legacy 4.1.81 release JAR, verifies its SHA-256 checksum, installs it as a local Maven compile dependency, and runs `mvn clean verify` on Java 25. A local developer can follow the same steps shown in [the build workflow](.github/workflows/build.yml).

This is not a Folia-certified addon; the original scheduling and ticking behavior requires separate region-thread auditing. Existing Slimefun item IDs and crafting recipes are retained.

### Credits
Original addon by **Kiirzu / NotKirzu**. The maintained fork preserves the original MIT license and attribution.

### Blocks:
* **Piglin Attractor:**
* - Attract nearest zombified piglins to the block
* - Consumption: 25 J/s
* - Energy storage: 2,000 J

### Talismans:
* **Piglin Talisman:**
* - Having this talisman in your inventory prevent zombified piglins from targeting you. (Also can be Ender infused)

### Runes:
* **Bed Rune:**
* - When you drop this rune above a bed in the nether increases the explosion radius.
* - Has 5 uses
* **Thermal Walk Rune:**
* - Drop this rune near dropped boots to enchant them with **Thermal Walk I**. This enchantment creates obsidian while walking over lava and causes the wearer to be fire-resistant

### Tools:
* **Portable Nether Teleporter:**
* - Teleports you to the nether from anywhere
* - Consumption: 125 J per use
* - Energy capacity: 250 J
* **Pyromaniac Blaze Rod:**
* - Ignite surrounding blocks in a radius of 5 meters
* - Consumption: 25 J per use
* - Energy capacity: 200 J
* **Fireball Launcher:**
* - Throws a fireball to the direction you are looking for.
* - Consumption: 25 J per use
* - Energy capacity: 250 J