package com.assignment.cg.IV;

public class NewThreadTest {
	public static void main(String[] args) {
		NewThread downloader = new NewThread("Download");
		NewThread player = new NewThread("Video Player");
		NewThread backup = new NewThread("Data Backup");
		NewThread installer = new NewThread("App Installer");
		
		downloader.go();
		player.go();
		backup.go();
		installer.go();
	}
	
}
