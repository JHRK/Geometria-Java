public class espacial extends geometriaMain {


    public static double calcularAreaCubo(double aresta){
        double areaCubo = (aresta*aresta)*6;
        return areaCubo;
    }
    
        public static double calcularVolumeCubo(double aresta){
        double volumeCubo = Math.pow(aresta, 3);
        return volumeCubo;
    }
    
        public static double calcularAreaEsfera(double Pi, double raio){
        double areaEsfera = 4*Pi*raio;
        return areaEsfera;
    }
    
        public static double calcularVolumeEsfera(double Pi, double raio){
        double volumeEsfera = 4*(Pi*Math.pow(raio,3))/3;
        return volumeEsfera;
    }
    
        public static double calcularAreaParalelepipedo(double arestax, double arestay, double arestaz){
        double area1 = arestax * arestay;
        double area2 = arestay * arestaz;
        double area3 = arestaz * arestax;
        double areaParalelepipedo = 2*area1 + 2*area2 + 2*area3;
        return areaParalelepipedo;
    }
    
        public static double calcularVolumeParalelepipedo(double arestax, double arestay, double arestaz){
        double volumeParalelepipedo = arestax*arestay*arestaz;
        return volumeParalelepipedo;
    }

    
    public static double calcularAreaPrismaTriangular(double arestax, double arestay, double AB, double AL){
        AB = (Math.pow(arestax, 2)*Math.sqrt(3))/4;
        AL = 3*(arestax*arestay);
        double areaPrismaTriangular = 2*AB+AL;
        return areaPrismaTriangular;
    }

    public static double calcularVolumePrismaTriangular(double arestax, double AB, double H){
        AB = (Math.pow(arestax, 2)*Math.sqrt(3))/4;
        double volumePrismaTriangular = AB*H;
        return volumePrismaTriangular;
    }

    public static double calcularAreaCilindro(double arestax, double AB, double AL, double Pi, double H){
        AB = Math.pow(arestax, 2)*Pi;
        AL = 2*(arestax*Pi*H);
        double areaCilindro = 2*AB+AL;
        return areaCilindro;
    }

    public static double calcularVolumeCilindro(double arestax, double H, double AB, double Pi){
        AB = Math.pow(arestax, 2)*Pi;
        double volumeCilindro = AB*H;
        return volumeCilindro;
    }
    
    public static double calcularAreaPrismaHexagonal(double arestax, double H, double AB, double AL){
        AB = 6*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        AL = 6*(arestax*H);
        double areaPrismaHexagonal = 2*AB+AL;
        return areaPrismaHexagonal;
    } 

    public static double calcularVolumePrismaHexagonal(double arestax, double H, double AB){
        AB = 6*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        double volumePrismaHexagonal = AB*H;
        return volumePrismaHexagonal;
    }

    public static double calcularAreaCone(double arestay, double AB, double AL, double pitagoras, double geratriz, double Pi, double raio){
        pitagoras = Math.pow(arestay, 2) + Math.pow(raio, 2);
        geratriz = Math.sqrt(pitagoras);
        AL = (geratriz*Pi*raio);
        AB = Math.pow(raio, 2)*Pi;
        double areaCone = AB + AL;
        return areaCone;
    }

    public static double calcularVolumeCone(double raio, double Pi, double H){
        double volumeCone = (Math.pow(raio, 2)*H*Pi)/3;  
        return volumeCone;
    }
    
        public static double calcularAreaTroncoCone(double arestay, double AB, double AL, double pitagoras, double geratriz, double Pi, double raio,double ABM){
        pitagoras = Math.pow(arestay, 2) + Math.pow(raio, 2);
        geratriz = Math.sqrt(pitagoras);
        AL = (geratriz*Pi*raio);
        AB = Math.pow(raio, 2)*Pi;
        double areaTroncoCone = AB + AL;
        return areaTroncoCone;
    }

    public static double calcularVolumeTroncoCone(double R,double r, double Pi, double H){
        double volumeTroncoCone = ((1/3)*Pi*H)*(Math.pow(R, 2) * Math.pow(r, 2) * (R*r));  
        return volumeTroncoCone;
    }


    public static double calcularAreaPiramide(double arestax,double laterais, double AB, double AL, double H){
        AL = laterais*((0.5*arestax)*H);
        AB = laterais*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        double areaPiramide = AB+AL;
        return areaPiramide;
    }

    public static double calcularVolumePiramide(double arestax,double laterais, double AB, double H){
        AB = laterais*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        double volumePiramide = (AB*H)/3;
        return volumePiramide;
    }
    
        public static double calcularAreaTroncoPiramide(double arestax,double arestay, double AB, double AL, double H, double ABM){
        ABM = Math.pow(arestay,2);
        AB = Math.pow(arestax, 2);
        AL = ((arestax + arestay)*H)/2;
        double areaTroncoPiramide = AB + ABM + (AL*4);
        return areaTroncoPiramide;
    }

    public static double calcularVolumeTroncoPiramide(double arestax,double arestay, double AB, double H,double ABM){
        ABM = Math.pow(arestay,2);
        AB = Math.pow(arestax, 2);
        double volumeTroncoPiramide = (H/3)*(AB + ABM + (Math.sqrt(AB*ABM)));
        return volumeTroncoPiramide;
    }
}
