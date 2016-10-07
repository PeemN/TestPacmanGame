package com.jittat.gdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class WorldRenderer {
	private PacmanGame pacmanGame;
	private World world;
	private Texture pacmanImg;
	private SpriteBatch batch;
	 public WorldRenderer(PacmanGame pacmanGame, World world) {
	        this.pacmanGame = pacmanGame;
	        batch = pacmanGame.batch;
	 
	        this.world = world;
	 
	        pacmanImg = new Texture("pacman.png");
	 }
     public void render(float delta) {
    	 
     }
}
