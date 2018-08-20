#coding=utf-8
import os
import os.path

os.system("adb uninstall  com.example.androidui.test")
os.system("adb uninstall com.example.androidui")
os.system("android update test-project -m G:/androidcode/AndroidUi -p .")
os.system("ant clean debug")
os.system("adb install G:/androidcode/AndroidUi/bin/AndroidUi-debug.apk")
os.system("adb install bin/AndroidUiTest-debug.apk")
os.system("adb shell am instrument -w com.example.androidui.test/com.example.testmanager.FirstRunner")

