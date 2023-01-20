package food;
public abstract class Fruit 
{
    private String flavor;
    private String color;
    private String tree;

    public void setFlavor(String flavor)
    {
        this.flavor = flavor;
    }

    public String getFlavor()
    {
        return this.flavor;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setTree(String tree)
    {
        this.tree = tree;
    }

    public String getTree()
    {
        return this.tree;
    }


}
