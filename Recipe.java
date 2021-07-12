import java.util.*;

class Recipe{
    public String cuisine, Type, link, name;
    public HashMap<String,Double> ingList= new HashMap<String,Double>();

    Recipe(String cc, String mainType, String dispn, String urlink, String ili[], double ilnum[]){
        cuisine= cc;
        Type= mainType;
        name= dispn;
        link= urlink;
        for(int i=0; i<ili.length; i++){
            ingList.put(ili[i], ilnum[i]);
        }
    }

    //void info(){
        //System.out.println("Dish name: "+ name);
        //System.out.println("Dish type: "+ Type);
        //System.out.println("Cuisine: "+ cuisine);
        //System.out.println("Ingredients required:");
        //req();
    //}

    //void req() {
        //for(Map.Entry<String, Double> i:ingList.entrySet()){    
            //if (i.getValue()==0.0) { System.out.println(i.getKey()+" -- per taste"); }
            //else { System.out.println(i.getKey()+" -- "+i.getValue()); } 
        //}
    //}

    double match(HashMap<String, Double> User) {
        double match=0;
        for(Map.Entry<String, Double> i:ingList.entrySet()) {
            for(Map.Entry<String, Double> j:User.entrySet()) {
                if(i.getKey().equals(j.getKey()) && j.getValue()>=i.getValue()) match++;
            }
        }
        return match;
    }
}