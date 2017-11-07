# Flash-Android
This library is for easily making flash screen using fragments


First set up the fragments.
-> flash.setFragments(R.id.frame, new FlashFragment(), new MainFragment());

Optional: Changing flash time. (1000 = 1 sec) Default is 1400
-> flash.setFlashTime(3000);

Lastly. 
-> flash.startFlashing();





