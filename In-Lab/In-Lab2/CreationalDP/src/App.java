public class App 
    {
            public static void main(String[] args) 
        {
            // Singleton pattern: Manage game state
            GameState gameState = GameState.getInstance();
            gameState.setCurrentLevel(1);
            gameState.setDifficulty("Easy");
    
            // Factory Method pattern: Create different types of enemies
            EnemyFactory enemyFactory;
            if (gameState.getCurrentLevel() == 1) {
                enemyFactory = new ZombieFactory();
            } else {
                enemyFactory = new VampireFactory();
            }
            Enemy enemy = enemyFactory.createEnemy();
            enemy.attack();
    
            // Abstract Factory pattern: Create weapons and power-ups
            AbstractFactory levelFactory;
            if (gameState.getDifficulty().equals("Easy")) {
                levelFactory = new EasyLevelFactory();
            } else {
                levelFactory = new HardLevelFactory();
            }
            Weapon weapon = levelFactory.createWeapon();
            PowerUp powerUp = levelFactory.createPowerUp();
    
            weapon.use();
            powerUp.apply();
    
            // Update game state
            gameState.setScore(100);
            gameState.setCurrentLevel(2);
            System.out.println("Game State: Level - " + gameState.getCurrentLevel() + ", Score - " + gameState.getScore());
        }
    
    
    }

