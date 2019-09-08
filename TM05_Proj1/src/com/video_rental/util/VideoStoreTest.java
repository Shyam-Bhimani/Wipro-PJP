package com.video_rental.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.video_rental.bean.Video;
import com.video_rental.bean.VideoStore;

public class VideoStoreTest {
	private VideoStore videoStore;
	//private Video[] store;
	private String name;
	private Video lastAdded;
	private int storeSize;
	
	@Before
	public void before() {
		videoStore = new VideoStore();
		name = "The XYZ";
		storeSize = 0;
	}

	@Test
	public void addVideoTest() {
		name = "The XYZ";
		videoStore.addVideo(name);
		storeSize = videoStore.getStoreSize();
		lastAdded = videoStore.getLastAdded();		
		assertEquals(1, storeSize);
		assertEquals(name, lastAdded.getName());
		

		name = "The ABC";
		videoStore.addVideo(name);
		storeSize = videoStore.getStoreSize();
		lastAdded = videoStore.getLastAdded();		
		assertEquals(2, storeSize);
		assertEquals(name, lastAdded.getName());	
	}
	
	@Test
	public void doCheckoutTest() {
		videoStore.addVideo(name);
		videoStore.getLastAdded().doCheckout();
		assertTrue(videoStore.getLastAdded().getCheckout());
	}
	
	@Test
	public void doReturnTest() {
		videoStore.addVideo(name);
		videoStore.getLastAdded().doReturn();
		assertFalse(videoStore.getLastAdded().getCheckout());
	}
	
	@Test
	public void receiveRatingTest() {
		videoStore.addVideo(name);
		videoStore.receiveRating(name, 5);
		lastAdded = videoStore.getLastAdded();
		assertEquals(5, lastAdded.getRating());		
	}
	
	@Test
	public void listInventoryTest() {
		try {
			videoStore.listInventory();
			assertFalse(false);
		} catch (Exception e) {
			assertFalse(true);
		}
	}

}