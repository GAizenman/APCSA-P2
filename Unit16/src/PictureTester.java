/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	public static void testSharpen(int x, int y, int w, int h)
	{
	     Picture redMoto = new Picture("redMotorcycle.jpg");
	     redMoto.explore();
	     redMoto.sharpen(x,y,w,h);
	     redMoto.explore();
	}

  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
    Picture temple = new Picture("redMotorcycle.jpg");
    temple.explore();
    temple.mirrorVerticalRightToLeft();
    temple.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture temple = new Picture("redMotorcycle.jpg");
    temple.explore();
    temple.mirrorHorizontal();
    temple.explore();
  }
  
  public static void testMirrorHorizontalBottomToTop()
  {
    Picture temple = new Picture("redMotorcycle.jpg");
    temple.explore();
    temple.mirrorHorizontalBotToTop();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("beach.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  
  public static void testCopy()
  {
      Picture katie = new Picture( "KatieFancy.jpg" );
      Picture blank = new Picture( "640x480.jpg" );
      blank.copy( katie, 4, 67, 75, 129, 10, 10 );
      blank.show();
  }
  
  public static void testEdgeDetection2()
  {
      Picture swan = new Picture( "swan.jpg" );
      swan.edgeDetection2( 10 );
      swan.explore();
  }
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontalBottomToTop();
	//testMirrorHorizontal();
	  testSharpen(50,50,500,400); 
  }
}