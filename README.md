# Godot Firebase Analytics 23.0.0
[![Godot](https://img.shields.io/badge/Godot%20Engine-3.6.2-blue?style=for-the-badge&logo=godotengine&logoSize=auto)](https://godotengine.org/)
[![Firebase Analytics](https://img.shields.io/badge/firebase-ffca28?style=for-the-badge&logo=firebase&logoColor=black)](https://firebase.google.com/docs/analytics)
[![GitHub License](https://img.shields.io/github/license/damnedpie/godot-firebase-analytics?style=for-the-badge)](https://github.com/damnedpie/godot-firebase-analytics/blob/main/LICENSE)
[![GitHub Repo stars](https://img.shields.io/github/stars/damnedpie/godot-firebase-analytics?style=for-the-badge&logo=github&logoSize=auto&color=%23FFD700)](https://github.com/damnedpie/godot-firebase-analytics/stargazers)

Firebase Analytics 23.0.0 Android plugin for Godot. Built on Godot 3.6.2 dependency.

## Setup

### Project integration

Put ``google-services.json`` into your project's ``res://android/build`` folder. The json file can be obtained from the Firebase console.

It's recommended to use Firebase BoM to manage dependencies, especially if you are up to using other Firebase services. You add the BoM by adding ``implementation platform("com.google.firebase:firebase-bom:34.4.0")`` into your game project's ``build.gradle`` dependencies section. This way there's no need to specify the particular version of Firebase dependencies in the GDAP file of the plugin.

Grab the``GodotFirebaseAnalyics`` plugin binary (.aar) and config (.gdap) from the releases page and put both into ``res://android/plugins``. Enable the plugin in your export template for Android.

## Usage

Add the ``GodotFirebaseAnalytics.gd`` as an Autoload to your project and use its methods.
