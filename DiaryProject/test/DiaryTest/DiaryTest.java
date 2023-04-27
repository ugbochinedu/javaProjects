//package DiaryTest;
//
//import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DiaryTest {
//    private DiaryInterface diary;
//   // private Entry entry;
//
//    @BeforeEach
//
//    void SetUp(){
//       diary = new Diary();
//    }
//
//    @Test
//    public void testThatDiaryExists(){
//        assertNotNull(diary);
//    }
//    @Test
//    public void testThatDiaryIsEmpty(){
//        int noOfEntries = diary.getNoOfEntries();
//        assertEquals(0, noOfEntries);
//    }
//    @Test
//    public void testThatEntryCanBeAddedToDiaryAndSizeIncreased(){
//        Entry entry = new Entry();
//        entry.setTopic("A native");
//        entry.setContent("A native has a laptop");
//        diary.addEntry(entry);
//        int noOfEntries = diary.getNoOfEntries();
//        assertEquals(1, noOfEntries);
//    }
//
//}
