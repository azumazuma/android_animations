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



License
-------
