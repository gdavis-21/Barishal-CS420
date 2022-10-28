import java.util.ArrayList;
import java.util.List;

interface Farm{
    public void deleteItem(item Item);
    public void changeName(String newName);
    public void changePrice(double newPrice);
    public void changeLocationX(double newLocationX);
    public void changeLocationY(double newLocationY);
    public void changeLength(double newLength);
    public void changeWidth(double newWidth);
    public void changeHeight(double newHeight);
    public void addItemContainer(itemContainer ItemContainer);
    public void deleteItemContainer(itemContainer ItemContainer);
    public void addItem(item Item);
}

class itemContainer implements Farm{

    private String name;
    private double price;
    private double locationX;
    private double locationY;
    private double length;
    private double width;
    private double height;

    private List<itemContainer> collectionOfItemContainers = new ArrayList<itemContainer>();
    private List<item> collectionOfItems = new ArrayList<item>();

    public itemContainer(String name, double price, double locationX, double locationY, double length, double width, double height){
        this.name = name;
        this.price = price;
        this.locationX = locationX;
        this.locationY = locationY;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void deleteItem(item Item) {
        collectionOfItems.remove(Item);
    }

    @Override
    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public void changeLocationX(double newLocationX) {
        this.locationX = newLocationX;
    }

    @Override
    public void changeLocationY(double newLocationY) {
        this.locationY = newLocationY;
    }

    @Override
    public void changeLength(double newLength) {
        this.length = newLength;
    }

    @Override
    public void changeWidth(double newWidth) {
        this.width = newWidth;
    }

    @Override
    public void changeHeight(double newHeight) {
        this.height = newHeight;
    }

    @Override
    public void addItemContainer(itemContainer ItemContainer) {
        collectionOfItemContainers.add(ItemContainer);
    }

    @Override
    public void deleteItemContainer(itemContainer ItemContainer) {
        collectionOfItemContainers.remove(ItemContainer);
    }

    @Override
    public void addItem(item Item) {
        collectionOfItems.add(Item);
    }

    public String getContainerName(itemContainer Container) {
        return Container.name;
    }

    public void printItemContainerCollection() {
        System.out.println("\nPrinting item container collection(s) for " + this.name + ":");
        for (itemContainer i : collectionOfItemContainers) {
            System.out.println(getContainerName(i));
        }
    }

    public void printItems(){
        System.out.println("\nPrinting item(s) for " + this.name + ":");
        for (item i : collectionOfItems) {
            System.out.println((i.getName()));
        }
    }
}

class item implements Farm{

    private String name;
    private double price;
    private double locationX;
    private double locationY;
    private double length;
    private double width;
    private double height;

    private List<item> collectionOfItems = new ArrayList<item>();

    public item(String name, double price, double locationX, double locationY, double length, double width, double height){
        this.name = name;
        this.price = price;
        this.locationX = locationX;
        this.locationY = locationY;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void deleteItem(item Item) {
        collectionOfItems.remove(Item);
    }

    @Override
    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public void changePrice(double newPrice) {
        this.price = newPrice;
    }

    @Override
    public void changeLocationX(double newLocationX) {
        this.locationX = newLocationX;
        
    }

    @Override
    public void changeLocationY(double newLocationY) {
        this.locationY = newLocationY;
        
    }

    @Override
    public void changeLength(double newLength) {
        this.length = newLength;
        
    }

    @Override
    public void changeWidth(double newWidth) {
        this.width = newWidth;
        
    }

    @Override
    public void changeHeight(double newHeight) {
        this.height = newHeight;
        
    }

    public String getName(){
        return this.name;
    }
}


public class Composite{
    public static void main(String[] args) {

        //------------------------------------------------------------First Scenario---------------------------------------------------------
        itemContainer Barn = new itemContainer("Barn", 175621.42, 567, 42, 42, 20, 15);
        itemContainer liveStockArea = new itemContainer("Live-Stock-Area", 5765.21, 567, 42, 12, 16, 8);
        item milkStorage = new item("Milk Storage", 25.75, 567, 42, 4, 5, 3);
        item cow = new item("Cow", 2000.00, 567, 42, 62, 28, 68);

        Barn.addItemContainer(liveStockArea);
        Barn.addItem(milkStorage);
        liveStockArea.addItem(cow);

        Barn.printItemContainerCollection();
        Barn.printItems();

        liveStockArea.printItems();


        //------------------------------------------------------------Second Scenario---------------------------------------------------------
        itemContainer storageBuilding = new itemContainer("Storage Building", 7500.35, 565, 40, 65, 20, 25);
        item tractor = new item("Tractor", 15000, 565, 40, 12, 6, 4);
        item tiller = new item("Tiller", 10000, 565, 40, 10, 4, 4);

        storageBuilding.addItem(tractor);
        storageBuilding.addItem(tiller);
        
        storageBuilding.printItems();


        //------------------------------------------------------------Third Scenario---------------------------------------------------------
        itemContainer commandCenter = new itemContainer("Command Center", 8500, 560, 35, 40, 30, 20);
        item drone = new item("Drone", 100, 560, 35, 4, 4, 1);
        
        commandCenter.addItem(drone);
        commandCenter.printItems();

        //------------------------------------------------------------Fourth Scenario---------------------------------------------------------
        item soy = new item("Soy", 10.20, 500, 15, 0.5, 0.5, 2);


        System.out.println("\n");
    } 
}