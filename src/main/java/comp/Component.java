package comp;

public abstract class Component {
    protected String name;
    protected int level=0;
    public abstract void print();

    public String tab(){
        String tab = "";
        for (int i = 0; i < level; i++) {
            tab= tab+ "\t";
        }
        return tab;
    }

    public Component(String name) {
        this.name = name;

    }
}
