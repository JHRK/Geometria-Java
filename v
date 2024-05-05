import java.util.Scanner;
import java.lang.Math;

public class geometriaMain {

        // vai ter um menu aqui para acessar as outras classes
        double aresta;
        int Tipo;
        int Tipodimensao;
        double Pi;
        double R;
        double H;
        double V;
        double AB;
        double AL;
        double r;
        double raio;
        int laterais;
        int operacao;
        int operacogonos;
        int operacao3d;
        int operacaoprismas;
        int opvolume;


        public static void main(String args[]){
        geometriaMain Blehrg = new geometriaMain();
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a boa chefia, escolhe uma opção aí, tem a 1 que é pra geometria plana e 2 pra espacial, faz a boa aí.");
        int Tipo = scanner.nextInt();
        
        if (Tipo < 2){
            System.out.println("tu escolheu geometria plana, segue o fio...");
        }
        else{
            System.out.println("tu escolheu geometria espacial, segue o fio...");
        }

        switch(Tipo){
                case 1:
                    System.out.println("Tá, qual vai ser o tipo de figura? ");
                    System.out.println("1 - quadrado ");
                    System.out.println("2 - círculo ");
                    System.out.println("3 - retângulo ");
                    System.out.println("4 - triângulos");
                    System.out.println("5 - trapézio ");
                    System.out.println("6 - algum dos '-gonos'");

                    int operacao = scanner.nextInt();
                    
                        if(operacao == 6){
                            System.out.println("Tá, qual vai ser o tipo de '-gono'?");
                            System.out.println("7 - pentágono ");
                            System.out.println("8 - hexágono ");
                            System.out.println("9 - heptacontakaiheptagono ");
                            System.out.println("10 - octágono");
                                
                            int operacaogonos = scanner.nextInt();
                                
                                switch(operacaogonos){
                                    case 7:
                                    System.out.println("penta");
                                    break;
                                    case 8:
                                    System.out.println("hexa");
                                    break;
                                    case 9:
                                    System.out.println("sete sete");
                                    break;
                                    case 10:
                                    System.out.println("octa");
                                    break;
                                }
                        }
                
                case 2:
                    System.out.println("Tá, qual vai ser o tipo de cálculo? 1 para área e 2 para volume");
                    int Tipodimensao = scanner.nextInt();
                    
                    switch(Tipodimensao){
                        
                        case 1:
                        System.out.println("AREA -- qual vai ser o tipo de polígono? ");
                        System.out.println("1 - cubo ");
                        System.out.println("2 - esfera ");
                        System.out.println("3 - paralelepípedo ");
                        System.out.println("4 - pirâmide");
                        System.out.println("5 - cone ");
                        System.out.println("6 - prisma");
                        System.out.println("7 - cilindro");

                        int operacao3d = scanner.nextInt();
                                
                                            switch(operacao3d){
                                        
                                            case 1:
                                                
                                                System.out.println("qual o tamanhao do lado do quadrado?");
                                                Blehrg.aresta = scanner.nextInt();
                                                double areaCubo = espacial.calcularAreaCubo(Blehrg.aresta);
                                                System.out.println("a area do cubo é  " + areaCubo);
                                                break;
                                                                
                                            case 2:
            
                                                                
                                            case 3:
                                                System.out.println("3");
                                                            
                                            case 4:
                                                System.out.println("4");
                                                                
                                            case 5:
                                                System.out.println("5");
            
                                            case 6:
                                                System.out.println("Tá, qual vai ser o tipo de prisma?");
                                                System.out.println("7 - triangular ");
                                                System.out.println("8 - quadrangular ");
                                                System.out.println("9 - hexagonal ");
                                                System.out.println("10 - heptacontakaiheptagono");
                                                    
                                                    int operacaoprismas = scanner.nextInt();
                                            
                                                        switch(operacaoprismas){
                                                            case 7:
                                                                System.out.println("triangulo");
                                                                break;
                                                            case 8:
                                                                System.out.println("seis");
                                                                break;
                                                            case 9:
                                                                System.out.println("sete");
                                                                break;
                                                            case 10:
                                                                System.out.println("coisa afu");
                                                                break;
                                                        }
            
                                            case 7:
                                                System.out.println("7");
                                                    
                        
                                            }
                
                            case 2:
                                System.out.println("VOLUME -- qual vai ser o tipo de polígono? ");
                                System.out.println("1 - cubo ");
                                System.out.println("2 - esfera ");
                                System.out.println("3 - paralelepípedo ");
                                System.out.println("4 - pirâmide");
                                System.out.println("5 - cone ");
                                System.out.println("6 - prisma");
                                System.out.println("7 - cilindro");
                
                                        int opvolume = scanner.nextInt();
                                                
                                                            switch(opvolume){
                                                        
                                                            case 1:
                                                            System.out.println("medida do lado do quadrado?");
                                                            Blehrg.aresta = scanner.nextInt();
                                                            double volumeCubo = espacial.calcularVolumeCubo(Blehrg.aresta);
                                                            System.out.println("o volume  do cubo é  " + volumeCubo);
                                                            break;
                                                                                
                                                            case 2:
                                                            System.out.println("quais as medidas da esfera?");
                                                            System.out.println("Pi");
                                                            Blehrg.Pi = scanner.nextDouble();
                                                            System.out.println("Raio");
                                                            Blehrg.raio = scanner.nextInt();
                                                            double volumeEsfera = espacial.calcularVolumeEsfera(Blehrg.Pi, Blehrg.raio);
                                                            System.out.println("o volume da esfera é  " + volumeEsfera);
                                                                                
                                                            case 3:
                                                            System.out.println("quais as medidas do paralelepipedo?");
                                                            System.out.println("Aresta 1");
                                                            Blehrg.arestax = scanner.nextInt();
                                                            System.out.println("Aresta 2");
                                                            Blehrg.arestay = scanner.nextInt();
                                                            System.out.println("Aresta 3");
                                                            Blehrg.arestaz = scanner.nextInt();
                                                            double volumeParalelepipedo = espacial.calcularVolumeParalelepipedo(Blehrg.arestax, Blehrg.arestay, Blehrg.arestaz);
                                                            System.out.println("o volume do paralelepipedo é  " + volumeParalelepipedo);
                                                                            
                                                            case 4:
                                                            System.out.println("quais as medidas da piramide?");
                                                            System.out.println("Aresta 1");
                                                            Blehrg.arestax = scanner.nextInt();
                                                            System.out.println("Laterais");
                                                            Blehrg.laterais = scanner.nextInt();
                                                            System.out.println("Área da base");
                                                            Blehrg.AB = scanner.nextInt();
                                                            System.out.println("Altura");
                                                            Blehrg.H = scanner.nextInt();
                                                            double volumePiramide = espacial.calcularVolumePiramide(Blehrg.arestax, Blehrg.laterais, Blehrg.AB, Blehrg.H);
                                                            System.out.println("o volume da piramide é  " + volumePiramide);
                                                                                
                                                            case 5:
                                                            System.out.println("quais as medidas do cone?");
                                                            Blehrg.raio = scanner.nextInt();
                                                            Blehrg.Pi = scanner.nextInt();
                                                            Blehrg.H = scanner.nextInt();
                                                            double volumeCone = espacial.calcularVolumeCone(Blehrg.raio, Blehrg.Pi, Blehrg.H);
                                                            System.out.println("o volume do cone é  " + volumeCone);
                            
                                                            case 6:
                                                                System.out.println("Tá, qual vai ser o tipo de prisma?");
                                                                System.out.println("1 - triangular ");
                                                                System.out.println("2 - quadrangular ");
                                                                System.out.println("3 - hexagonal ");
                                                                System.out.println("4 - heptacontakaiheptagono");
                                                                    
                                                                    int operacaoprismas = scanner.nextInt();
                                                            
                                                                        switch(operacaoprismas){
                                                                            case 1:
                                                                                System.out.println("triangulo");
                                                                                Blehrg.arestax = scanner.nextInt();
                                                                                Blehrg.AB = scanner.nextInt();
                                                                                Blehrg.H = scanner.nextInt();
                                                                                double volumePrismaTriangular(Blehrg.arestax, Blehrg.AB, Blehrg.H)
                                                                                break;
                                                                            case 2:
                                                                                System.out.println("quatrinho polop");
                                                                                break;
                                                                            case 3:
                                                                                System.out.println("seis");
                                                                                Blehrg.arestax = scanner.nextInt();
                                                                                Blehrg.H = scanner.nextInt();
                                                                                Blehrg.AB = scanner.nextInt();
                                                                                double volumePrismaHexagonal(Blehrg.arestax, Blehrg.H, Blehrg.AB);
                                                                                break;
                                                                            case 4:
                                                                                System.out.println("coisa afu");
                                                                                break;
                                                                        }
                            
                                                            case 7:
                                                            System.out.println("quais as medidas do cilindro?");
                                                            Blehrg.arestax = scanner.nextInt();
                                                            Blehrg.H = scanner.nextInt();
                                                            Blehrg.AB = scanner.nextInt();
                                                            Blehrg.Pi = scanner.nextInt();
                                                            double volumeCilindro = espacial.calcularvolumeCilindro(Blehrg.arestax, Blehrg.H, Blehrg.AB, Blehrg.Pi);
                                                            System.out.println("o volume  do cubo é  " + volumeCilindro);
                                                                    
                                        
                                                            }
                
                
        }
        


    }
}
}
