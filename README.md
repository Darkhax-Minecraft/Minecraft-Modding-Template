# Minecraft-Modding-Template
A flexible template for creating Minecraft mods. Intended for power users and beginners.

## Forge Module
The Forge module will allow your project to create Forge based developer environments and produce compiled mods for the Forge mod loader.

### Required Properties
This module requires the following properties to run properly. These are generally set using the `gradle.properties` file.

| Property          | Example    | Description                                                                    |
|-------------------|------------|--------------------------------------------------------------------------------|
| minecraft_version | 1.16.5     | The version of Minecraft to use.                                               |
| forge_version     | 36.1.2     | The version of Forge to use.                                                   |
| mod_name          | ExampleMod | The name of your mod. It is recommended to only use alphabetic characters.     |
| mod_version       | 1.0        | The version of your mod. Please use [Semantic Versioning](https://semver.org). |

### Optional Properties
These properties are completely optional. They are used to change default behaviors or enable additional functionality.

| Property         | Default | Description                                                                           |
|------------------|---------|---------------------------------------------------------------------------------------|
| forge_client_dir | run     | The directory to run the dev client in.                                               |
| forge_server_dir | run     | The directory to run the dev server in.                                               |
| forge_log_level  | debug   | The default logging level for Forge.                                                  |
| forge_at         | null    | Enables custom access transformers. Defines the path to your access transformer file. |
| forge_log_colors | true    | Enables ANSI log colors in the console/terminal of the dev environment.               |
|                  |         |                                                                                       |

### Tasks
Several new tasks are made available when using this module. These tasks can be ran from the command line or from your IDE.

| Name            | Description                                                    |
|-----------------|----------------------------------------------------------------|
| runClient       | Runs the development version of the game client with your mod. |
| runServer       | Runs the development version of the game server with your mod. |
| genEclipseRuns  | Generates run files for the Eclipse IDE.                       |
| genIntellijRuns | Generates run files for the Intellij IDEA IDE.                 |
| genVSCodeRuns   | Generates run files for the VSCode IDE.                        |