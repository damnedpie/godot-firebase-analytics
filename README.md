# Godot Firebase Analytics 22.1.2
[![Godot](https://img.shields.io/badge/Godot%20Engine-3.6-blue?style=for-the-badge&logo=godotengine&logoSize=auto)](https://godotengine.org/)
[![Firebase Analytics](https://https://img.shields.io/badge/firebase-ffca28?style=for-the-badge&logo=firebase&logoColor=black)](https://firebase.google.com/docs/analytics)
[![GitHub License](https://img.shields.io/github/license/damnedpie/godot-firebase-analytics?style=for-the-badge)](#)
[![GitHub Repo stars](https://img.shields.io/github/stars/damnedpie/godot-firebase-analytics?style=for-the-badge&logo=github&logoSize=auto&color=%23FFD700)](#)

Godot Firebase Analytics 22.1.2 Android plugin for Godot. Built on Godot 3.6 AAR.

## Setup

### Project integration

Put ``google-services.json`` into your project's ``res://android/build`` folder. The json file can be obtained from the Firebase console.

Grab the``GodotFirebaseAnalyics`` plugin binary (.aar) and config (.gdap) from the releases page and put both into ``res://android/plugins``. Enable the plugin in your export template for Android.

## Usage

Add the ``GodotFirebaseAnalytics.gd`` as an Autoload to your project and use its methods.
