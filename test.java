import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class test implements ActionListener, ListSelectionListener {  
    static String[] ili= new String[]{"Agar", "All-Purpose Flour", "Almond", "Almond Milk", "Apple", "Bacon", "Baijiu", "Baking Powder", "Balsamic Vinegar", "Black Vinegar", "Bread", "Butter", "Cardamom", "Chicken", "Chicken Stock", "Chili Bean Paste", "Chili Oil", "Chili Powder", "Cinnamon Stick", "Cloves", "Cornflour", "Cream of Tartar", "Egg", "Fermented Black Bean", "Fish", "Flavored Oil", "Garlic", "Garlic Powder", "Ginger", "Green Onion", "Ground Pork", "Ham", "Heavy Cream", "Lemon", "Mayonnaise", "Milk", "Mozzarella Cheese", "Olive Oil", "Orange", "Parmesan Cheese", "Parsley", "Pepper", "Peppercorn", "Pickled Chili", "Pickled Ginger", "Potato", "Ricotta Cheese", "Rosemary", "Sage", "Salt", "Sesame Paste", "Sesame Seed", "Sichuan Peppercorn Powder", "Soy Sauce", "Star Anise", "Sugar", "Tea Leaves", "Thyme", "Tofu", "Tomato", "Vanilla Essence", "Water"};
    static String[] rli= new String[]{"Almond Tofu", "Apple Cider", "Carbonara Toast", "Croque Monsieur", "Jueyun Chili Chicken", "Lighter Than Air Pancakes", "Mapo Tofu", "Parmesan Potato Stacks", "Ricotta Cheese Caprese", "Sunshine Sprat"};

    static String[] iSS= new String[]{"Fish", "Olive Oil", "Butter", "Sage", "Thyme", "Rosemary", "Parsley", "Lemon", "Salt"};
    static double[] nSS= new double[]{2, 0.5, 0.5, 2, 4, 2, 4, 0, 0};
    static Recipe SS= new Recipe("??", "Main", "Sunshine Sprat", "https://youtu.be/01b4zCreeqE", iSS, nSS);

    static String[] iPC= new String[]{"Egg", "Sugar", "Cornflour", "Vanilla Essence", "Tea Leaves", "Milk", "Olive Oil", "All-Purpose Flour", "Baking Powder", "Salt", "Cream of Tartar"};
    static double[] nPC= new double[]{6, 3.5, 1, 1, 2, 4, 1, 3, 1, 0.2, 0.25};
    static Recipe PC= new Recipe("??", "Main", "Lighter Than Air Pancakes", "https://youtu.be/QpJsd7cIWDc", iPC, nPC);

    static String[] iAT= new String[]{"Almond", "Almond Milk", "Water", "Heavy Cream", "Sugar", "Agar"};
    static double[] nAT= new double[]{10, 2, 3, 1, 2, 4};
    static Recipe AT= new Recipe("??", "Dessert", "Almond Tofu", "https://youtu.be/VtkJX-T0ol8", iAT, nAT);

    static String[] iAC= new String[]{"Apple", "Orange", "Ginger", "Cinnamon Stick", "Cloves", "Water"};
    static double[] nAC= new double[]{6, 1, 2, 2, 1, 0.25, 2};
    static Recipe AC= new Recipe("??", "Beverage", "Apple Cider", "https://youtu.be/Ia8dFOpl8r8", iAC, nAC);

    static String[] iMT= new String[]{"Water", "Baijiu", "Salt", "Sugar", "Chili Powder", "Peppercorn", "Tofu", "Ground Pork", "Pickled Chili", "Pickled Ginger", "Chili Bean Paste", "Fermented Black Bean", "Soy Sauce", "Chicken Stock", "Sichuan Peppercorn Powder", "Green Onion"};
    static double[] nMT= new double[]{1, 2, 1, 0, 10, 5, 400, 100, 15, 10, 1, 1, 1, 500, 1, 0};
    static Recipe MT= new Recipe("Chinese", "Main", "Mapo Tofu", "", iMT, nMT);

    static String[] iJCC= new String[]{"Chicken", "Green Onion", "Ginger", "Cardamom", "Star Anise", "Salt", "Chili Powder", "Sichuan Peppercorn Powder", "Sesame Seed", "Flavored Oil", "Garlic", "Sesame Paste", "Chicken Stock", "Soy Sauce", "Black Vinegar", "Sugar", "Chili Oil"};
    static double[] nJCC= new double[]{2, 3 , 6 , 1, 3, 2, 5, 2, 2, 2, 4,1, 0.25,1, 1, 1, 0.5};
    static Recipe JCC= new Recipe("Chinese", "Main", "Jueyun Chili Chicken", "https://youtu.be/H2pIC8g_bck", iJCC, nJCC);

    static String[] iCT= new String[]{"Bread", "Mayonnaise", "Bacon", "Egg", "Mozzarella Cheese", "Parsley", "Pepper"};
    static double[] nCT= new double[]{1, 1, 1, 2, 0, 0, 1};
    static Recipe CT= new Recipe("Korean", "Main", "Carbonara Toast", "https://youtu.be/xnGwmd3QFPU", iCT, nCT);

    static String[] iPPS= new String[]{"Potato", "Butter", "Parmesan Cheese", "Garlic Powder", "Salt", "Pepper", "Parsley"};
    static double[] nPPS= new double[]{4, 20, 15, 2, 0, 0, 0};
    static Recipe PPS= new Recipe("??", "Appetizer", "Parmesan Potato Stacks", "https://youtu.be/Yt3ihw_-JG4", iPPS, nPPS);

    static String[] iRCC= new String[]{"Tomato", "Ricotta Cheese", "Balsamic Vinegar", "Olive Oil", "Sugar"};
    static double[] nRCC= new double[]{2, 1, 2, 1, 1};
    static Recipe RCC= new Recipe("Italian", "Appetizer", "Ricotta Cheese Caprese", "https://youtu.be/40-pK0dDyfw", iRCC, nRCC);

    static String[] iCM= new String[]{"Bread", "Salt", "Pepper", "Parsley", "Ham", "Mozzarella Cheese", "All-Purpose Flour", "Butter", "Milk"};
    static double[] nCM= new double[]{4, 0, 0, 0, 2, 0, 20, 20, 200};
    static Recipe CM= new Recipe("French", "Appetizer", "Croque Monsieur", "https://youtu.be/ks1e4wQJ-nc", iCM, nCM);

    static Recipe[] rli2= new Recipe[]{SS, PC, AT, AC, MT, JCC, CT, PPS, RCC, CM};
    static HashMap<String, Double> User= new HashMap<String,Double>();

    public test() {
        JFrame f= new JFrame("foodLibrary 2.0");  
        JLabel l1=new JLabel("Welcome to foodLibrary!"); 
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        l1.setFont(mm);
        l1.setBounds(120, 1, 500, 500);  

        JButton add=new JButton("Add Items");
        add.setBounds(60, 300, 100, 25);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add works");
                test A= new test(1);
            }

        }); 

        JButton rem= new JButton("Remove Items");
        rem.setBounds(175, 300, 120, 25);
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("rem works~");
                rem();
            }

        });

        JButton view= new JButton("View Pantry");
        view.setBounds(310, 300, 100, 25);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("view works");
                test A= new test(3);
            }

        }); 

        JButton search= new JButton("Search");
        search.setBounds(60, 340, 100, 25);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ser works");
                search();
            }

        }); 

        JButton il= new JButton("Ingredient List");
        il.setBounds(175, 340, 120, 25);
        il.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("il works");
                viewi();
            }

        }); 

        JButton rl= new JButton("Dish List");
        rl.setBounds(310, 340, 100, 25);
        rl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("rl works");
                viewd();
            }

        }); 

        f.add(l1); f.add(add); f.add(rem); f.add(view); f.add(search); f.add(il); f.add(rl);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);
    }

    String ing; double amt;
    public test(int opt) {
        JFrame f= new JFrame("foodLibrary 2.0");  
        String msg="";
        JLabel l1= new JLabel();
        JButton sel= new JButton("Select");
        sel.setBounds(250, 297, 100, 25);     
        switch(opt){
            case 1: {
                JLabel l2=new JLabel();  
                l2.setBounds(80, 340, 500, 20);  
                f.add(l2);
                msg= "Select item to add";
                JComboBox<String> lis= new JComboBox<String>(ili);
                lis.setBounds(80, 300, 150, 20);
                f.add(lis);
                JTextArea num= new JTextArea();
                num.setBounds(80, 340, 150, 20);
                JButton conf= new JButton("Add");
                conf.setBounds(250, 337, 100, 25);
                num.setVisible(false);
                conf.setVisible(false);
                sel.addActionListener(new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {       
                        ing= (lis.getItemAt(lis.getSelectedIndex())).toString();
                        num.setVisible(true);  
                        conf.setVisible(true);
                        l2.setVisible(false);
            }  
            }); 
                conf.addActionListener(new ActionListener() {  
                    public void actionPerformed(ActionEvent e) {       
                        try { 
                            amt= Double.parseDouble(num.getText());
                            System.out.println(ing);
                            if (User.containsKey(ing)) l2.setText("That item is already in your pantry!");
                            else {
                                l2.setText(ing+" ("+Double.toString(amt)+") added to inventory!");
                                User.put(ing, amt);
                            }
                        }
                        catch (NumberFormatException E) { l2.setText("Enter a valid amount!"); }
                        num.setVisible(false);
                        conf.setVisible(false);
                        l2.setVisible(true);


            }  
            });  
                l1.setBounds(140, 1, 500, 500);
                f.add(sel);
                f.add(num); 
                f.add(conf);        
                break;
            }

            case 3: {
                msg= "Current Inventory";
                String pantry[][]= new String[100][2];
                int a=0;
                for(Map.Entry<String, Double> i:User.entrySet()){
                    pantry[a][0]= i.getKey();
                    pantry[a][1]= Double.toString(i.getValue());
                    a++;
                }
                String column[]= new String[]{"Ingredient", "Amount"};
                JTable inv=new JTable(pantry, column);
                inv.setBounds(17, 80, 450, 550); 
                f.add(inv);
                l1.setBounds(140, 1, 500, 100);
                break;
                
            }
        }
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        l1.setFont(mm);
        l1.setText(msg);
        f.add(l1);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);
    }

    public void rem() {
        JFrame f= new JFrame("foodLibrary 2.0");  
        JLabel l1= new JLabel("Remove Ingredients");
        JButton sel= new JButton("Select");
        sel.setBounds(250, 297, 100, 25);
        JLabel l2=new JLabel();  
        l2.setBounds(80, 340, 500, 20);  
        f.add(l2);
        String[] name= new String[100];
        //double[] amt= new double[]{};
        int a=0;
        for(Map.Entry<String, Double> i:User.entrySet()){
            name[a++]=i.getKey();
            //amt[a++]=i.getValue();
        }
        JComboBox<String> lis= new JComboBox<String>(name);
        lis.setBounds(80, 300, 150, 20);
        f.add(lis);
        JTextArea num= new JTextArea();
        num.setBounds(80, 340, 150, 20);
        JButton conf= new JButton("Remove");
        conf.setBounds(250, 337, 100, 25);
        num.setVisible(false);
        conf.setVisible(false);
        sel.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {
            ing= (lis.getItemAt(lis.getSelectedIndex())).toString();
            num.setVisible(true);
            conf.setVisible(true);
            l2.setVisible(false);
            }  
        }); 
        conf.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
                try { amt= Double.parseDouble(num.getText()); }
                catch (NumberFormatException E) { amt=0; }
                System.out.println(ing);
                num.setVisible(false);
                conf.setVisible(false);
                if(amt==0) { l2.setText("Enter a valid amount!"); }
                else if(User.get(ing)-amt>0) { User.put(ing, (User.get(ing)-amt)); l2.setText("Changes made to inventory!"); }
                else if(User.get(ing)-amt==0) { User.remove(ing); l2.setText("Changes made to inventory!"); }
                
                l2.setVisible(true);
            }  
        });  
        l1.setBounds(140, 1, 500, 500);
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        l1.setFont(mm);
        f.add(l1);
        f.add(sel);
        f.add(num); 
        f.add(conf);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true); 

    }

    public void viewi(){
        JFrame f= new JFrame("foodLibrary 2.0");
        JLabel header= new JLabel("Available Ingredients");
        JLabel entry= new JLabel();
        DefaultListModel<String> inlist= new DefaultListModel<String>();
        for(int i=0; i<ili.length; i++){
            inlist.addElement(ili[i]);
        }
        JList<String> list = new JList<String>(inlist);
        list.setVisibleRowCount(-1);
        JScrollPane sc = new JScrollPane(list);
        sc.setBounds(450,100, 19, 100);
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        header.setFont(mm);
        header.setBounds(140, 1, 500, 100);
        sc.setViewportView(list);
        sc.setBounds(17, 80, 450, 550);
        f.add(sc);
        f.add(header);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);

    }

    public void viewd(){
        JFrame f= new JFrame("foodLibrary 2.0");
        JLabel header= new JLabel("Available Recipes");
        JLabel entry= new JLabel();
        JButton view= new JButton("View");
        DefaultListModel<String> inlist= new DefaultListModel<String>();
        for(int i=0; i<rli.length; i++){
            inlist.addElement(rli[i]);
        }
        JList<String> list = new JList<String>(inlist);
        list.setVisibleRowCount(-1);
        JScrollPane sc = new JScrollPane(list);
        sc.setBounds(450,100, 19, 100);
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        header.setFont(mm);
        header.setBounds(140, 1, 500, 100);
        sc.setViewportView(list);
        sc.setBounds(17, 80, 450, 500);
        view.setBounds(385, 590, 80, 25);
        f.add(view);

        view.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
                String name= list.getSelectedValue();
                dishinfo(name);
            }
        });
        f.add(sc);
        f.add(header);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);

    }

    public void search() {
        JFrame f= new JFrame("foodLibrary 2.0");
        JLabel header= new JLabel("Search for dishes using existing pantry");
        JLabel enmsg= new JLabel("Enter match% criteria: ");
        JButton conf= new JButton("Search");
        enmsg.setBounds(40, 50, 500, 100);
        Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
        header.setFont(mm);
        header.setBounds(55, 1, 500, 100);
        JTextArea num= new JTextArea();
        num.setBounds(180, 92, 80, 20);
        conf.setBounds(280, 91, 100, 25);
        f.add(conf);
        JLabel ermsg= new JLabel("Please enter a valid amount"); ermsg.setBounds(150, 120, 200, 25); f.add(ermsg); ermsg.setVisible(false); 
        
        conf.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {
                System.out.println("triggered 1");
                try { amt= Double.parseDouble(num.getText()); }
                catch (NumberFormatException E) { amt=-1; System.out.println("Triggered catch"); ermsg.setVisible(true); }
                //JLabel l2= new JLabel();
                if(amt>=0) {
                    ermsg.setVisible(false);
                    HashMap<String, Double> H= totalret(amt);
                    String match[][]= new String[100][2];
                    int a=0;
                    for(Map.Entry<String, Double> i:H.entrySet()){
                        match[a][0]= i.getKey();
                        match[a][1]= Double.toString(i.getValue());
                        a++;
                    }
                String column[]= new String[]{"Dish", "Match %"};
                JTable inv=new JTable(match, column);
                inv.setBounds(17, 80, 450, 550); 
                f.add(inv);
                num.setVisible(false);
                enmsg.setVisible(false);
                conf.setVisible(false);
            } 
        }
        });  
        
        f.add(num);
        f.add(enmsg);
        f.add(header);
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);

    }

    static HashMap<String, Double> totalret(double par) {
        HashMap<String, Double> reli= new HashMap<String, Double>();
        for (int i=0; i<rli2.length; i++) {
            double matchper= (rli2[i].match(User)/rli2[i].ingList.size())*100;
            if(matchper>=par) reli.put(rli2[i].name, matchper); //reli[a.seestat("name")]= matchper;
        }
        return reli;
    }

    static void dishinfo(String name) {
        JFrame f= new JFrame("foodLibrary 2.0");
        JLabel dname= new JLabel();
        JLabel type= new JLabel();
        JLabel cuisine= new JLabel();
        JLabel ilin= new JLabel("Ingredients required: ");
        Font sm= new Font(Font.SANS_SERIF, Font.PLAIN, 20);
        for(int i=0; i<rli2.length; i++){
            if(name.equals(rli2[i].name)) {
                dname.setText(rli2[i].name);
                Font mm= new Font(Font.SERIF, Font.PLAIN, 25);
                dname.setFont(mm);
                dname.setBounds(0, 40, 500, 40);
                dname.setHorizontalAlignment(JLabel.CENTER);

                type.setText("Dish Type: "+rli2[i].Type);
                type.setBounds(0, 100, 500, 40);
                type.setFont(sm);
                type.setHorizontalAlignment(JLabel.CENTER);

                cuisine.setText("Cuisine: "+rli2[i].cuisine);
                cuisine.setBounds(0, 130, 500, 40);
                cuisine.setFont(sm);
                cuisine.setHorizontalAlignment(JLabel.CENTER);


                String list[][]= new String[100][2];
                int n=0;
                for(Map.Entry<String, Double> a:rli2[i].ingList.entrySet()){
                    list[n][0]= a.getKey();
                    if(a.getValue()==0) { list[n][1]= "To taste"; }
                    else list[n][1]= Double.toString(a.getValue());
                    n++;
                }
                String column[]= new String[]{"Ingredient", "Amount"};
                JTable inv=new JTable(list, column);
                inv.setBounds(19, 180, 450, 450);
                f.add(dname);
                f.add(type);
                f.add(cuisine);
                f.add(ilin);
                f.add(inv);

            }
        }
        f.setSize(500, 700);  
        f.setLayout(null);  
        f.setVisible(true);
    }

    public static void main(String args[]) {
        test A= new test();        
    }  
}  
