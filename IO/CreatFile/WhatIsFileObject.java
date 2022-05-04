
//  Create File Object 
// There are four ways to create file object

	File(String pathname)
	File(String parent, String child)
	File(File parent, String child)
	File(URI uri)


//  File create with absolute path 
	File obj = new File ( "/home/tls/MyTestCode/test.txt ");

// When creat this object, acturally it is not real creat file
// file object need to use createNewFile() method for reality file.

// Now here we come,
	obj.createNewFile();
// Now you could found test.txt file in the TestCode folder.


	obj.isDirectory();

	obj.exists();

	obj.isFile();

// You can check file object just like that!!!


// We can rename and remove the file to the another distination
// we use renameTo() method and insert file argument with distination path

	obj.renameTo(new File("./HelloFolder/IOtest.txt"));

// We can creat folder with File Object but need this folder already exist	
	File obj = new File ("helloIO");

// We can delect file, these have two ways
// first way is using delect() method it does delected file and object immediately

	obj.delect();

// second way is using delectOnExit() method , it does delected file when JVM is closed.
	obj.delectOnExit();


