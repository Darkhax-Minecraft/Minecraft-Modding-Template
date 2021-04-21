This mod provides an example Minecraft mod that can be referenced by other mod developers. Players may also use this mod to ensure that mods are being properly loaded.

## Project Goals
1) Provide build modules and related tools for mod developers.
2) Document the various tools, apis, plugins, and modules used by mod developers.
3) Test build tools through continuous integration.

 
## Player Information
When loaded into a Minecraft environment the example mod will print it's name and version to the console. There are no additional requirements or functionality in game at this time.

 
## Developer Information
This mod is generated using the example mod template on GitHub. This template contains many modules and plugins which can be used to maximize the visibility and presence of your mod while reducing the amount of work required by the developer. This template is licensed under Creative Commons 0 and may be freely used by anyone to create new Minecraft mods or enhance their existing projects. Credit is appreciated but not required.

## Current features include

    Appending build number from CI environment
    Generating Sources and Javadoc artefacts
    Common Java manifest properties
    Autodeploy build artefacts to CurseForge
    Post to Discord on CurseForge upload
    Generate Forge mod, including mixins, access transformers, and other properties
    Generate changelogs from git commit messages
    Deploy build artefacts to maven
    Minify JSON files at build time
    Build time properties from secret environmental variables
    Signing build artefacts with PGP signatures
    In-game update/version checker

 
## Future Updates
This project will be updated with additional features, documentation, and optimizations as time permits. The immediate plans include additional documentation, Twitter integration, and Fabric support.
 