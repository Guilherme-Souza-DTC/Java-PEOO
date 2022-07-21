package compra.de.celular.teste;

public class CompraDeCelularTeste {
    
    public static void main(String[] args) {
        int iphone11 = 5500;
        int iphoneXR = 4500;
        int iphone8 = 4000;
        int iphone7 = 2500;
        int cofreGuilherme = 4600;
        
        if (iphone11 < cofreGuilherme){
            System.out.println("Pode comprar 0 Iphone 11");
        } if (iphoneXR < cofreGuilherme){
            System.out.println("Pode comprar o Iphone XR");
        } if (iphone8 < cofreGuilherme){
            System.out.println("Pode comprar o Iphone 8");
        } if (iphone7 < cofreGuilherme){
            System.out.println("Pode comprar o Iphone 7");
        }
        
        if ((iphone11 < iphoneXR) && (iphone11 < iphone8) && (iphone11 < iphone7)){
            System.out.println("O mais barato é o Iphone 11, COMPRADO!!");
        } if ((iphoneXR < iphone11) && (iphoneXR < iphone8) && (iphoneXR < iphone7)){
            System.out.println("O mais barato é o Iphone XR, COMPRADO!!");
        } if ((iphone8 < iphone11) && (iphone8 < iphoneXR) && (iphone8 < iphone7)){
            System.out.println("O mais barato é o Iphone 8, COMPRADO!!");
        } if ((iphone7 < iphone11) && (iphone7 < iphoneXR) && (iphone7 < iphone8)){
            System.out.println("O mais barato é o Iphone 7, COMPRADO!!");
        }
    }
    
}
