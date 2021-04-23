package responsi;

import java.util.Scanner;

public class program_kel14 {

        static void nama_kelompok(){
            System.out.println("+======================================================+"+
                    "\n|              --- Kelompok 14 ---                     |"+
                    "\n|  Anggota Kelompok  :                                 |"+
                    "\n|  Khasandra Nur Pristiwaning rahayu    21120120140089 |"+
                    "\n|  Muhanif Rafi Ahmadi                  21120120130044 |"+
                    "\n|  Nur Ayuk Febreyanti                  21120120130053 |"+
                    "\n|  Rosyad Shidqi Dikpimmas              21120120130161 |"+
                    "\n+======================================================+");
        }

        static void enkripsi(String a){
            char [] chars = a.toCharArray();
            for(char c : chars){
                c += 10;
                System.out.print(c);
            }
        }

        public static void dekripsi(String b){
            char [] chars = b.toCharArray();
            for(char c : chars){
                c -= 5;
                System.out.print(c);
            }
        }

        public static void main(String[] args) {
            nama_kelompok();
            System.out.println("PILIH APAKAH ANDA INGIN ENKRIPSI ATAU DEKRIPSI "+
                    "\n 1. Enkripsi \n 2. Dekripsi");
            Scanner scan = new Scanner(System.in);
            Integer z = scan.nextInt();
            if (z==1){
                System.out.println("+---------------------------------------------------------+"+
                        "\n|   Masukan huruf dan angka yang ingin anda enkripsi      |" +
                        "\n+_________________________________________________________+");
                Scanner scan1 = new Scanner(System.in);
                String a = scan1.nextLine();
                enkripsi(a);
            }
            else if (z==2){
                System.out.println("+---------------------------------------------------------+"+
                        "\n|   Masukan huruf dan angka yang ingin anda dekripsi     |" +
                        "\n+_________________________________________________________+");
                Scanner scan2 = new Scanner(System.in);
                String b = scan2.nextLine();

                responsi.program_kel14 subjek = new responsi.program_kel14();
                subjek.dekripsi(b);
            }
            else {
                System.out.println("TIDAK ADA DI LIST");
            }

        }
    }