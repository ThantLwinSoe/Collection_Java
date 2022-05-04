// We can create folder with File Object
	
	File parent = new File ("parent");

// We can create sub folder within parent folder

	// Way One
		File sub = new File("parent", "sub");
	// Way Two 
		File sub = new File (parent, "sub");

// But parent have not physical folder, It just on Memory
// So we need to use mkdir() method to become physical folder.
// But one thing need to be understand that if u use mkdir method, it should start parent to child
		parent.mkdir();
		sub.mkdir();
// No we don't want to start parent ,just invole sub so we will using mkdirs() method
// Just like that
		sub.mkdirs();
// This method will make physical folders both parent and sub 		

// We can check Is it folder or exists or whatever
		sub.exists();
		sub.isDirectory();

//  We can delete folder by using delete() method
		sub.delete();
		parent.delete();
