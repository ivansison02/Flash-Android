# Flash-Android
This library is for easily making flash screen using fragments


First set up the fragments.
-> How:  flash.setFragments(int frameLayout, Fragment flashFrag, Fragment mainFrag);
-> Example: flash.setFragments(R.id.frame, new FlashFragment(), new MainFragment());


Optional: Changing flash time. (1000 = 1 sec) Default is 1400
-> How: flash.setFlashTime(int time);
-> Example: flash.setFlashTime(3000);


Lastly. 
-> flash.startFlashing();





