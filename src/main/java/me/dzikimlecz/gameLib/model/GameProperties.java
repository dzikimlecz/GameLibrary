package me.dzikimlecz.gameLib.model;

import java.util.HashMap;
import java.util.Map;

public class GameProperties {
	private final Map<String, Object> gameProperties;
	
	public GameProperties() {
		this.gameProperties = new HashMap<>();
	}
	
	public void register( String key, Object object) {
		gameProperties.putIfAbsent(key.toLowerCase(), object);
	}
	
	
	public Object get(String key) {
		return gameProperties.get(key);
	}
	
	public boolean isEmpty() {
		return gameProperties.isEmpty();
	}
}
