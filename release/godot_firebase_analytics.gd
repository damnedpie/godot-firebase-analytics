extends Node

var _fa : JNISingleton = null

func _ready() -> void:
	if Engine.has_singleton("GodotFirebaseAnalytics"):
		print("%s : singletone found" % name)
		_fa = Engine.get_singleton("GodotFirebaseAnalytics")

	else:
		print("%s : FirebaseAnalytics singletone not found" % name)

func logEvent(event:String, params:Dictionary={}) -> void:
	_fa.logEvent(event, params)

func setUserId(userId:String) -> void:
	_fa.setUserId(userId)

func setUserProperty(name:String, value:String) -> void:
	_fa.setUserProperty(name, value)