//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SchoolSystem schoolSystem = null;
        String[] inputArray = new String[]{"SchoolSystem","addStudent","addStudent","addStudent","addStudent"};//输入数据
        int[][] stuTypeArray = {{1, 1, 0}, {1}, {2}, {3}, {1}};
        Boolean[] results = new Boolean[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {//for循环初始化
            if (inputArray[i].equals("SchoolSystem")) {
                schoolSystem = new SchoolSystem(stuTypeArray[i][0], stuTypeArray[i][1], stuTypeArray[i][2]);
            } else {
                boolean result = schoolSystem.addStudent(stuTypeArray[i][0]);
                results[i] = result;
            }
        }

        //System.out.println(Arrays.toString(results));
        schoolSystem.print(results);//print方法输出
        }


    }


