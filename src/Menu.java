public class Menu {
    public Menu(){

    }
    public Menu(String menuName, String menuType){
        this.menuName = menuName;
        this.menuType = menuType;
    }
    public void Add(){
        System.out.println("Siparis Eklendi");
    }
    public void Delete(){
        System.out.println("Siparis Silindi");
    }
    String menuName;
    String menuType;
}
