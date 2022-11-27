package javaHw;

public class AttributeJava {

	public static void main(String[] args) {
      
		Product product = new Product(1, "laptop", "Apple", 300, 2, "Black"); 
		
		/*Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Apple Mac");
		product.setPrice(25000);
		product.setStockAmount(3);
		product.setRenk("blue");
		product.setKod("014786552");*/
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(0, 0));
		
		

		
	}

}
