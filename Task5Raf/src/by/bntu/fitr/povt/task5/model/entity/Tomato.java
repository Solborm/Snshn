package by.bntu.fitr.povt.task5.model.entity;

public class Tomato extends Product{
    
    private String sort;

    public Tomato() {
        sort="unknown";
    }

    public Tomato(String sort, int weight, int calories) {
        super(weight, calories);
        this.sort = sort;
    }

    public Tomato(String sort, Product product) {
        super(product);
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Tomato{" + "sort=" + sort + '}';
    }
    
    
}
