
# Flash-Android
This library is for easily making flash screen using fragments


1. Add it in your root build.gradle at the end of repositories:
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
2. Add the dependency:
  dependencies {
	        compile 'com.github.ivansison02:Flash-Android:-SNAPSHOT'
	}
  
  
Initializing the class.
-> Flash flash = new Flash(this);

Setting up the fragments.
-> flash.setFragments(R.id.frame, new FlashFragment(), new MainFragment());

Optional: Changing flash time. (1000 = 1 sec) Default is 1400
-> flash.setFlashTime(3000);

Lastly. 
-> flash.startFlashing();





>>>>>>> github/master
