public class MainRoutine {
    static Terrain[][] map = new Terrain[10][50];
    static Player player;

    public static void main(String[] args){
        //initializing map
        for(int r = 0; r < map.length; r++){
            for(int c = 0; c < map[0].length; c++){
                double rand = Math.random();
                if(rand < 0.25){//25% for Grass
                    map[r][c] = new Grass();
                }else if(rand < 0.5){//25% for Forest
                    map[r][c] = new Forest();
                }else if(rand < 0.7){//20% for River
                    map[r][c] = new River();
                }else if(rand < 0.9){//20% for Sand
                    map[r][c] = new Sand();
                }else if(rand < 0.98){//8% for Town
                    map[r][c] = new Town();
                }else{//2% for Tar_Lands
                    map[r][c] = new Tar_Lands();
                }
            }
        }

        double rand = Math.random();
        if(rand < 0.33){
            player = new Human();
        }else if(rand < 0.67){
            player = new Orc();
        }else{
            player = new Lizardman();
        }

        int x = 0;
        int y = 5;
        int distanceTraveled = 0;
        boolean stillAlive = true;

        while(stillAlive && distanceTraveled < map[0].length - 1){
            x++;
            distanceTraveled++;
            stillAlive = player.enter(map[y][x]);
        }

        if(stillAlive){
            System.out.println("Yay! You're still alive!");
        }else{
            System.out.println("You have died :(");
        }

        System.out.println("You have traveled " + distanceTraveled);
    }
//edit 1
}
