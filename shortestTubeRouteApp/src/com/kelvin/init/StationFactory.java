package com.kelvin.init;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.lists.IStation;
import com.kelvin.lists.Station;

public class StationFactory {
	private List<IStation> picadilly;

	public StationFactory() {

	}

	public void createStations() {
		this.picadilly = new ArrayList<IStation>();

		// Initialising Zone 1 ONLY
		// Bakerloo line
		IStation paddington = new Station("paddington");
		
		IStation edgwareRoad = new Station("edgware road");
		IStation marylebone = new Station("marylebone");
		IStation bakerStreet = new Station("baker street");
		IStation regentsPark = new Station("regents park");
		IStation oxfordCircus = new Station("oxord circus");
		IStation piccadillyCircus = new Station("piccadilly circus");
		IStation charingCross = new Station("charing cross");
		IStation embankment = new Station("embankment");
		IStation waterloo = new Station("waterloo");
		IStation lambethNorth = new Station("lambeth north");
		IStation elephantAndCastle = new Station("elephant & castle");

		// Victoria Line
		IStation kingsCross = new Station("king's cross");
		IStation euston = new Station("euston");
		IStation warrenStreet = new Station("warren street");
		IStation greenPark = new Station("green park");
		IStation victoria = new Station("victoria");
		IStation pimlico = new Station("pimlico");
		IStation vauxhall = new Station("vauxhall");

		// Central LIne
		IStation nottingHillGate = new Station("notting hill gate");
		IStation queensway = new Station("queensway");
		IStation lancasterGate = new Station("lancaster gate");
		IStation marbleArch = new Station("marble arch");
		IStation bondStreet = new Station("bond street");
		IStation tottenhamCourtRoad = new Station("tottenham court road");
		IStation holborn = new Station("holborn");
		IStation chanceryLane = new Station("chancery lane");
		IStation stPauls = new Station("st. pauls");
		IStation bank = new Station("bank");
		IStation liverpoolStreet = new Station("liverpool street");

		// Northern Line
		IStation goodgeStreet = new Station("goodge street");
		IStation leicesterSquare = new Station("leicester square");
		IStation angel = new Station("angel");
		IStation oldStreet = new Station("old street");
		IStation moorgate = new Station("moorgate");
		IStation monument = new Station("monument");
		IStation londonBridge = new Station("london bridge");
		IStation borough = new Station("borough");

		// Jubilee Line
		IStation westminster = new Station("wesminster");
		IStation southwark = new Station("southwark");

		// Piccadilly LIne
		IStation russelSquare = new Station("russel square");
		IStation coventGarden = new Station("covent garden");
		IStation hydeParkCorner = new Station("hyde park corner");
		IStation knightsbridge = new Station("knightsbridge");
		IStation southKensington = new Station("south kensington");
		IStation gloucesterRoad = new Station("gloucester road");
		IStation earlsCourt = new Station("earl's court");

		// Circle Line
		IStation greatPortlandStreet = new Station("great portland street");
		IStation eustonSquare = new Station("euston square");
		IStation farringdon = new Station("farringdon");
		IStation barbican = new Station("barbican");
		IStation aldgate = new Station("aldgate");
		IStation towerHill = new Station("tower hill");
		IStation cannonStreet = new Station("cannon street");
		IStation mansionHouse = new Station("mansion house");
		IStation blackfriars = new Station("blackfriars");
		IStation temple = new Station("temple");
		IStation stJamesPark = new Station("st. james's park");
		IStation sloaneSquare = new Station("sloane square");
		IStation highStreetKensington = new Station("high street kensington");
		IStation bayswater = new Station("bayswater");

		// Metropolitan line already complete
		// Hammersmith & City Line
		IStation aldgateEast = new Station("aldgate east");

		// Adding links
		// ===========================================================================================
		// ===========================================================================================
		// Circle Line

		bakerStreet.addLinks(marylebone, regentsPark, greatPortlandStreet);
		greatPortlandStreet.addLinks(bakerStreet, eustonSquare);
		eustonSquare.addLinks(greatPortlandStreet, kingsCross);
		kingsCross.addLinks(eustonSquare, euston, angel, farringdon, russelSquare);
		farringdon.addLinks(kingsCross, barbican);
		barbican.addLinks(farringdon, moorgate);
		moorgate.addLinks(barbican, liverpoolStreet);
		liverpoolStreet.addLinks(moorgate, aldgate, aldgateEast);
		aldgate.addLinks(liverpoolStreet, towerHill);
		towerHill.addLinks(aldgate, aldgateEast, monument);
		monument.addLinks(towerHill, bank, moorgate, londonBridge, cannonStreet);
		cannonStreet.addLinks(monument, mansionHouse);
		mansionHouse.addLinks(cannonStreet, blackfriars);
		blackfriars.addLinks(mansionHouse, temple);
		temple.addLinks(blackfriars, embankment);
		embankment.addLinks(temple, charingCross, waterloo, westminster);
		westminster.addLinks(embankment, waterloo, greenPark, stJamesPark);
		stJamesPark.addLinks(westminster, victoria);
		victoria.addLinks(stJamesPark, greenPark, pimlico, sloaneSquare);
		sloaneSquare.addLinks(victoria, southKensington);
		southKensington.addLinks(sloaneSquare, gloucesterRoad, knightsbridge, earlsCourt);
		gloucesterRoad.addLinks(southKensington, highStreetKensington, earlsCourt);
		highStreetKensington.addLinks(gloucesterRoad, nottingHillGate, earlsCourt);
		nottingHillGate.addLinks(highStreetKensington, queensway, bayswater);
		bayswater.addLinks(nottingHillGate, paddington);

		// Bakerloo Line
		paddington.addLinks(edgwareRoad, bayswater);
		edgwareRoad.addLinks(paddington, marylebone);
		marylebone.addLinks(edgwareRoad, bakerStreet);
		regentsPark.addLinks(bakerStreet, oxfordCircus);
		oxfordCircus.addLinks(regentsPark, warrenStreet, greenPark, piccadillyCircus, tottenhamCourtRoad, bondStreet);
		piccadillyCircus.addLinks(oxfordCircus, leicesterSquare, greenPark, charingCross);
		charingCross.addLinks(piccadillyCircus, leicesterSquare, embankment);
		waterloo.addLinks(embankment, lambethNorth, westminster, southwark);
		lambethNorth.addLinks(waterloo, elephantAndCastle);
		elephantAndCastle.addLinks(lambethNorth);

		// Victoria Line
		euston.addLinks(kingsCross, warrenStreet);
		warrenStreet.addLinks(euston, goodgeStreet, oxfordCircus);
		greenPark.addLinks(oxfordCircus, bondStreet, westminster, piccadillyCircus, hydeParkCorner, victoria);
		pimlico.addLinks(victoria, vauxhall);
		vauxhall.addLinks(pimlico);

		// Piccadilly Line
		russelSquare.addLinks(kingsCross, holborn);
		holborn.addLinks(russelSquare, tottenhamCourtRoad, chanceryLane, coventGarden);
		coventGarden.addLinks(holborn, leicesterSquare);
		leicesterSquare.addLinks(coventGarden, tottenhamCourtRoad, charingCross, piccadillyCircus);
		hydeParkCorner.addLinks(greenPark, knightsbridge);
		knightsbridge.addLinks(hydeParkCorner, southKensington);
		earlsCourt.addLinks(highStreetKensington, gloucesterRoad, southKensington);

		// Northern LIne
		goodgeStreet.addLinks(warrenStreet, tottenhamCourtRoad);
		angel.addLinks(kingsCross, oldStreet);
		tottenhamCourtRoad.addLinks(goodgeStreet, leicesterSquare);
		oldStreet.addLinks(angel, moorgate);
		londonBridge.addLinks(monument, borough);
		borough.addLinks(londonBridge, elephantAndCastle);
		
		//Central Line
		queensway.addLinks(nottingHillGate,lancasterGate);
		lancasterGate.addLinks(queensway,marbleArch);
		marbleArch.addLinks(lancasterGate,bondStreet);
		bondStreet.addLinks(marbleArch,oxfordCircus,bakerStreet,greenPark);
		chanceryLane.addLinks(holborn,stPauls);
		stPauls.addLinks(chanceryLane,bank);
		bank.addLinks(stPauls,moorgate,londonBridge,liverpoolStreet,monument);
		
		
		// Jubilee Line
		southwark.addLinks(waterloo,londonBridge);
		
		//Hammersmith & City line
		aldgateEast.addLinks(liverpoolStreet,towerHill);
		
		//Metropolitan line done.
		

	}
}
