package HomeWork_TQ;
/*
	1.There is an arraylist of song object { int song id , String songname , flaot volume } . 
	As song objects are added into list, volume variable of current object is increased by 2 .
	e.g. first song added will have volume 2 , second song will have volume 4 and so on.
	But the when volume becomes divisible by 3. It gets reduced by 50% for that song
	(current object). Again for next song onwards volume will increase by 2 and so on.
	Find out index of atleast one song object for which volume will be equal to or greater
	than 10 .
	You have to accept only song id and song name from user. Volume will be set as per
	above logic.
	e.g. first song added – 1 , ‘all is well’ , 2
	second song – 2 , ‘e vatan’ , 4
	third song - 3 , ‘lakshya to’ , 6 .. now this volume is divisible by 3 so. This song’s
	volume will be reduced by 50% so will become 3.
	Now next song will have volume 3+2 = 5 and so on . Again when volume becomes 9
	it will be reduced to 4.5.
*/

import java.util.ArrayList;
import java.util.Scanner;

class Song 
{
    int songId;
    String songName;
    float volume;

    Song(int songId, String songName, float volume) 
    {
        this.songId = songId;
        this.songName = songName;
        this.volume = volume;
    }

    @Override
    public String toString() 
    {
        return "[" + songId + ", " + songName + ", Volume: " + volume + "]";
    }
}

public class  Question_1
{
    public static void main(String[] args) 
    {
        ArrayList<Song> songList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        float currentVolume = 0;
        int indexWithVolumeAtLeast10 = -1;
        int index = 0;

        while(true) 
        {
            System.out.print("Enter Song ID (or -1 to stop): ");
            int id = scanner.nextInt();
            if(id == -1) break;

            scanner.nextLine(); // consume newline
            System.out.print("Enter Song Name: ");
            String name = scanner.nextLine();

            currentVolume += 2;

            if(currentVolume % 3 == 0) 
            {
                currentVolume = currentVolume / 2;
            }

            Song newSong = new Song(id, name, currentVolume);
            songList.add(newSong);

            if(currentVolume >= 10 && indexWithVolumeAtLeast10 == -1) 
            {
                indexWithVolumeAtLeast10 = index;
            }

            index++;
        }

        System.out.println("\n--- Songs Added ---");
        for(int i = 0; i < songList.size(); i++) 
        {
            System.out.println(i + ": " + songList.get(i));
        }

        	if(indexWithVolumeAtLeast10 != -1)
        	{
        		System.out.println("\n First index with volume >= 10 : " + indexWithVolumeAtLeast10);
        	} 
        	else 
        	{
        		System.out.println("\n No song has volume >= 10 ");
        	}

        scanner.close();
    }
}
