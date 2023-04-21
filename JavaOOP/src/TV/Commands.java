package TV;

//import java.util.HashMap;
//import java.util.Map;
//
//public class Commands {
// private final Map<Integer, TV.Commands> commandsByNumber = new HashMap<Integer, TV.Commands>();
//
//     public void initialise(boolean isSmartTv ) {
//         register(0, new On());
//         register(1, new Off());
//         register(2, new ChannelUp());
//         register(3, new ChannelDown());
//
//         if (isSmartTv) {
//             register(4, new StartRecording());
//             }
//         }
//
//     public void execute(int commandNumber) {
//         TV.Commands c = commandsByNumber.get( commandNumber );
//
//         if ( c != null ) {
//             c.execute();
//             }
//        }
//
//     private void register( int commandNumber, final TV.Commands c ){
//         commandsByNumber.put( commandNumber, c );
//     }
// }

