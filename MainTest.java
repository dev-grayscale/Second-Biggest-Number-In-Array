import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void secondBiggestNumberV1() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV1(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV1(new int[0]));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV1(new int[] { 1 }));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV1(new int[] { -20 }));


    Assertions.assertEquals(7, Main.secondBiggestNumberV1(new int[] { 1,2,3,4,5,6,7,8 }));
    Assertions.assertEquals(5, Main.secondBiggestNumberV1(new int[] { 5,6 }));
    Assertions.assertEquals(34, Main.secondBiggestNumberV1(new int[] { 5,6,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV1(new int[] { 100,99,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV1(new int[] { 100,20,30, 99, 51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV1(new int[] { 100,20,30, 51,34, 99 }));
    Assertions.assertEquals(3333, Main.secondBiggestNumberV1(new int[] { 1,3333, 2, 4444, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,20,21,25,26,28,39,27,29,100,2012,144,99,1000,2000 }));
  }

  @Test
  void secondBiggestNumberV2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV2(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV2(new int[0]));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV2(new int[] { 1 }));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV2(new int[] { -20 }));


    Assertions.assertEquals(7, Main.secondBiggestNumberV2(new int[] { 1,2,3,4,5,6,7,8 }));
    Assertions.assertEquals(5, Main.secondBiggestNumberV2(new int[] { 5,6 }));
    Assertions.assertEquals(34, Main.secondBiggestNumberV2(new int[] { 5,6,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV2(new int[] { 100,99,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV2(new int[] { 100,20,30, 99, 51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV2(new int[] { 100,20,30, 51,34, 99 }));
    Assertions.assertEquals(3333, Main.secondBiggestNumberV2(new int[] { 1,3333, 2, 4444, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,20,21,25,26,28,39,27,29,100,2012,144,99,1000,2000 }));
  }

  @Test
  void secondBiggestNumberV3() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV3(null));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV3(new int[0]));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV3(new int[] { 1 }));
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.secondBiggestNumberV3(new int[] { -20 }));


    Assertions.assertEquals(7, Main.secondBiggestNumberV3(new int[] { 1,2,3,4,5,6,7,8 }));
    Assertions.assertEquals(5, Main.secondBiggestNumberV3(new int[] { 5,6 }));
    Assertions.assertEquals(34, Main.secondBiggestNumberV3(new int[] { 5,6,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV3(new int[] { 100,99,20,30,51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV3(new int[] { 100,20,30, 99, 51,34 }));
    Assertions.assertEquals(99, Main.secondBiggestNumberV3(new int[] { 100,20,30, 51,34, 99 }));
    Assertions.assertEquals(3333, Main.secondBiggestNumberV3(new int[] { 1,3333, 2, 4444, 3,4,5,6,7,8,9,10,11,12,13,14,15,16,20,21,25,26,28,39,27,29,100,2012,144,99,1000,2000 }));
  }
}
