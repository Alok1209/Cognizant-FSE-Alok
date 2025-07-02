import java.util.ArrayList;
import java.util.List;



public class ECommerce {
    public static void main(String args[]){
        List<Product> products =new ArrayList<>();
        boolean flag=false;
        products.add(new Product("t-Shirt ","Crew Neck"));
        products.add(new Product("Jeans","Slim Fit"));
        products.add(new Product("Top","tube top"));
        products.add(new Product("kurti","white slim fit"));
        products.add(new Product("Mobile","apple 14 pro max"));
        products.add(new Product("Laptop","Gaming"));
        products.add(new Product("Jeans","boot Cut"));

        for(Product product: products){
            if(product.getName().toLowerCase().contains("jeans")|| product.getDescription().toLowerCase().contains("jeans")){
                System.out.println("Product Name: " + product.getName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("-------------------------");
                flag=true;
            }
        }

        if(!flag){
            System.out.println("No Product Found");
        }
    }
    
}

class Product{
    String name , description;

    public Product(){
        this.name ="No Product";
        this.description="none";
    }

    public Product(String name, String description){
        this.name= name;
        this.description= description;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name){
        this.name=name;

    }
    public void setDescription(String description){
        this.description=description;
    }


}