public class Algo_8{
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, 7};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        //Intersection of numA amd numB
        System.out.println("Intersection (numA \u2229 numB): ");
        for(int a : numA){
            for(int b : numB){
                if (a == b){
                    System.out.print(a + " ");
                    break;
                }
            }
        }
        System.out.println();

        //Union of numA and numB
        System.out.println("Union (numA \u222A numB): ");
        for (int a : numA){
            System.out.print(a + " ");
        }
        for(int b :numB){
            boolean flag = false;
            for(int a : numA){
                if(b==a){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(b + " ");
            }
        }
        System.out.println();

        //Elements in numA but not in numB
        System.out.println("numA / numB : ");
        for(int a : numA){
            boolean flag = false;
            for (int b : numB){
                if (a == b){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.print(a + " ");
             }
        }

        System.out.println();

        //Elements in numB but not in numA
        System.out.println("numB / numA : ");
        for(int b : numB){
            boolean flag = false;
            for (int a : numA){
                if (b==a){
                    flag = true;
                    break;
                }   
            }
            if (!flag){
                System.out.print(b + " ");
            }
        }

        System.out.println();

        //Symmetric Difference of numA and numB
        System.out.println("Symmetric Difference (numA \u25B3 numB): ");
        for (int a :numA){
            boolean flag = false;
            for (int b : numB){
                if (a == b){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.print(a + " ");
            }
        }

        for (int b :numB){
            boolean flag = false;
            for (int a : numB){
                if (b == a){
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.print(b + " ");
            }
        }

        System.out.println();
        
    }
}