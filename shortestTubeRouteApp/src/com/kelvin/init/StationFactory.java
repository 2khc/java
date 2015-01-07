package com.kelvin.init;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.lists.ILine;
import com.kelvin.lists.IStation;
import com.kelvin.lists.Line;
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

		ILine circleLine = new Line("circle");
		ILine piccadillyLine = new Line("piccadilly");
		ILine jubileeLine = new Line("jubiliee");
		ILine northernLine = new Line("northern");
		ILine centralLine = new Line("central");
		ILine victoriaLine = new Line("victora");
		ILine bakerlooLine = new Line("bakerloo");
		ILine metropolitanLine = new Line("metropolitan");
		ILine hammersmithAndCityLine = new Line("hammersmithAndCityLine");
		ILine districtLine = new Line("district");

		bakerStreet.addLinks(10, marylebone, regentsPark, greatPortlandStreet);
		bakerStreet.addLines(bakerlooLine, metropolitanLine, circleLine, hammersmithAndCityLine);
		greatPortlandStreet.addLinks(10, bakerStreet, eustonSquare);
		greatPortlandStreet.addLines(metropolitanLine, circleLine, hammersmithAndCityLine);
		eustonSquare.addLinks(10, greatPortlandStreet, kingsCross);
		eustonSquare.addLines(metropolitanLine, circleLine, hammersmithAndCityLine);
		kingsCross.addLinks(10, eustonSquare, euston, angel, farringdon, russelSquare);
		kingsCross.addLines(metropolitanLine, circleLine, hammersmithAndCityLine, northernLine, victoriaLine, piccadillyLine);
		farringdon.addLinks(10, kingsCross, barbican);
		farringdon.addLines(metropolitanLine, circleLine, hammersmithAndCityLine);
		barbican.addLinks(10, farringdon, moorgate);
		barbican.addLines(metropolitanLine, circleLine, hammersmithAndCityLine);
		moorgate.addLinks(10, barbican, liverpoolStreet);
		moorgate.addLines(metropolitanLine, circleLine, hammersmithAndCityLine, northernLine);
		liverpoolStreet.addLinks(10, moorgate, aldgate, aldgateEast);
		liverpoolStreet.addLines(metropolitanLine, circleLine, hammersmithAndCityLine, centralLine);
		aldgate.addLinks(10, liverpoolStreet, towerHill);
		aldgate.addLines(metropolitanLine, circleLine);
		towerHill.addLinks(10, aldgate, aldgateEast, monument);
		towerHill.addLines(circleLine, districtLine);
		monument.addLinks(10, towerHill, bank, moorgate, londonBridge, cannonStreet);
		monument.addLines(circleLine, districtLine, northernLine);
		cannonStreet.addLinks(10, monument, mansionHouse);
		cannonStreet.addLines(circleLine, districtLine);
		mansionHouse.addLinks(10, cannonStreet, blackfriars);
		mansionHouse.addLines(circleLine, districtLine);
		blackfriars.addLinks(10, mansionHouse, temple);
		blackfriars.addLines(circleLine, districtLine);
		temple.addLinks(10, blackfriars, embankment);
		temple.addLines(circleLine, districtLine);
		embankment.addLinks(10, temple, charingCross, waterloo, westminster);
		embankment.addLines(circleLine, districtLine, northernLine);
		westminster.addLinks(10, embankment, waterloo, greenPark, stJamesPark);
		westminster.addLines(circleLine, districtLine, jubileeLine);
		stJamesPark.addLinks(10, westminster, victoria);
		stJamesPark.addLines(circleLine, districtLine);
		victoria.addLinks(10, stJamesPark, greenPark, pimlico, sloaneSquare);
		victoria.addLines(circleLine, districtLine, victoriaLine);
		sloaneSquare.addLinks(10, victoria, southKensington);
		sloaneSquare.addLines(circleLine, districtLine);
		southKensington.addLinks(10, sloaneSquare, gloucesterRoad, knightsbridge, earlsCourt);
		southKensington.addLines(circleLine, districtLine, piccadillyLine);
		gloucesterRoad.addLinks(10, southKensington, highStreetKensington, earlsCourt);
		gloucesterRoad.addLines(circleLine, districtLine, piccadillyLine);
		highStreetKensington.addLinks(10, gloucesterRoad, nottingHillGate, earlsCourt);
		highStreetKensington.addLines(circleLine, districtLine);
		nottingHillGate.addLinks(10, highStreetKensington, queensway, bayswater);
		nottingHillGate.addLines(circleLine, districtLine, centralLine);
		bayswater.addLinks(10, nottingHillGate, paddington);
		bayswater.addLines(circleLine, districtLine);

		// Bakerloo Line
		paddington.addLinks(10, edgwareRoad, bayswater);
		paddington.addLines(bakerlooLine, hammersmithAndCityLine, circleLine, districtLine);
		edgwareRoad.addLinks(10, paddington, marylebone);
		edgwareRoad.addLines(circleLine, hammersmithAndCityLine, districtLine);
		marylebone.addLinks(10, edgwareRoad, bakerStreet);
		marylebone.addLines(bakerlooLine);
		regentsPark.addLinks(10, bakerStreet, oxfordCircus);
		regentsPark.addLines(bakerlooLine);
		oxfordCircus.addLinks(10, regentsPark, warrenStreet, greenPark, piccadillyCircus, tottenhamCourtRoad, bondStreet);
		oxfordCircus.addLines(bakerlooLine, victoriaLine, centralLine);
		piccadillyCircus.addLinks(10, oxfordCircus, leicesterSquare, greenPark, charingCross);
		piccadillyCircus.addLines(bakerlooLine, piccadillyLine);
		charingCross.addLinks(10, piccadillyCircus, leicesterSquare, embankment);
		charingCross.addLines(bakerlooLine, northernLine);
		waterloo.addLinks(10, embankment, lambethNorth, westminster, southwark);
		waterloo.addLines(jubileeLine, northernLine, bakerlooLine);
		lambethNorth.addLinks(10, waterloo, elephantAndCastle);
		lambethNorth.addLines(bakerlooLine);
		elephantAndCastle.addLinks(10, lambethNorth);
		elephantAndCastle.addLines(bakerlooLine, northernLine);

		// Victoria Line
		euston.addLinks(10, kingsCross, warrenStreet);
		euston.addLines(northernLine, victoriaLine);
		warrenStreet.addLinks(10, euston, goodgeStreet, oxfordCircus);
		warrenStreet.addLines(northernLine, victoriaLine);
		greenPark.addLinks(10, oxfordCircus, bondStreet, westminster, piccadillyCircus, hydeParkCorner, victoria);
		greenPark.addLines(piccadillyLine, victoriaLine, jubileeLine);
		pimlico.addLinks(10, victoria, vauxhall);
		pimlico.addLines(victoriaLine);
		vauxhall.addLinks(10, pimlico);
		vauxhall.addLines(victoriaLine);

		// Piccadilly Line
		russelSquare.addLinks(10, kingsCross, holborn);
		russelSquare.addLines(piccadillyLine);
		holborn.addLinks(10, russelSquare, tottenhamCourtRoad, chanceryLane, coventGarden);
		holborn.addLines(piccadillyLine, centralLine);
		coventGarden.addLinks(10, holborn, leicesterSquare);
		coventGarden.addLines(piccadillyLine);
		leicesterSquare.addLinks(10, coventGarden, tottenhamCourtRoad, charingCross, piccadillyCircus);
		leicesterSquare.addLines(piccadillyLine, northernLine);
		hydeParkCorner.addLinks(10, greenPark, knightsbridge);
		hydeParkCorner.addLines(piccadillyLine);
		knightsbridge.addLinks(10, hydeParkCorner, southKensington);
		knightsbridge.addLines(piccadillyLine);
		earlsCourt.addLinks(10, highStreetKensington, gloucesterRoad, southKensington);
		earlsCourt.addLines(piccadillyLine, districtLine);

		// Northern LIne
		goodgeStreet.addLinks(10, warrenStreet, tottenhamCourtRoad);
		goodgeStreet.addLines(northernLine);
		angel.addLinks(10, kingsCross, oldStreet);
		angel.addLines(northernLine);
		tottenhamCourtRoad.addLinks(10, goodgeStreet, leicesterSquare);
		tottenhamCourtRoad.addLines(northernLine, centralLine);
		oldStreet.addLinks(10, angel, moorgate);
		oldStreet.addLines(northernLine);
		londonBridge.addLinks(10, monument, borough);
		londonBridge.addLines(jubileeLine, northernLine);
		borough.addLinks(10, londonBridge, elephantAndCastle);
		borough.addLines(northernLine);

		// Central Line
		queensway.addLinks(10, nottingHillGate, lancasterGate);
		queensway.addLines(centralLine);
		lancasterGate.addLinks(10, queensway, marbleArch);
		lancasterGate.addLines(centralLine);
		marbleArch.addLinks(10, lancasterGate, bondStreet);
		marbleArch.addLines(centralLine);
		bondStreet.addLinks(10, marbleArch, oxfordCircus, bakerStreet, greenPark);
		bondStreet.addLines(centralLine, jubileeLine);
		chanceryLane.addLinks(10, holborn, stPauls);
		chanceryLane.addLines(centralLine);
		stPauls.addLinks(10, chanceryLane, bank);
		stPauls.addLines(centralLine);
		bank.addLinks(10, stPauls, moorgate, londonBridge, liverpoolStreet, monument);
		bank.addLines(centralLine, northernLine);

		// Jubilee Line
		southwark.addLinks(10, waterloo, londonBridge);
		southwark.addLines(jubileeLine);

		// Hammersmith & City line
		aldgateEast.addLinks(10, liverpoolStreet, towerHill);
		aldgateEast.addLines(hammersmithAndCityLine);

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
