package com.example.method_chhanel_example

import androidx.annotation.NonNull
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugins.GeneratedPluginRegistrant

class MainActivity: FlutterActivity() {
    override fun configureFlutterEngine(@NonNull flutterEngine : FlutterEngine){
        GeneratedPluginRegistrant.registerWith(flutterEngine);

        MethodChannel(flutterEngine.dartExecutor , "methodChannelDemo").setMethodCallHandler{
            call , result ->
            if (call.method == "str"){
                result.success("Success Method Channel");
            }
        }
    }
}
