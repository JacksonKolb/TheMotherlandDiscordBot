import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class MotherlandBot {


    public static void main(String[] args) {
        String token = "put your private token here ";

        DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();

        // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });

        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }

}
