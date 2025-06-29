import java.util.Scanner;

public abstract class competitionAbs {

    protected String nameCompetition;
    protected String nombreTrofeo; 
    protected String trofeoAscci;
    protected int moneyReward;
    protected String qualificationAchievement;

    public competitionAbs(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la competicion:");
        String palabra = scanner.nextLine(); 
        nameCompetition = palabra;
        
        System.out.println("Ingrese el nombre del trofeo:");
        palabra = scanner.nextLine(); 
        nombreTrofeo = palabra;

        System.out.println("Ingrese el ascci del trofeo si lo tuviese:");
        String construyendoAscci = "";

        while (true) {

        String linea = scanner.nextLine(); 
        if (linea.isEmpty()) {

            break; //se acabo el ascci;
            
        }
        
        construyendoAscci = construyendoAscci + linea + "\n";
            
        }

        trofeoAscci = construyendoAscci;

        System.out.println("En el caso de que ganar la competicion habilite a jugar otra indique cuales");
        System.out.println("con un enter de por medio:");
        System.out.println("(Cuando termine deje la linea vacia)");
        String construyendoArchi = "";

        while (true) {

        String linea = scanner.nextLine(); 
        if (linea.isEmpty()) {

            break; //se acabo el ascci;
            
        }

        construyendoArchi = construyendoArchi + linea + "\n";

    }

        qualificationAchievement = construyendoArchi;


        System.out.println("Ingrese el premio monetario de la competicion:");
        int numero = scanner.nextInt();
        moneyReward = numero;


        scanner.close();       



    }

/*guardo el ascci de copa libertadores
 * 
 * 
                                               
                                                  
                            :                     
                           -                      
                          .:                      
                          =                       
                          =                       
                         :.                       
                         --                       
                       =====+                     
                   ===----=====+                  
                  +=--:.:-:-=====+                
                +++=--. .--------==               
               =*++==-:.::::::--:=++              
               ***=-:.  .     .::--=*  :*.        
          --= *#*+=--..        .:-::-:::#*        
          :-==*%%###*+++**+*++++++-+##*###        
          ##%#:#++#%#%@@@@%@@@@@@%#**   #         
           #   +--=*#*#%@@@%%@@@%*-:              
                --=+#@%####*#@@@#=:-              
                 -=+#@#+=====%%#+--               
                  =+*#*+-::==*#+=                 
                    ++++=--+==+                   
                        *::=                      
                        *--                       
                       ..-:                       
                       ..-:                       
                       .:-: =                     
                       :--: =                     
                       .:-: -                     
                       .:-: -                     
                       .:-- -                     
                       .:--.-                     
                       .:--.-                     
                      :::--:-                     
                      ::::=::                     
                      ::::--:-                    
                     ::--:-===-                   
                   ::::::---==::                  
               =---:::...:----:::-==              
            ****++=-:...........:.:--+*-          
           -****++=-:.....:.:.:::..--=+*          
           +++++====-:..:--------::-==+*          
          =+#***++=: . :         :..::=**         
          +*#***++=:.. :  .......:.:::+**         
          %%######*+==:--========+-=+***#%        
         #@%%%###*+... - .-...  .-:--++**##       
         #@%@%###*+....- .-...  .-:--++**##       
        =#@@%####*+-:::-:-=:::.::-==+**####       
        .#@%@%###*+....- .-...   ::--++#**#       
        =#@@@%####+:...-  -... ..:---+*#*#%       
        +#@%%##%#*+-:::-::=:::.::-==++*#*#%       
        =*@@@%##**+:.:.: .-...   :--=+*#+#%       
        =#@@@%#%#*+:::.-  =.:.  .--==+*#+#%       
        +%@@@####*+-:-:-:-=-:::::-=++**#*#@       
        =#@@@%*##*=..: - .=...  .:--==*#+*@       
        =#@@@%*##*=..-.- .=.:.  .---++*#**@       
        +%@@@####*+::-:-.:=:::..:-=+++*#**@       
        =%@@@#%##*+..:.: .=...  .:--=+*#++@       
        =#@@@%%##*+:::::  =.::...:-=++****@       
        *@@@@#%%#*+-:---.:+::::::==+**#%##@       
        *@@@@#%#*++-::::.:=::::::--=++%@%%@       
        +@@@@%%#*++-::::..=.-=-:---+*+@@%%@       
        #@@@@%@##**=-::-.:+:--:::-=+**@@%@@       
        %@@@@@@%@%%#**#*****#####%%%%@@@%@@       
        %@@@@@@@@%%#*###****#**##%%@%@@@@%@       
        @@@@@@@@@@@%#####******##%@@@@@@@@@       
        @@@@@@@@@@%###***########%%%@@@@@@@@      
        @@@@@@@@@@@%%#####***####%@@@@@@@@@@      
       %@@@@@@@@@@@###**********#%@@@@@@@@@@      
       @@@@@@@@@@@#***+++*+++****##%@@@@@@@@      
              +@@@%##*****+++****%@@#             
                                                  
                                                  
      */
                                                

}
