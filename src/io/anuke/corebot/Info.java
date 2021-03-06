package io.anuke.corebot;

public enum Info{
    links("Relevant Links",
    "[Github](https://github.com/Anuken/Mindustry/)\n" +
    "[4.0 Plans / Trello](https://trello.com/b/aE2tcUwF)\n" +
    "[Downloads, Web Version](https://anuke.itch.io/mindustry)\n" +
    "[Itch.io App / Updater](https://itch.io/app)\n" +
    "[iOS version](https://itunes.apple.com/us/app/mindustry/id1385258906?mt=8&ign-mpt=uo%3D8)\n" +
    "[Google Play Listing](https://play.google.com/store/apps/details?id=io.anuke.mindustry)\n" +
    "[3.5 Wiki](http://mindustry.wikia.com/wiki/Mindustry_Wiki)\n"),
    beta("Android Beta",
    "To join the Android Beta in Google Play Store, just scroll to the bottom of the page and tap 'join beta'.\n" +
    "Betas can take some time to become available after release. Be patient.\n" +
    "[Direct Link](https://play.google.com/apps/testing/io.anuke.mindustry)"),
    rules("Rules",
    "**1.** Don't be rude. This should be obvious. No racism/sexism/etc.\n" +
    "**2.** No spamming or advertising. Don't post discord links unless someone asks for them.\n" +
    "**3.** No NSFW content or politics. This includes NSFW conversations. Take it elsewhere.\n" +
    "**4.** Keep content to the aproppriate text channels.\n" +
    "**5.** Please keep memes to a minimum.\n" +
    "**6.** Please do not post invite links to this server in public places.\n" +
    "**7.** Do not beg for roles.\n" +
    "**8.** Do not impersonate other members or intentionally edit your messages to mislead others.\n" +
    "**9.** Breaking any of these rules in a non-serious way may result in a warning. 3 warnings is a ban.\n" +
    "*If I don't like your behavior, you're out. Obey the spirit, not the word.*"),
    multiplayer("Multiplayer",
    "Multiplayer in Mindustry works just as it does in many other sandbox games.\n" +
    "To host a server, press *'host'* in the menu while playing.\n" +
    "Your server's IP can be found by googling `my ip`.\n" +
    "To join a server, enter their IP in the 'add server' box and click the server.\n" +
    "Both over-the-internet and LAN play is supported. For someone outside your network to connect to your games, **port forwarding is required.**\n" +
    "Multiplayer is cross-platform.\n\n" +
    "*For more info on how to port forward, check the pinned messages in #multiplayer.*\n"),
    server("Dedicated Server",
    "To run the dedicated server .JAR file, you need to use the command prompt or terminal. **Java is required**.\n\n" +
    "Navigate to the file location and type `java -jar <server-file-name>.jar`, which should start the server.\n" +
    "Note that the server does not automatically start hosting. Type `host <map> <gamemode>` to open the server.\n" +
    "Type `help` for a list of all commands.\n"),
    suggested("Suggested Ideas",
    "*The following ideas have been suggested many times before. Please stop.*\n\n" +
    "- Steam release *(yes, it is planned)*\n" +
    "- Map browser *(coming with steam workshop)*\n" +
    "- Easier multiplayer *(coming with steam)*\n" +
    "- Server browser *(possibly coming with steam)*\n" +
    "- Texture packs *(many reasons)*\n" +
    "- Online player profiles *(overcomplicated, can be done w/ steam)*\n" +
    "- Modding support *(see the #mods channel)*\n" +
    "- Game speed increase *(not technically viable or needed)*\n" +
    "- Liquid teleporter *(overpowered, use phase conduits)*\n" +
    "- Teleporters in 4.0 *(may or may not be coming eventually)*\n" +
    "- Power wires or conduits *(as opposed to nodes)*\n" +
    "- Underground map layer *(unnecessarily complex, use bridges)*\n" +
    "- Trains ***(no thanks)***\n" +
    "- \"hey I have a game idea you should make\" *(no comment)*"),
    pings("Ping and PM Policy",
    "*Please do not PM or ping me (Anuke) unless it is something important.*\n\n" +
    "'Important' includes things like major unreported game server issues or serious exploits, " +
    "problems with the Discord server (e.g. spammers), or Github pull request related issues." +
    "\n" +
    "Do *not* PM or ping me when posting normal suggestions or bugs reports. If it's relevant, I'll read it.\nIf you have a question about the game, *ask in #general.*\n" +
    "\n" +
    "I will not respond to PMs with non-personal game-related questions or messages such as 'hey'.\n" +
    "**I also do not accept random friend requests.**"),
    bugs("Bug Reporting Info",
    "**Template:**\n" +
    "**Platform:** *<Android/iOS/Mac/Windows/Linux/Web>*\n" +
    "**Build:** *<The build number in the bottom left corner of main menu>*\n" +
    "**Issue:** *<What goes wrong and when. Be specific!>*\n\n" +
    "**Status:**\n" +
    ":white_check_mark: - *fixed*\n" +
    ":question: - *can't reproduce the bug, additional info needed*\n" +
    ":x: - *not a bug, intentional behavior*\n" +
    ":fire: - *please stop reporting this*");
    public final String text;
    public final String title;

    Info(String title, String text){
        this.text = text;
        this.title = title;
    }
}
