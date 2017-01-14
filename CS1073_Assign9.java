/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: To test the Online retail system
 * Input: None, except the hardcoded test values
 * Output: Products and their information
 */
package cs1073_assign9;

public class CS1073_Assign9 {
    public static void main(String[] args) {
        //Repeat the below statement for every product!
        
        try
        {
            Book Tril = new Book(false, "Michael McCloskey", 308, 9.00, 2011,
            "The Trilisk Ruins", "97814663 93844", 12.50, 308,15, 
            new UserRating("blindFerret",4.5,	
"Fast action space opera with good character development and alien species. Enjoyed it very much and look forward to continuing the series."),
            new UserRating("NMGardner",4.25,"McCloskey's ability to describe an environment from an alien perspective made for a great story line. Imagine a culture that communicates with entirely different senses and a really alien value set. Includes good high-tech sci fi. Overall it was a great read. Looking for more."));
        
        System.out.println(Tril+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException Dad)//I've always wanted to play catch with Dad
        {
            System.out.println("Entry 1 could not be processed. Please re-enter in a later session\n"+Dad+"\n");
        }//That was a joke, I have a real father who would love to play catch with me, but I spend all my time on my computer...

        try
        {
            Book Hungry = new Book(true, "Suzanne Collins", 384, 13.00, 2008,
            "The Hunger Games","4390234", 19.75, 584 ,7, 
            new UserRating("RoseMarie",4.5,
"Have read and re-read these books. I love how Mrs Collins lets us see through the eyes of her heroine. We can feel her anger, fear, love and confusion as she is swept up into a \"game\" that changes the lives of a nation forever."),
            new UserRating("BLWagner",5.0,"The Hunger Games (Trilogy) is one of the most \"unputdownable\" books to enter the market in a long time. The cliffhangers at the end of each volume are so intense, you can't help but continue on."));
        
        System.out.println(Hungry+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException NoFun)//See, no joke this time!
        {
            System.out.println("Entry 2 could not be processed. Please re-enter in a later session\n"+NoFun+"\n");
        }
        
        try
        {
            Book Never = new Book(false, "Neil Gaiman", 400, 18.35,1997,
            "Neverwhere","84991895", 26.25, -10 ,-17, 
            new UserRating("jwood",4.5,"This story of a common man, so common as to be ordinary, thrown into a dangerous world so close to his home that he recognises street names and train stops, yet so different as to leave him completely overwhelmed and lost"),
            new UserRating("ARamie",4.8,"Neverwhere by Neil Gaiman is a roller-coaster ride through a fantastical nightmare. In the beginning, the main character is just boring enough to be a charming every-man. By the end, he’s a champion, but he doesn’t lose his self-deprecating naivete."));
        
        System.out.println(Never+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 3 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            PC StarManEpisodeIIIRememberSeth = new PC("OS:Windows Vista®/XP, Windows 7, Windows 8\n" +
"\n" +
"Processor:Intel® CoreTM2 Duo 2.4 Ghz or better, AMD Athlon™ X2 2.8 Ghz or better\n" +
"\n" +
"Memory:2 GB RAM\n" +
"\n" +
"Graphics:NVIDIA® GeForce® 8800GTS or better, ATI Radeon™ HD 3850 or better\n" +
"\n" +
"Hard Drive:9 GB HD space\n" +
"\n" +
"Sound:Standard audio device\n" +
"\n" +
"Other Requirements:Broadband Internet connection", false, "action", AgeRating.Mature, 2013, 15.00,
            "Remember Me", "11958742", 30.00, 0.01,7,
            new UserRating("TopHATWaffle",4.75,"This is a great game with a very interesting, fresh, story. Don't go in expecting and amazing combat system, but it'll do for this game. Constantly got chills down my spine. Come for the world and story, stay for punching and kicking faces into the ground."),
            new UserRating("Val",4.3,"A solid game with decent fight mechanics, impressive areas and an outstanding soundtrack."));
        
        System.out.println(StarManEpisodeIIIRememberSeth+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 4 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            PC PCRPG = new PC("OS: Windows XP SP3 / Windows Vista SP2 / Windows 7 SP1\n" +
"\n" +
"Processor: 2.2GHz Intel Core 2 Duo or 2.6GHz AMD Athlon 64 X2 5000+\n" +
"\n" +
"Memory: 1 GB RAM for Windows XP / 2 GB Windows Vista and Windows 7\n" +
"\n" +
"Hard Disk Space: 10.5 GB\n" +
"\n" +
"Video: NVIDIA GeForce 8800 / 512MB RAM or better, ATI Radeon HD3850 / 512MB RAM (with Pixel Shader 3.0 support), 1280x720 minimum supported resolution\n" +
"\n" +
"Sound: DirectX 9.0c compatible\n" +
"\n" +
"DirectX®: DirectX 9.0c", true, "Role Playing Game", AgeRating.Mature, 2012, 10.00,
            "Kingdoms of Amalur", "95627341", 20.00, 200,25,
            new UserRating("shep7000",4.0,"Great game, spent a lot of time on quests. Stable, good looking and nice voiceover. It felt a bit tedious at certain points but at the end it was a great experience."),
            new UserRating("arcanius23",4.25,"Easily one of the best RPG games available, I'd strongly reccomend picking it up if you want a game that you can play offline for quite literally days."));
       
        System.out.println(PCRPG+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 5 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            PC TheEighties = new PC("OS: Windows® XP (SP3) / Windows Vista® (SP2) / Windows® 7 (SP1) / Windows® 8\n" +
"\n" +
"Processor: 2.66 GHz Intel® Core™2 Duo E6700 or 3.00 GHz AMD Athlon™ 64 X2 6000+\n" +
"\n" +
"Memory: 2 GB\n" +
"\n" +
"Graphics: 512 MB DirectX® 9.0c–compliant\n" +
"\n" +
"DirectX®: DirectX® 9.0c\n" +
"\n" +
"Hard Drive: 3 GB HD space\n" +
"\n" +
"Sound: DirectX 9.0c–compliant\n" +
"\n" +
"Perpherals Support: Windows-compatible keyboard, mouse, optional controller\n" +
"\n" +
"Requires a UPlay account.", false, "Shooter", AgeRating.Mature, 2013, 5.00,
            "FarCry 3: Blood Dragon", "59674387", 15.00, 0.01,56,
            new UserRating("Artorius",4.5,"They put every 80s action movie trope into one videogame and just ran with it.\n" +
"\n" +
"I F***Ing Love Whoever Did This, I Want Moar Dammit!!!!"),
            new UserRating("cts.cobra",5.0,"OMFG this game is so awesome :) , I usually hate Far cry games but this game is just so 80's + 90's .\n" +
"\n" +
"I had so much fun playing and seeing all those puns that I adore from trash movies.\n" +
"\n" +
"The soundtrack is best I heard in long time , I even listen to it in my car."));
        
        System.out.println(TheEighties+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 6 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            Console Smash = new Console(Type.Wii, "Fighting", AgeRating.Everyone, 2014, 20.00,
            "Super Smash Bros. for Wii U", "06932587", 60.00, 200,10,
                    //Because there were no comments for it in the test data, I put in my own reviews...
            new UserRating("rewkol",4.8,"Definitely the pinnacle of the series. Sakurai and his team put everything into this game and it really shows. The only real downgrade from Brawl is the soundtrack is more rips and less awesome remixes, but hey at over 500 songs they can afford that convienience."),
            new UserRating("SmashFan1337",8.9,"BEST GAME EVAR!\n\nWhere else can you see Mario, Sonic, Megaman, Pacman, Ryu, and Cloud all fight each other!"));
        
        System.out.println(Smash+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 7 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            Console HighPolyAssets = new Console(Type.Playstation, "Action", AgeRating.Mature, 2016, 25.00,
            "Rise of the Tomb Raider", "9765487", 55.00, 200,27,
            new UserRating("D.Fischer",4.25,"Beautiful graphics and scenery. Great game play. Good storyline."),
            new UserRating("S.Profitt",4.6,"I waited so long for this game to come out on PS4 , it's finally here and I am not disappointed. Great game with absolutely gorgeous graphics and fun gameplay. Worth every penny and I paid"));
        
        System.out.println(HighPolyAssets+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 8 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
        try
        {
            Console CoolGameApparently = new Console(Type.Xbox, "shooter", AgeRating.Teen, 2016, 30.00,
            "Overwatch", "12345687", -56, 200,-5,
            new UserRating("n00b",5.0,"So Hooked on this game. All the characters seem balanced and add strenght to the team."),
            new UserRating("coffeeezombie",5.0,"I'm a 32 year old mom with 4 kids and we all love video games (my husband too!). I'm also a huge Blizz fan ;) anyway, we all love this game. It's fun to play for a quick fix. I love the PvP aspect of it, and I love that you play on teams and not just \"everybody kill everybody!!\"."));
        
        System.out.println(CoolGameApparently+"\n");
        }
        catch(InvalidNumberException |InvalidLengthException | StockBelowZeroException e)
        {
            System.out.println("Entry 9 could not be processed. Please re-enter in a later session\n"+e+"\n");
        }
        
    }
    
}
