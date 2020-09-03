# kone-aimo-xresources
Utility to set LEDs of a Roccat Kone Aimo mice to your current Xresources scheme. Requires [this tool made by ninnghazad](https://github.com/ninnghazad/roccat_kone_aimo). Highly recommended to use in combination with [pywal](https://github.com/dylanaraps/pywal).

## Usage
- Make sure you have a recent version of Java 8 installed
- Clone the [roccat_kone_aimo repo](https://github.com/ninnghazad/roccat_kone_aimo) and build the executable:
<code>g++ roccat_kone_aimo_rgb_tool.cpp -o roccat_kone_aimo_rgb_tool -I/usr/include -O3 -march=native</code>
- Grab a jar file from Releases
- Put the jar file in the same directory as the `roccat_kone_aimo_rgb_tool` executable
- Run the program!
`java -jar kone-aimo-xresources.jar [--dev device] [--primary color] [--secondary color]`

## Syntax
`java -jar kone-aimo-xresources.jar [--dev device] [--primary color] [--secondary color]`

**-dev**: hidraw device (ex. /dev/hidraw0), find the correct one by trial and error. I know it is extremely stupid, but I have no idea how to automatically detect the correct device. **If the program doesn't work, it is most likely sending data to the wrong device!**

**--primary**: any Xresources color from 0-7

**--secondary**: any Xresources color from 0-7

## Contribution
Have fun looking at my stupid code
