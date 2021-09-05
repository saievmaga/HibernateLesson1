public class Main {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        /* Поиск продукта по id */
        /*
        try {
            Product apple = productDao.findById(1L);
            System.out.println(apple);
            Product pear = productDao.findById(2L);
            System.out.println(pear);
            Product orange = productDao.findById(3L);
            System.out.println(orange);
            Product banana = productDao.findById(4L);
            System.out.println(banana);
            Product fruit = productDao.findById(5L);
            System.out.println(fruit);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        */

        /*Получаем список продуктов*/
        /*
        System.out.println("productDao.findAll() : ");
        List<Product> products = productDao.findAll();
        for ( Product p : products) {
            System.out.println(p);
        }
        */

        /*Удаляем продукт по id*/
        /*
        try {
            productDao.deleteById(4L);
        } catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }
        */


        /*Изменяем продукт*/
        /*
        try {
            Product product = productDao.findById(1L);
            product.setTitle(product.getTitle() + "(updated)");
            product.setPrice(product.getPrice() + 10);
            product = productDao.saveOrUpdate(product);
            System.out.println(product);
        } catch (ProductNotFoundException e) {
            e.printStackTrace();
        }
        */
    }
}
