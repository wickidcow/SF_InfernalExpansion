<div align="center">

# SF Infernal Expansion
### Nether-themed magic, machines, and tools for Slimefun Legacy

A community-maintained continuation of **InfernalExpansion**, bringing Nether-inspired Slimefun content to modern Paper servers while preserving the original addon's identity.

[![Build & Paper Startup](https://github.com/wickidcow/SF_InfernalExpansion/actions/workflows/build.yml/badge.svg)](https://github.com/wickidcow/SF_InfernalExpansion/actions/workflows/build.yml)
[![MIT License](https://img.shields.io/github/license/wickidcow/SF_InfernalExpansion?label=License)](LICENSE)
[![Java 25](https://img.shields.io/badge/Java-25-orange)](https://adoptium.net/)
[![Paper 26.3](https://img.shields.io/badge/Paper-26.3-blue)](https://papermc.io/)
[![English](https://img.shields.io/badge/Language-English-brightgreen)](#what-is-sf-infernal-expansion)

[**Download**](https://github.com/wickidcow/SF_InfernalExpansion/releases) ·
[**Slimefun Legacy**](https://github.com/wickidcow/Slimefun-Legacy) ·
[**Builds**](https://github.com/wickidcow/SF_InfernalExpansion/actions/workflows/build.yml) ·
[**Report an Issue**](https://github.com/wickidcow/SF_InfernalExpansion/issues) ·
[**Original Project**](https://github.com/NotKirzu/InfernalExpansion)

</div>

> [!IMPORTANT]
> **SF Infernal Expansion is an unofficial, independently maintained fork of the original InfernalExpansion addon created by Kirzu (GitHub: [NotKirzu](https://github.com/NotKirzu), credited as Kiirzu in the original plugin descriptor).**
>
> This fork is maintained by **wickidcow** for [Slimefun Legacy](https://github.com/wickidcow/Slimefun-Legacy) and the wider Slimefun community. It is **not** an official release or endorsement by the original InfernalExpansion author or the original Slimefun team.
>
> **NOT AN OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**

---

## ✨ What is SF Infernal Expansion?

SF Infernal Expansion adds a selection of Nether-themed runes, magical tools, a talisman, and an energy-powered machine to the classic Slimefun experience.

| Feature | What it does |
| --- | --- |
| **Piglin Attractor** | Consumes 25 J/s to attract nearby zombified piglins in the Nether; stores up to 2,000 J. |
| **Piglin Talisman** | Helps prevent zombified piglins from targeting the player. Includes an Ender-infused variant. |
| **Bed Rune** | Increases the explosion radius of a bed used in the Nether; up to five uses per rune. |
| **Thermal Walk Rune** | Applies Thermal Walk I to dropped boots, temporarily forming obsidian over lava and giving fire resistance. |
| **Portable Nether Teleporter** | Teleports the player to the configured Nether world; uses 125 J per activation with a 250 J capacity. |
| **Pyromaniac Blaze Rod** | Ignites nearby blocks in a five-block radius; uses 25 J with a 200 J capacity. |
| **Fireball Launcher** | Fires a fireball in the direction the player is looking; uses 50 J with a 250 J capacity. |

Existing Slimefun item IDs and crafting recipes are preserved from the original addon wherever possible, so servers can upgrade without intentionally replacing their Infernal Expansion items.

---

## 📦 Downloads & requirements

**Latest published test release:** [SF Infernal Expansion v1.1.0-beta.1](https://github.com/wickidcow/SF_InfernalExpansion/releases/tag/v1.1.0-beta.1).

| Requirement | Verified or documented target |
| --- | --- |
| **Minecraft server** | Paper 26.3; startup smoke-tested on Paper 26.3 build 255 |
| **Java** | Java 25 |
| **Slimefun** | [Slimefun Legacy 4.1.81](https://github.com/wickidcow/Slimefun-Legacy/releases/tag/v4.1.81) |
| **GhuizanLib / GuizhanLibPlugin** | **Not required** by this addon |
| **Paper 26.2 / Purpur / Folia** | Not yet separately runtime-certified |

The beta has passed compilation and a real Paper/Slimefun Legacy server startup test. **A successful startup does not guarantee that every gameplay feature is fully tested.** Test the addon in a backed-up server environment before production deployment.

[Download the standalone beta JAR](https://github.com/wickidcow/SF_InfernalExpansion/releases/download/v1.1.0-beta.1/SF_InfernalExpansion1.1.0-beta.1.jar).

> [!WARNING]
> Back up your server, worlds, and Slimefun data before changing addon versions. Do not use `/reload` to install or upgrade Slimefun plugins. This is a beta release.

---

## 🚀 Installation

1. Stop your Paper server and make a backup.
2. Install **Slimefun Legacy 4.1.81** if it is not already present. Do not run two Slimefun core implementations at the same time.
3. Download the Infernal Expansion JAR from [Releases](https://github.com/wickidcow/SF_InfernalExpansion/releases).
4. Place the JAR in your server's `plugins/` folder, removing older InfernalExpansion JARs to avoid loading duplicate versions.
5. Restart the server and check the console for `[InfernalExpansion] Addon enabled.`
6. Check the Slimefun guide and test the runes, talisman, teleporter, Fireball Launcher, and Piglin Attractor in a safe test world.

No separate GhuizanLib installation is needed. Slimefun and Paper are provided by the server, not bundled into the addon JAR.

---

## 🛠️ What this maintained fork changes

- **English-first content:** Translated the original Chinese names, item lore, and player-facing messages.
- **Modern compatibility:** Builds using Java 25, Paper 26.3 APIs, and Slimefun Legacy 4.1.81.
- **Independent Thermal Walk metadata:** Avoids using Slimefun's soulbound marker; recognizes historical Thermal Walk lore.
- **Piglin Talisman maintenance:** Uses supported public Slimefun lookups for standard and Ender-infused variants instead of private-method reflection.
- **Correctness improvements:** Updates renamed potion effects and avoids skipping other players during the Thermal Walk task.
- **Verifiable releases:** GitHub Actions checks the published Slimefun Legacy JAR checksum, compiles the addon, inspects the generated JAR, and starts Paper with both plugins before a beta is published.

**Folia is not yet claimed compatible.** Threading and region scheduler work require a separate audit.

---

## ❤️ Honoring the original creator

**This project exists thanks to Kirzu's original work.**

The original **[InfernalExpansion](https://github.com/NotKirzu/InfernalExpansion)** was created by **Kirzu** in 2022, known on GitHub as **[NotKirzu](https://github.com/NotKirzu)** and credited as **Kiirzu** in the original plugin metadata. The imaginative Nether-themed items, ideas, and gameplay that define this addon come from that project.

We sincerely appreciate the time, creativity, and technical effort invested in building it and releasing its source to the community. **The original author's contributions remain the foundation of SF Infernal Expansion.** The goal of this maintained fork is to preserve that work, not overwrite or claim credit for it.

- **Original project and source:** [NotKirzu/InfernalExpansion](https://github.com/NotKirzu/InfernalExpansion)
- **Original author and copyright:** Kirzu — *Copyright (c) 2022 Kirzu*
- **Current community maintenance and compatibility updates:** [wickidcow](https://github.com/wickidcow)
- **Slimefun ecosystem:** Thank you to the creators and contributors of Slimefun and its addons for making projects like this possible.

The original **MIT license** and its copyright notice remain intact in [LICENSE](LICENSE). Attribution to the original creator is preserved.

---

## 🤝 Support & contributions

Bug reports, compatibility issues, and pull requests are welcome in the [issue tracker](https://github.com/wickidcow/SF_InfernalExpansion/issues). Please include the Paper build, Java version, Slimefun Legacy version, addon version, and a relevant console error when reporting a problem.

Development builds and their validation results are available in [GitHub Actions](https://github.com/wickidcow/SF_InfernalExpansion/actions/workflows/build.yml).

---

## 📜 License & legal notice

This software is distributed under the [MIT License](LICENSE), retaining the original 2022 copyright attribution to Kirzu.

SF Infernal Expansion is independent, community-maintained software. Minecraft and related names are the property of their respective owners. Nothing in this repository implies affiliation with, sponsorship by, or endorsement from Mojang Studios or Microsoft.

**NOT AN OFFICIAL MINECRAFT PRODUCT. NOT APPROVED BY OR ASSOCIATED WITH MOJANG OR MICROSOFT.**
