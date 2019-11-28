android_animation
============

![minSdkVersion](https://img.shields.io/badge/minSdkVersion-23-red.svg)
![targetSdkVersion](https://img.shields.io/badge/targetSdkVersion-29-red.svg)
![Kotlin](https://img.shields.io/badge/Kotlin-yellow.svg)

Easily add customized animations to Android View

 * A library with 65 animations customized
 * After animation, transitionX, transitionY, pivotX, povotY, rotation automatically return to the original position
 * If the size of the view is not fixed when starting the animation, it will not work

## Used

### Java

```java
{
    ImageView image = findViewById<ImageView>(R.id.image); // get View

    Shake().strength(image).start(); // animation start
}
```

### Kotlin
```kotlin
{
    val image: ImageView = findViewByID<ImageView>(R.id.image) // get View

    Shake().strength(image).start() // animation start
}
```

## Download

1. Add this to `build.gradle` of project gradle dependency

```groovy
allprojects {
	repositories {
		...
 		maven { url '' }
	}
}
```

2. Add this to `build.gradle` of app gradle dependency

```groovy
dependencies {
	implementation ''
}
```

## Sample


## Animation List

### Bound
|method name|used gif|
|---|---|
|inSideCenter|gif|
|inSideTop|gif|
|inSideTopLeft|gif|
|inSideTopRight|gif|
|inSideBottom|gif|
|inSideLeft|gif|
|inSideRight|gif|

### Door
|method name|used gif|
|---|---|
|topOpen|gif|
|topClose|gif|
|bottomOpen|gif|
|bottomClose|gif|
|leftOpen|gif|
|leftClose|gif|
|rightOpen|gif|
|rightClose|gif|

### Extend
|method name|used gif|
|---|---|
|widthSmall|gif|
|widthBig|gif|
|heightSmall|gif|
|heightBig|gif|
|small|gif|
|big|gif|

### Flash
|method name|used gif|
|---|---|
|week|gif|
|medium|gif|
|strength|gif|

### Roll
|method name|used gif|
|---|---|
|inSideTop|gif|
|outSideTop|gif|
|inSideBottom|gif|
|outSideBottom|gif|
|inSideLeft|gif|
|outSideLeft|gif|
|inSideRight|gif|
|outSideRight|gif|

### Shake
|method name|used gif|
|---|---|
|week|gif|
|medium|gif|
|strength|gif|

### Slip
|method name|used gif|
|---|---|
|inSideTop|gif|
|outSideTop|gif|
|inSideBottom|gif|
|outSideBottom|gif|
|inSideLeft|gif|
|outSideLeft|gif|
|inSideRight|gif|
|outSideRight|gif|

### Snap
|method name|used gif|
|---|---|
|inSideX|gif|
|outSideX|gif|
|inSideY|gif|
|outSideY|gif|

### Turn
|method name|used gif|
|---|---|
|inSide|gif|
|outSide|gif|
|inSideAxisTopLeft|gif|
|outSideAxisTopLeft|gif|
|inSideAxisTopRight|gif|
|outSideAxisTopRight|gif|
|inSideAxisBottomLeft|gif|
|outSideAxisBottomLeft|gif|
|inSideAxisBottomRight|gif|
|outSideAxisBottomRight|gif|

### Zoom
|method name|used gif|
|---|---|
|inSide|gif|
|outSide|gif|
|inSideTop|gif|
|outSideTop|gif|
|inSideBottom|gif|
|outSideBottom|gif|
|inSideLeft|gif|
|outSideLeft|gif|
|inSideRight|gif|
|outSideRight|gif|

License
-------
