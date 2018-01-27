package ohnana.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "swagger")
public class SwaggerStaticContent {
//    Player model
    public static final String PLAYER_ID = "id of the player";
    public static final String PLAYER_NAME = "name of the player";
    public static final String PLAYER_ORDER = "order of the player";
    public static final String PLAYER_TEAM = "team of the player";

//    Game model
    public static final String SESSION_ID = "id of the game";
    public static final String SESSION_PLAYERS = "players belonging to the game";
}