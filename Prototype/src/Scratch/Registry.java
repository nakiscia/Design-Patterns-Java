package Scratch;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type){
        Item item = null;

        try{
            item = (Item) (items.get(type)).clone();
        }catch (CloneNotSupportedException e){ e.printStackTrace();}

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("LOTR");
        movie.setPrice(100.99);
        movie.setRuntime("2 hours");
        items.put("Movie",movie); // Use enum!!!!

        Book book = new Book();
        book.setTitle("Design Patterns");
        book.setNumberOfPages(300);
        book.setPrice(23.99);
        items.put("Book",book);
    }

}
