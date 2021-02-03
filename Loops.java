public class Loops{
    public static void main(String[] args){
        System.out.print("\nA. ");
        for(int i = 0; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.print("\nB. ");
        for(int i = 100; i > 0; i = i - 3) {
            System.out.print(i + " ");
        }
        System.out.print("\nC. ");
        for(int i = 1; i < 100; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.print("\nD. ");
        for(int i = 0; i <= 100; i++) {
            if(i  % 3 == 0){
                if(i % 5 == 0){
                    System.out.print("Hello World ");
                }
                else {
                    System.out.print("Hello ");
                }
            }
            else if (i % 5 == 0 ){
                System.out.print("World ");
            }
            else System.out.print(i + " ");
        }
    }

}