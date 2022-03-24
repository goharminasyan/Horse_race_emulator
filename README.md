# Horse_race_emulator
Implemented horse race emulators using
1. XML configuration, 
2. Annotation configuration,
3. Java configuration

 Required beans:
 
• HorseService for horse management (horses with their riders, breeds and other characteristics are obtained from the configuration)
 
• RaceService for simple getRace() method which generates and returns information about the upcoming race

• EmulatinService for real-time race emulation (it generates data about horses positions on the console for every 9 second)

Main domain objects: Horse, Race. 

In client code:

• On start-up application shows the information about upcoming race.
	
• After that a race emulation starts
	
(Nothing super-fancy in UI, just console application)!
