package questions;

import questions.interfaces.AirVehicule;
import questions.interfaces.EarthVehicule;

/*
    IMPORTANT:
	The aim of this exercise is to showcase your coding skills. Please do not think that we expect you to deliver the minnimun ammount of code required for this exercise to work.
	You are allowed to modify all the provided code. Do not think that provided classes have to remain untouched.
	Things that We take into consideration: Use of design patterns, clean code, testing.

    Background:
    The Aeroplane class already defines a method called "fly" and has an implementation for it.
    The Car class already has an implementation for "drive".

    The Problem:
    Redesign the classes so that we can have a flying car that can both drive and fly and
    so that we can re-use the same "fly" and "drive" implementations that have already been defined. i.e.
    The FlyingCar should drive exactly like a Car drives, without copy-and-pasting the drive method.

 */
public class FlyingCar implements EarthVehicule, AirVehicule{
	
	public void showInfo() {
		System.out.println("I have 4 wheels and 2 wings");
	}
	
}
