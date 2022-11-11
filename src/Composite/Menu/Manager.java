package Composite.Menu;

public class Manager {
    MenuComponent allMenus;
    public Manager(MenuComponent allMenus){
        this.allMenus=allMenus;
    }
    public void printMenu(){
        allMenus.print();
    }
}
