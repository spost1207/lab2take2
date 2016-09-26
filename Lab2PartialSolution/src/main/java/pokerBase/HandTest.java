ackage pokerBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class HandTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void IsHandFourOfAKindTest() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> FourKindHand = new ArrayList<Card>();
		FourKindHand.add(new Card(eSuit.HEARTS,eRank.JACK,0));
		FourKindHand.add(new Card(eSuit.HEARTS,eRank.JACK,0));
		FourKindHand.add(new Card(eSuit.HEARTS,eRank.JACK,0));		
		FourKindHand.add(new Card(eSuit.HEARTS,eRank.JACK,0));
		FourKindHand.add(new Card(eSuit.HEARTS,eRank.QUEEN,0));
		
		Hand h = new Hand();
		h = SetHand(FourKindHand,h);
		
		boolean bIsFourOfKind = Hand.isHandFourOfAKind(h, hs);
		boolean bFourKindTrue = true;
		
		assertEquals(bIsFourOfKind,bFourKindTrue);		
		assertEquals(hs.getHiHand(),eRank.JACK.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.QUEEN);
	}
	
	
public void isFullHouseTest() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> FullHouseHand = new ArrayList<Card>();
		FullHouse.add(new Card(eSuit.HEARTS,eRank.ACE,0));
		FullHouse.add(new Card(eSuit.HEARTS,eRank.ACE,0));
		FullHouse.add(new Card(eSuit.SPADES,eRank.FIVE,0));		
		FullHouse.add(new Card(eSuit.CLUB,eRank.FIVE,0));
		FullHouse.add(new Card(eSuit.DIAMONDS,eRank.FIVE,0));
		
		Hand h = new Hand();
		h = SetHand(FullHouseHand,h);
		
		boolean bIsHandFullHouse = Hand.isHandFullHouse(h, hs);
		boolean bIsHandFullHouseTrue = true;
		
		assertEquals(bIsHandFullHouse,bIsHandFullHouseTrue);		
		assertEquals(hs.getHiHand(),eRank.THREE.getiRankNbr());		
	}
	
public void StraightTesting() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> StraightHand = new ArrayList<Card>();
		StraightHand.add(new Card(eSuit.HEARTS,eRank.SEVEN,0));
		StraightHand.add(new Card(eSuit.CLUBS,eRank.SIX,0));
		StraightHand.add(new Card(eSuit.SPADES,eRank.FIVE,0));		
		StraightHand.add(new Card(eSuit.DIAMONDS,eRank.FOUR,0));
		StraightHand.add(new Card(eSuit.DIAMONDS,eRank.THREE,0));
		
		Hand h = new Hand();
		h = SetHand(StraightHand,h);
		
		boolean bIsHandStraight = Hand.isHandStraight(h, hs);
		boolean IsHandStraightTrue = true;
		
		assertEquals(bIsHandStraight,bIsHandStraightTrue);		
		assertEquals(hs.getHiHand(),eRank.SEVEN.getiRankNbr());		
	}
	
	
public void ThreeOfAKindTesting() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> ThreeOfAKindHand = new ArrayList<Card>();
		ThreeOfAKindHand.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		ThreeOfAKindHand.add(new Card(eSuit.CLUBS,eRank.ACE,0));
		ThreeOfAKindHand.add(new Card(eSuit.CLUBS,eRank.ACE,0));		
		ThreeOfAKindHand.add(new Card(eSuit.HEARTS,eRank.FOUR,0));
		ThreeOfAKindHand.add(new Card(eSuit.DIAMONDS,eRank.TWO,0));
		
		Hand h = new Hand();
		h = SetHand(ThreeOfAKindHand,h);
		
		boolean bIsHandThreeOfAKind = Hand.isHandThreeOfAKind(h, hs);
		boolean bIsHandThreeOfAKindTrue = true;
		
		assertEquals(bIsHandThreeOfAKind,bIsHandThreeOfAKindTrue);		
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.FOUR);
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteRank(), eRank.TWO);
	}	
	
public void TwoPairTesting() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> TwoPairHand = new ArrayList<Card>();
		TwoPairHand.add(new Card(eSuit.HEARTS,eRank.ACE,0));
		TwoPairHand.add(new Card(eSuit.HEARTS,eRank.ACE,0));
		TwoPairHand.add(new Card(eSuit.SPADES,eRank.FIVE,0));		
		TwoPairHand.add(new Card(eSuit.CLUBS,eRank.FIVE,0));
		TwoPairHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE,0));
		
		Hand h = new Hand();
		h = SetHand(TwoPairHand,h);
		
		boolean bIsHandTwoPair = Hand.isHandTwoPair(h, hs);
		boolean bIsHandTwoPairTrue = true;
		
		assertEquals(bIsHandTwoPair,bIsHandTwoPairTrue);		
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.FIVE);
	}
	
public void PairTesting() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> PairHand = new ArrayList<Card>();
		PairHand.add(new Card(eSuit.SPADES,eRank.SIX,0));
		PairHand.add(new Card(eSuit.SPADES,eRank.SIX,0));
		PairHand.add(new Card(eSuit.CLUBS,eRank.FOUR,0));		
		PairHand.add(new Card(eSuit.HEARTS,eRank.THREE,0));
		PairHand.add(new Card(eSuit.DIAMONDS,eRank.TWO,0));
		
		Hand h = new Hand();
		h = SetHand(PairHand,h);
		
		boolean bIsHandPair = Hand.isHandPair(h, hs);
		boolean bIsHandPairTrue = true;
		
		assertEquals(bIsHandPair,bIsHandPairTrue);		
		assertEquals(hs.getHiHand(),eRank.SIX.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.CLUBS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.FOUR);
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteRank(), eRank.THREE);
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteRank(), eRank.TWO);
	}
	
public void HighCardTesting() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> HighCardHand = new ArrayList<Card>();
		HighCardHand.add(new Card(eSuit.SPADES,eRank.TEN,0));
		HighCardHand.add(new Card(eSuit.SPADES,eRank.NINE,0));
		HighCardHand.add(new Card(eSuit.HEARTS,eRank.EIGHT,0));		
		HighCardHand.add(new Card(eSuit.DIAMONDS,eRank.SEVEN,0));
		HighCardHand.add(new Card(eSuit.CLUBS,eRank.SIX,0));
		
		Hand h = new Hand();
		h = SetHand(HighCardHand,h);
		
		boolean bIsHandHighCard = Hand.isHandHighCard(h, hs);
		boolean bIsHandHighCardTrue = true;
		
		assertEquals(bIsHandHighCard,bIsHandHighCardTrue);		
		assertEquals(hs.getHiHand(),eRank.TEN.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.SPADES);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.NINE);
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteRank(), eRank.EIGHT);
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteRank(), eRank.SEVEN);
		assertEquals(hs.getKickers().get(eCardNo.FourthCard.getCardNo()).geteSuit(), eSuit.CLUBS);		
		assertEquals(hs.getKickers().get(eCardNo.FourthCard.getCardNo()).geteRank(), eRank.SIX);
		
	}
//finished i believe, such a hard lab.
}


