import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * 1. In ra các số chẵn và tính tổng trong khoảng 0...n
        2. In ra các số lẻ và tính tổng trong khoảng 0...n
        3. Kiểm tra n có phải số nguyên tố không
        4. Kiểm tra n có phải số hoàn hảo không
        5. In ra các số nguyên tố trong khoảng 0...n
        6. In ra các ước số của n và tính tổng
        7. Thoát
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập 1 số từ 0 đến n");
        int n = Integer.parseInt(sc.nextLine());
        int sum;
        do {
            System.out.println("1. In ra các số chẵn và tính tổng trong khoảng 0...n");
            System.out.println("2. In ra các số lẻ và tính tổng trong khoảng 0...n");
            System.out.println("3. Kiểm tra n có phải số nguyên tố không");
            System.out.println("4. Kiểm tra n có phải số hoàn hảo không");
            System.out.println("5. In ra các số nguyên tố trong khoảng 0...n");
            System.out.println("6. In ra các ước số của n và tính tổng");
            System.out.println("7. Thoát");
            System.out.println("Sự lựa chon của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                 sum = 0;
                    for (int i = 0; i <= n; i++) {
                        if (i%2==0) {
                            System.out.println("Số chẵn là: " + i);
                            sum += i;
                        }
                    }
                    System.out.println("Tổng các số chẵn trong khoảng từ 0 đến "+ n + " là: " + sum);
                    break;
                case 2:
                   sum = 0;
                    for (int i = 0; i <= n; i++) {
                        if (i%2!=0) {
                            System.out.println("Số lẻ là: " + i);
                            sum += i;
                        }
                    }
                    System.out.println("Tổng các số lẻ trong khoảng từ 0 đến "+ n + " là: " + sum);
                    break;
                case 3:

                    if (n < 2){
                        System.out.println(n+" không phải là số nguyên tố");
                    }
                    else if (n == 2){
                        System.out.println(n+" là số nguyên tố");
                    }
                    else if (n % 2 == 0){
                        System.out.println(n+" không phải là số nguyên tố");
                    }
                    else{
                        // lặp từ 3 tới n-1 với bước nhảy là 2 (i+=2)
                        for (int i = 3; i < n-1; i+=2)
                        {
                            if (n % i == 0){
                                System.out.println(n+" không phải là số nguyên tố");
                                break;
                            }else {
                                System.out.println(n+" là số nguyên tố");
                                break;
                            }
                        }
                    }
                    break;
                case 4:
                    sum = 0;
                    for(int i=1;i < n;i++){
                        if(n%i==0)
                            //tổng các ước số của a
                            sum +=i;
                    }
                    //nếu tổng ước số sum = a thì a là số hoàn hảo
                    if(sum == n){
                        System.out.println(n + " là số hoàn hảo");
                    }
                    //ngược lại không phải là số hoàn hảo
                    else {
                        System.out.println(n + " không phải là số hoàn hảo");
                    }
                    break;
                case 5:
                    //Duyệt các số từ 2 đến n
                   if (n>=2) {
                       System.out.printf("các số nguyên tố từ 0 đên %d là: \n",n);
                       for (int i = 2; i <= n; i++) {
//                           Kiểm tra i có phải số nguyên tố ko
                           boolean check = false;
                           for (int j = 2; j <= Math.sqrt(i); i++) {
                               if (i%j==0) {
                                   // j là ước của i
                                   check = true;
                                   break;
                               }
                           }
                           if (!check) {
                                //i la so nguyen to
                               System.out.printf("%d\t",i);
                           }
                       }
                       System.out.printf("\n");
                   }
break;
                case 6:
                    sum = 0;
                    System.out.printf("Các ước ố của %d là: \n",n);
                    for (int i = 1; i <=n; i++) {
                        if (n%i==0) {
                            System.out.printf("%d\t",i);
                            sum+=i;
                        }
                    }
                    System.out.printf("\nTong cac uoc cua %d la: %d\n",n,sum);
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-7");
            }
        } while (true);
    }
}