This GitHub repository provides a template for how I build my Minecraft mods. It provides many useful scripts, plugins, and modules that can be referenced by other mod developers. Some players may also find this mod useful for ensuring that their preferred mod loader is actually loading mods.

## Project Goals
1) Provide build scripts, modules, and related tools for mod authors.
2) Document the various tools, apis, plugins, and modules that I use.
3) Test this build configuration through continuous integration.

## Note to Developers
This template contains many modules, plugins, and other tools which can be used to enhance your mods while reducing the amount of work required. This template is licensed under Creative Commons 0 and may be freely used to create new Minecraft mods or improve their existing projects. Credit is appreciated by not required. 

## Current Features

**New to 1.18**
This project now incorporates [Jared's Multiloader Template](https://github.com/jaredlll08/MultiLoader-Template) which allows mods to be developed against the vanilla codebase and then compiled for Forge and Fabric independently. This has changed many aspects of the project structure which have now been accounted for by this template. 

- Append build number from CI job or current git commit hash.
- Sources and JavaDoc generation.
- Common Java manifest attributes.
- Publish new builds to CurseForge using new CurseForgeGradle plugin.
- Announce new CurseForge releases on Discord.
- Announce new CurseForge releases on Twitter.
- Deploy artifacts to Maven.
- Sign build artifacts with PGP.
- In game version update checker.
- Minify JSON and mcmeta files at build time.
- Include Patreon pledge information in builds.
- Apply Mixins for Forge, Fabric, and vanilla.
- Generate changelogs from git commit history.
- Compile for both Forge and Fabric using one code base!

## Future Updates
This project will be updated with additional features, documentation, and optimizations as time permits. I personally consider this project feature complete and have no immediate plans for new features.
 