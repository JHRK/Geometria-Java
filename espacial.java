public class espacial extends geometriaMain {

    double areaCubo;
    double volumeCubo;
    double areaEsfera;
    double volumeEsfera;
    double areaParalelepipedo;
    double volumeParalelepipedo;
    double areaPrismaHexagonal;
    double volumePrismaHexagonal;
    double aresta;
    double arestax;
    double arestay;
    double arestaz;
    double area1;
    double area2;
    double area3;
    double areaPrismaTriangular;
    double volumePrismaTriangular;
    double areaCilindro;
    double volumeCilindro;
    double areaCone;
    double volumeCone;
    double areaPiramide;
    double volumePiramide;
    double geratriz;
    double pitagoras;

    public Double getPi(){
        return this.Pi;
    }

    public Double PegarRaioMaior(){
        return this.R;
    }

    public Double getAltura(){
        return this.H;
    }

    public Double getVolume(){
        return this.V;
    }

    public Double getAB(){
        return this.AB;
    }

    public Double getAL(){
        return this.AL;
    }

    public Double PegarRaioMenor(){
        return this.r;
    }



    public Double calcularAreaCubo(){
        areaCubo = (aresta*aresta)*6;
        return this.calcularAreaCubo();
    }

    public Double calcularVolumeCubo(){
        volumeCubo = Math.pow(aresta, 3);
        return this.calcularVolumeCubo();
    }
    
    public Double calcularAreaEsfera(){
        areaEsfera = 4*Pi*raio;
        return this.calcularAreaCubo();
    }

    public Double calcularVolumeEsfera(){
        volumeEsfera = 4*(Pi*Math.pow(raio,3))/3;
        return this.calcularVolumeCubo();
    }

    public Double calcularAreaParalelepipedo(){
        area1 = arestax * arestay;
        area2 = arestay * arestaz;
        area3 = arestaz * arestax;
        areaParalelepipedo = 2*area1 + 2*area2 + 2*area3;
        return this.calcularAreaParalelepipedo();
    }

    public Double calcularVolumeParalelepipedo(){
        volumeParalelepipedo = arestax*arestay*arestaz;
        return this.calcularVolumeParalelepipedo();
    }

    public Double calcularAreaPrismaTriangular(){
        AB = (Math.pow(arestax, 2)*Math.sqrt(3))/4;
        AL = 3*(arestax*arestay);
        areaPrismaTriangular = 2*AB+AL;
        return this.calcularAreaPrismaTriangular();
    }

    public Double calcularVolumePrismaTriangular(){
        AB = (Math.pow(arestax, 2)*Math.sqrt(3))/4;
        volumePrismaTriangular = AB*H;
        return this.calcularVolumePrismaTriangular();
    }

    public Double calcularAreaCilindro(){
        AB = Math.pow(arestax, 2)*Pi;
        AL = 2*(arestax*Pi*H);
        areaCilindro = 2*AB+AL;
        return this.calcularAreaCilindro();
    }

    public Double calcularVolumeCilindro(){
        AB = Math.pow(arestax, 2)*Pi;
        volumeCilindro = AB*H;
        return this.calcularVolumeCilindro();
    }

    public Double calcularAreaPrismaHexagonal(){
        AB = 6*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        AL = 6*(arestax*H);
        areaPrismaHexagonal = 2*AB+AL;
        return this.calcularAreaPrismaHexagonal();
    }

    public Double calcularVolumePrismaHexagonal(){
        AB = 6*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        volumePrismaHexagonal = AB*H;
        return this.calcularVolumePrismaHexagonal();
    }
    
    public Double calcularAreaCone(){
        pitagoras = Math.pow(arestay, 2) + Math.pow(arestaz, 2);
        geratriz = Math.sqrt(pitagoras);
        AL = (geratriz*Pi*raio);
        AB = Math.pow(arestax, 2)*Pi;
        areaCone = AB + AL;
        return this.calcularAreaCone();
    }

    public Double calcularVolumeCone(){
        volumeCilindro = (Math.pow(raio, 2)*H*Pi)/3;  
        return this.calcularVolumeCone();
    }

    public Double calcularAreaPiramide(){
        AL = laterais*((0.5*arestax)*H);
        AB = laterais*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        areaPiramide = AB+AL;
        return this.calcularAreaPiramide();
    }

    public Double calcularVolumePiramide(){
        AB = laterais*((Math.pow(arestax, 2)*Math.sqrt(3))/4);
        volumePiramide = (AB*H)/3;
        return this.calcularVolumePiramide();
    }

    public static void main(String[] args) {


    }

}
