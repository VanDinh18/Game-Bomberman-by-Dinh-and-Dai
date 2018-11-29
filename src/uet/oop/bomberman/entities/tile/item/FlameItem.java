package uet.oop.bomberman.entities.tile.item;

import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;
import uet.oop.bomberman.sound.Audio;

import java.io.File;

public class FlameItem extends Item {
	private Audio eatItem;

	public FlameItem(int x, int y, Sprite sprite) {
		super(x, y, sprite);
		eatItem = new Audio(new File("res/gamesound/EatItemp2.wav"));
	}

	@Override
	public boolean collide(Entity e) {
		// TODO: xử lý Bomber ăn Item
		if(e instanceof Bomber){
			if(this.isRemoved())
				return true;
			Game.addBombRadius(1);
			remove();
			eatItem.play();
			return true;
		}
		return false;
	}

}
