package Game.Entities.Static;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Burger{

    int x, y, width,height;
    Burger(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    ArrayList<Item> ingredients = new ArrayList<>();
    ArrayList<BufferedImage> sprite = new ArrayList<>();

    public void addIngredient(Item ingredient){
        this.ingredients.add(ingredient);
        this.sprite.add(ingredient.sprite);
    }
    public void finishBurger(){
        this.sprite.add(null);
    }

    public void render(Graphics g){
        int counter = 1;
        for (BufferedImage ingredient:this.sprite){
            g.drawImage(ingredient,x,y-(counter * 5),width,height,null);
            counter++;
        }
    }
}