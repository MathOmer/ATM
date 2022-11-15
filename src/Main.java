import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String U_name="java",P_assword="dev123",Username,Password;
        int select,balance=9000,price;
        int right =3;
        Scanner input = new Scanner(System.in);

        while(right >0){

            System.out.print("Kullanıcı adınızı giriniz: ");
            Username = input.nextLine();
            System.out.print("Şifenizi giriniz: ");
            Password = input.nextLine();

            if (Username.equals("java") && Password.equals("dev123")){

                System.out.println("Sisteme giriş yaptınız:");
                System.out.print("Merhaba,İş Bankasına Hoşgeldiniz.Hangi işlemi yapmak istiyorsunuz?: " );
                    do{
                        System.out.print("\n1- Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorma\n"+"4-Çıkış Yap\n"+"Seçim: ");
                        select = input.nextInt();

                        switch (select){
                            case 1:
                                System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                                price = input.nextInt();
                                balance += price;
                                break;
                            case 2:
                                System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                                price = input.nextInt();
                                if(price>balance){
                                    System.out.println("Yetersiz bakiye");
                                }else{
                                    balance -=price;
                                }
                                break;
                            case 3:
                                System.out.println("Bakiyeniz: "+balance);
                                break;
                            case 4:
                                System.out.println("Sistemden çıkış yapıldı. İyi Günler");
                                break;
                            default:
                                System.out.println("Hatalı seçim yaptınız.");
                            }

                    }while(select!=4);
                    break;

            }else{
                right--;
                System.out.println("Yanlış bilgi girdiniz: Kalan hakkınız: "+right);
                if(right ==0){
                    System.out.println("Hesabınız bloke olmuştur.");
                }
            }

        }

    }

}

