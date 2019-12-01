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
 		maven { url 'http://azumazuma.github.io/android_animation/repository' }
	}
}
```

2. Add this to `build.gradle` of app gradle dependency

```groovy
dependencies {
	implementation 'com.azuma:android_animation:1.0.0'
}
```

## Sample
![result](https://github.com/azumazuma/android_animation/blob/master/images/Sample1.gif)

![result](https://github.com/azumazuma/android_animation/blob/master/images/Sample2.gif)

## Animation List

### Bound
|method name|used gif|
|---|---|
|inSideCenter|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideCenter.gif)|
|inSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideTop.gif)|
|inSideTopLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideTopLeft.gif)|
|inSideTopRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideTopRight.gif)|
|inSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideBottom.gif)|
|inSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideLeft.gif)|
|inSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Bound_inSideRight.gif)|

### Door
|method name|used gif|
|---|---|
|topOpen|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_topOpen.gif)|
|topClose|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_topClose.gif)|
|bottomOpen|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_bottomOpen.gif)|
|bottomClose|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_bottomClose.gif)|
|leftOpen|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_leftOpen.gif)|
|leftClose|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_leftClose.gif)|
|rightOpen|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_rightOpen.gif)|
|rightClose|![result](https://github.com/azumazuma/android_animation/blob/master/images/Door_rightClose.gif)|

### Extend
|method name|used gif|
|---|---|
|widthSmall|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_widthSmall.gif)|
|widthBig|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_widthBig.gif)|
|heightSmall|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_heightSmall.gif)|
|heightBig|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_heightBig.gif)|
|small|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_small.gif)|
|big|![result](https://github.com/azumazuma/android_animation/blob/master/images/Extend_big.gif)|

### Flash
|method name|used gif|
|---|---|
|week|![result](https://github.com/azumazuma/android_animation/blob/master/images/Flash_week.gif)|
|medium|![result](https://github.com/azumazuma/android_animation/blob/master/images/Flash_medium.gif)|
|strength|![result](https://github.com/azumazuma/android_animation/blob/master/images/Flash_strength.gif)|

### Roll
|method name|used gif|
|---|---|
|inSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_inSideTop.gif)|
|outSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_outSideTop.gif)|
|inSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_inSideBottom.gif)|
|outSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_outSideBottom.gif)|
|inSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_inSideLeft.gif)|
|outSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_outSideLeft.gif)|
|inSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_inSideRight.gif)|
|outSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Roll_outSideRight.gif)|

### Shake
|method name|used gif|
|---|---|
|week|![result](https://github.com/azumazuma/android_animation/blob/master/images/Shake_week.gif)|
|medium|![result](https://github.com/azumazuma/android_animation/blob/master/images/Shake_medium.gif)|
|strength|![result](https://github.com/azumazuma/android_animation/blob/master/images/Shake_strength.gif)|

### Slip
|method name|used gif|
|---|---|
|inSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_inSideTop.gif)|
|outSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_outSideTop.gif)|
|inSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_inSideBottom.gif)|
|outSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_outSideBottom.gif)|
|inSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_inSideLeft.gif)|
|outSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_outSideLeft.gif)|
|inSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_inSideRight.gif)|
|outSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Slip_outSideRight.gif)|

### Snap
|method name|used gif|
|---|---|
|inSideX|![result](https://github.com/azumazuma/android_animation/blob/master/images/Snap_inSideX.gif)|
|outSideX|![result](https://github.com/azumazuma/android_animation/blob/master/images/Snap_outSideX.gif)|
|inSideY|![result](https://github.com/azumazuma/android_animation/blob/master/images/Snap_inSideY.gif)|
|outSideY|![result](https://github.com/azumazuma/android_animation/blob/master/images/Snap_outSideY.gif)|

### Turn
|method name|used gif|
|---|---|
|inSide|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_inSide.gif)|
|outSide|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_outSide.gif)|
|inSideAxisTopLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_inSideAxisTopLeft.gif)|
|outSideAxisTopLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_outSideAxisTopLeft.gif)|
|inSideAxisTopRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_inSideAxisTopRight.gif)|
|outSideAxisTopRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_outSideAxisTopRight.gif)|
|inSideAxisBottomLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_inSideAxisBottomLeft.gif)|
|outSideAxisBottomLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_outSideAxisBottomLeft.gif)|
|inSideAxisBottomRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_inSideAxisBottomRight.gif)|
|outSideAxisBottomRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Turn_outSideAxisBottomRight.gif)|

### Zoom
|method name|used gif|
|---|---|
|inSide|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_inSide.gif)|
|outSide|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_outSide.gif)|
|inSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_inSideTop.gif)|
|outSideTop|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_outSideTop.gif)|
|inSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_inSideBottom.gif)|
|outSideBottom|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_outSideBottom.gif)|
|inSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_inSideLeft.gif)|
|outSideLeft|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_outSideLeft.gif)|
|inSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_inSideRight.gif)|
|outSideRight|![result](https://github.com/azumazuma/android_animation/blob/master/images/Zoom_outSideRight.gif)|

License
-------
MIT License

Copyright (c) 2019 azumazuma

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
