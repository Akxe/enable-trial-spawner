# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] - 2025-08-07

### Added
- Initial release of Enable Trial Spawner mod
- Fixes MC-266487: Trial spawners now work even when doMobSpawning is disabled
- Server-only mod that works on both Fabric and NeoForge
- Universal jar support for both mod loaders
- Support for Minecraft 1.21.1

### Features
- ✅ Server-only: Clients do not need this mod to join
- ✅ Universal jar: One file works for all supported versions/loaders
- ✅ Bug fix: Resolves vanilla Minecraft bug MC-266487
- ✅ No configuration needed: Works out of the box

### Technical Details
- Built for Minecraft 1.21.1
- Requires Java 21 or newer
- Compatible with Fabric Loader 0.17.0+
- Compatible with NeoForge 21.1.187+
- Uses Architectury API for cross-platform compatibility
