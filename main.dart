import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';

void main() {
  runApp(
    MaterialApp(
      title: "peoplelink",
      home:
        Scaffold(
          appBar: AppBar(title: Text( "welcome to peoplelink"),),
            body: const Material(

              child:Center(
                child: Text(
                  "HELLO",
                  style:  TextStyle(fontWeight:FontWeight.bold,fontSize:50.0),


                ),
              ),
            ),
    )
    )
  );
}








