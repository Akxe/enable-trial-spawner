# Enable Trial Spawner

[![Build Status](https://github.com/Akxe/enable-trial-spawner/actions/workflows/build.yml/badge.svg)](https://github.com/Akxe/enable-trial-spawner/actions/workflows/build.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.21.1-green.svg)](https://minecraft.net)

Fixes the [MC-266487](https://bugs.mojang.com/browse/MC/issues/MC-266487) bug in Minecraft.

**Server-only mod for Minecraft Fabric and NeoForge.**

This mod allows trial spawners to spawn mobs even when the `doMobSpawning` gamerule is set to false, matching the behavior of vanilla mob spawners. This fixes an inconsistency where trial spawners would stop working when mob spawning is disabled globally, while regular spawners continue to function.

## ✨ Features

- 🟢 **Server-only:** Clients do not need this mod to join the server
- 🟢 **Universal jar:** One file works for both Fabric and NeoForge
- 🟢 **Cross-platform:** Built with Architectury for maximum compatibility
- 🟢 **No configuration:** Works out of the box with zero setup required
- 🟢 **Lightweight:** Minimal performance impact
- 🟢 **Bug fix:** Resolves vanilla Minecraft inconsistency

## 🎯 Supported Versions

- **Minecraft:** 1.21.1 and above (until the bug is officially fixed)
- **Fabric:** Requires Fabric Loader 0.17.0+
- **NeoForge:** Requires NeoForge 21.1.187+
- **Java:** Requires Java 21 or newer

## 📦 Installation

1. Download the latest release from [GitHub Releases](https://github.com/Akxe/enable-trial-spawner/releases) or [Modrinth](https://modrinth.com/mod/enable-trial-spawners)
2. Place the `.jar` file in your server's `mods` folder
3. Restart your server
4. The mod will automatically fix trial spawner behavior

## 🔧 Building from Source

Requirements:
- Java 21 or newer
- Git

```bash
git clone https://github.com/Akxe/enable-trial-spawner.git
cd enable-trial-spawner
./gradlew build
```

The built files will be available in:
- `fabric/build/libs/` - Fabric version
- `neoforge/build/libs/` - NeoForge version

## 🐛 Bug Reports

Found an issue? Please report it on our [GitHub Issues](https://github.com/Akxe/enable-trial-spawner/issues) page.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
