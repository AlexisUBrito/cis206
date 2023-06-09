import java.util.LinkedList;
import java.util.List;

class Mountain{
    private String name;
    private String country;
    private double elevation;

    //-----------------Constructor----------------------------
    public Mountain(String Name, String Country, double Elevation){
        this.name = Name;
        this.country = Country;
        this.elevation = Elevation;
    }
    //--------------------Getters------------------------------
    public String getName(){
        return name;
    }
    
    public String getCountry(){
        return country;
    }
    
    public double getElev(){
        return elevation;
    }
    //---------------------Setters-----------------------------

    public void setName(String Name){
        this.name = Name;
    }
    public void setCountry(String Country){
        this.country = Country;
    }
    public void setElev(double Elevation){
        this.elevation = Elevation;
    }
    //---------------------feet to meters-----------------------------
    public double toMet() {
        return elevation / 3.2808;
    }
    
}

class main{

            //------------------Finding the minimum Elevation--------------------------------
    public static Mountain minimum(List<Mountain> Info){
        Mountain small = Info.get(0);

        for (Mountain moun : Info){
            if (moun.getElev() < small.getElev()){
                small = moun;
            }
        }
        return small;
    }
    public static void main(String[] args){
        
        Mountain min;
        List<Mountain> info = new LinkedList<>();
            info.add(new Mountain("Chimborazo", "Ecuador", 20549));
            info.add(new Mountain("Matterhorn", "Switzerland", 14692));
            info.add(new Mountain("Olympus", "Greece (Macedonia)", 9573));
            info.add(new Mountain("Everest", "Nepal", 29029));
            info.add(new Mountain("Mount Marcy - Adirondacks", "United States", 5344));
            info.add(new Mountain("Mount Mitchell - Blue Ridge", "United States", 6684));
            info.add(new Mountain("Zugspitze", "Switzerland", 9719));

        // Setting the Title
        System.out.printf("%-30s%-25s%-18s%s\n", "Mountain", "Country", "Elevation (ft)", "Elevation (m)");
        System.out.println("--------------------------------------------------------------------------------------"); 
    
        // Setting the Table
        for(Mountain mountain : info){
            System.out.printf("%-30s%-25s%-18s%.1f\n",mountain.getName(),mountain.getCountry(),mountain.getElev(),mountain.toMet());
        }

        min = minimum(info);

        System.out.println();
        System.out.println(min.getName() + " is the smallest mountain from the table with a total of " + min.getElev() + " ft Elevation");

    
    }
}