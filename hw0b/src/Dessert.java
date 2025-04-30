public class Dessert {
    // 实例变量：口味和价格
    private int flavor;
    private int price;

    // 静态变量：记录创建的甜点总数
    private static int numDesserts = 0;

    // 构造函数：初始化口味和价格，并递增甜点计数
    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }

    // 打印方法：输出口味、价格和总创建数
    public void printDessert() {
        System.out.println(flavor + " " + price + " " + numDesserts);
    }

    // 主方法：按要求打印指定信息
    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }

}
