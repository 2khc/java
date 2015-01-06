package com.kelvin.init;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.lists.IStation;
import com.kelvin.lists.Station;

public class StationFactory implements IStationFactory {
	private List<IStation> zoneOne;

	public StationFactory() {

	}

	public List<IStation> createStations() {
		this.zoneOne = new ArrayList<IStation>();

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

		bakerStreet.addLinks(10, marylebone, regentsPark, greatPortlandStreet);
		greatPortlandStreet.addLinks(10, bakerStreet, eustonSquare);
		eustonSquare.addLinks(10, greatPortlandStreet, kingsCross);
		kingsCross.addLinks(10, eustonSquare, euston, angel, farringdon, russelSquare);
		farringdon.addLinks(10, kingsCross, barbican);
		barbican.addLinks(10, farringdon, moorgate);
		moorgate.addLinks(10, barbican, liverpoolStreet);
		liverpoolStreet.addLinks(10, moorgate, aldgate, aldgateEast);
		aldgate.addLinks(10, liverpoolStreet, towerHill);
		towerHill.addLinks(10, aldgate, aldgateEast, monument);
		monument.addLinks(10, towerHill, bank, moorgate, londonBridge, cannonStreet);
		cannonStreet.addLinks(10, monument, mansionHouse);
		mansionHouse.addLinks(10, cannonStreet, blackfriars);
		blackfriars.addLinks(10, mansionHouse, temple);
		temple.addLinks(10, blackfriars, embankment);
		embankment.addLinks(10, temple, charingCross, waterloo, westminster);
		westminster.addLinks(10, embankment, waterloo, greenPark, stJamesPark);
		stJamesPark.addLinks(10, westminster, victoria);
		victoria.addLinks(10, stJamesPark, greenPark, pimlico, sloaneSquare);
		sloaneSquare.addLinks(10, victoria, southKensington);
		southKensington.addLinks(10, sloaneSquare, gloucesterRoad, knightsbridge, earlsCourt);
		gloucesterRoad.addLinks(10, southKensington, highStreetKensington, earlsCourt);
		highStreetKensington.addLinks(10, gloucesterRoad, nottingHillGate, earlsCourt);
		nottingHillGate.addLinks(10, highStreetKensington, queensway, bayswater);
		bayswater.addLinks(10, nottingHillGate, paddington);

		// Bakerloo Line
		paddington.addLinks(10, edgwareRoad, bayswater);
		edgwareRoad.addLinks(10, paddington, marylebone);
		marylebone.addLinks(10, edgwareRoad, bakerStreet);
		regentsPark.addLinks(10, bakerStreet, oxfordCircus);
		oxfordCircus.addLinks(10, regentsPark, warrenStreet, greenPark, piccadillyCircus, tottenhamCourtRoad, bondStreet);
		piccadillyCircus.addLinks(10, oxfordCircus, leicesterSquare, greenPark, charingCross);
		charingCross.addLinks(10, piccadillyCircus, leicesterSquare, embankment);
		waterloo.addLinks(10, embankment, lambethNorth, westminster, southwark);
		lambethNorth.addLinks(10, waterloo, elephantAndCastle);
		elephantAndCastle.addLinks(10, lambethNorth);

		// Victoria Line
		euston.addLinks(10, kingsCross, warrenStreet);
		warrenStreet.addLinks(10, euston, goodgeStreet, oxfordCircus);
		greenPark.addLinks(10, oxfordCircus, bondStreet, westminster, piccadillyCircus, hydeParkCorner, victoria);
		pimlico.addLinks(10, victoria, vauxhall);
		vauxhall.addLinks(10, pimlico);

		// Piccadilly Line
		russelSquare.addLinks(10, kingsCross, holborn);
		holborn.addLinks(10, russelSquare, tottenhamCourtRoad, chanceryLane, coventGarden);
		coventGarden.addLinks(10, holborn, leicesterSquare);
		leicesterSquare.addLinks(10, coventGarden, tottenhamCourtRoad, charingCross, piccadillyCircus);
		hydeParkCorner.addLinks(10, greenPark, knightsbridge);
		knightsbridge.addLinks(10, hydeParkCorner, southKensington);
		earlsCourt.addLinks(10, highStreetKensington, gloucesterRoad, southKensington);

		// Northern LIne
		goodgeStreet.addLinks(10, warrenStreet, tottenhamCourtRoad);
		angel.addLinks(10, kingsCross, oldStreet);
		tottenhamCourtRoad.addLinks(10, goodgeStreet, leicesterSquare);
		oldStreet.addLinks(10, angel, moorgate);
		londonBridge.addLinks(10, monument, borough);
		borough.addLinks(10, londonBridge, elephantAndCastle);

		// Central Line
		queensway.addLinks(10, nottingHillGate, lancasterGate);
		lancasterGate.addLinks(10, queensway, marbleArch);
		marbleArch.addLinks(10, lancasterGate, bondStreet);
		bondStreet.addLinks(10, marbleArch, oxfordCircus, bakerStreet, greenPark);
		chanceryLane.addLinks(10, holborn, stPauls);
		stPauls.addLinks(10, chanceryLane, bank);
		bank.addLinks(10, stPauls, moorgate, londonBridge, liverpoolStreet, monument);

		// Jubilee Line
		southwark.addLinks(10, waterloo, londonBridge);

		// Hammersmith & City line
		aldgateEast.addLinks(10, liverpoolStreet, towerHill);

		// Metropolitan line done.

		zoneOne.add(queensway);
		zoneOne.add(lancasterGate);
		zoneOne.add(marbleArch);
		zoneOne.add(bondStreet);
		zoneOne.add(chanceryLane);
		zoneOne.add(stPauls);
		zoneOne.add(bank);
		zoneOne.add(southwark);
		zoneOne.add(aldgateEast);
		zoneOne.add(euston);
		zoneOne.add(warrenStreet);
		zoneOne.add(greenPark);
		zoneOne.add(pimlico);
		zoneOne.add(vauxhall);
		zoneOne.add(russelSquare);
		zoneOne.add(holborn);
		zoneOne.add(coventGarden);
		zoneOne.add(leicesterSquare);
		zoneOne.add(hydeParkCorner);
		zoneOne.add(knightsbridge);
		zoneOne.add(earlsCourt);
		zoneOne.add(goodgeStreet);
		zoneOne.add(angel);
		zoneOne.add(tottenhamCourtRoad);
		zoneOne.add(oldStreet);
		zoneOne.add(londonBridge);
		zoneOne.add(borough);
		zoneOne.add(bakerStreet);
		zoneOne.add(greatPortlandStreet);
		zoneOne.add(eustonSquare);
		zoneOne.add(kingsCross);
		zoneOne.add(farringdon);
		zoneOne.add(barbican);
		zoneOne.add(moorgate);
		zoneOne.add(liverpoolStreet);
		zoneOne.add(aldgate);
		zoneOne.add(towerHill);
		zoneOne.add(monument);
		zoneOne.add(cannonStreet);
		zoneOne.add(mansionHouse);
		zoneOne.add(blackfriars);
		zoneOne.add(temple);
		zoneOne.add(embankment);
		zoneOne.add(westminster);
		zoneOne.add(stJamesPark);
		zoneOne.add(victoria);
		zoneOne.add(sloaneSquare);
		zoneOne.add(southKensington);
		zoneOne.add(gloucesterRoad);
		zoneOne.add(highStreetKensington);
		zoneOne.add(nottingHillGate);
		zoneOne.add(bayswater);
		zoneOne.add(paddington);
		zoneOne.add(edgwareRoad);
		zoneOne.add(marylebone);
		zoneOne.add(regentsPark);
		zoneOne.add(oxfordCircus);
		zoneOne.add(piccadillyCircus);
		zoneOne.add(charingCross);
		zoneOne.add(waterloo);
		zoneOne.add(lambethNorth);
		zoneOne.add(elephantAndCastle);

		return zoneOne;
	}
}
