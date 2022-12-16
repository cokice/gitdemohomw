
public class SchoolSystem {

    private int big;
    private int medium;
    private int small;
    /** 创建构造方法SchoolSystem，三个参数分别对应每种班级的剩余名额
     * author Howen
     */
    public SchoolSystem(Integer big, Integer medium, Integer small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    /**检查是否有 stuType (学生类型)对应的班级。stuType 有三种类型：大，中，小，分别用数字 1，2 和 3 表示。
    一个学生只能在 stuType 对应的班级中。如果没有剩余多的班级人数，返回 false，
    否则将该学生录入班级并返回 true*/
    public boolean addStudent(Integer stuType) {
        if (stuType == 1 && big > 0) {
            big--;
            return true;
        } else if (stuType == 2 && medium > 0) {
            medium--;
            return true;
        } else if (stuType == 3 && small > 0) {
            small--;
            return true;
        }
        return false;
    }
    /**解析输入字符串*/
    public String[] parse(String input) {
        return input.split(" ");
    }
    public void print(Boolean[] results) {
        System.out.print("[");
        for (int i = 0; i < results.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(results[i]);
        }
        System.out.println("]");
    }

    //获得班级人数

    public int getBig() {
        return big;
    }

    public int getMedium() {
        return medium;
    }

    public int getSmall() {
        return small;
    }

}


