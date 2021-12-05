libgdx loading screen
=====================

Libgdx 1.4.1-branch contributed by [Deathsbreed][7].

What is this?
-------------

![800x480](https://raw.github.com/Matsemann/libgdx-loading-screen/master/Main/workfiles/800x480.png)  
This is an example of how to make a loading screen in libgdx. It features a loading bar which updates with the progress.  
The bar can be animated and is interpolated to make the progress less 'jerky'.  
[Video example] [1]

How does it work?
-----------------

Check out the [LoadingScreen.java] [4] file, which is commented.  
It relies on the [AssetManager] [6] to load the assets in another thread. This gives it the opportunity to show a responsive
screen instead of having the game freeze while assets are being loaded.  
  
First it loads the assets needed to show the loading screen. For this, it is calling AssetManager's finishLoading();  
This will make the screen wait until all the loading assets are loaded before moving on.  
Then it should tell the AssetManager what to load next.  
  
In the resize() method we are placing all the components.  
**NOTE:** If you check the code you will see that the loadingBar is actually never resized or moved. Instead it is hidden
from the beginning, and then showing more and more as the assets are being loaded.  
  
In the render() method AssetManager.update() is being constantly called to make it load the assets. This method will return *TRUE*
when everything is loaded, so then it would be a good time to move on to some other screen. In this example, it moves on to MainMenuScreen
after a touch.  
The percentage value given by the manager is interpolated to give a more smooth bar. Try changing the value from 0.1f to 1f to see the difference.
Or check this [video with no interpolation] [5]



Links
-----

[Libgdx] [2]  
[Vector logo] [3]


License
-------

**UNLICENSE**


This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <http://unlicense.org/>



![stats](http://matsemann.com/host/libgdx/statpixel.png)  

  [1]: http://www.youtube.com/watch?v=gpI2U_9jDak "YouTube"
  [2]: http://libgdx.badlogicgames.com/ "Libgdx home"
  [3]: http://bioboblog.blogspot.no/2012/08/vector-libgdx-logo.html
  [4]: https://github.com/Matsemann/libgdx-loading-screen/blob/master/Main/src/com/matsemann/libgdxloadingscreen/screen/LoadingScreen.java
  [5]: http://www.youtube.com/watch?v=pyZwkYVHEyI
  [6]: http://code.google.com/p/libgdx/wiki/AssetManager
  [7]: https://github.com/Matsemann/libgdx-loading-screen/pull/4

