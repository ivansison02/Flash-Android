
# Flash-Android
This library is for easily making flash screen using fragments<br/>

<h2>Download</h2>

1. Add it in your root build.gradle at the end of repositories:<br/>
```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
   }
}
```
  
2. Add the dependency:<br />
```
dependencies {
   compile 'com.github.ivansison02:Flash-Android:-SNAPSHOT'
}
```

<h2>Instruction</h2>

1. Initializing the class.<br />
```
Flash flash = new Flash(this);
```

2. Setting up the fragments.<br />

<h4>XML:</h4>

```
<FrameLayout
        android:id="@+id/frame"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
/>
```

<h4>CODING:</h4>

```
//Note: You need two fragments. One for flash screen and the other, after the flash screen.
flash.setFragments(R.id.frame, new FlashFragment(), new MainFragment());
```

<i>(Optional) Changing the duration of flash time. (1000 = 1 sec) Default is 1400<br /><i/>
```
flash.setFlashTime(3000);
```
3. Lastly.<br />
```
flash.startFlashing();
```

