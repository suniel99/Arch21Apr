/* Generated By:JJTree&JavaCC: Do not edit this line. IndexicalLucidParserTokenManager.java */
package gipsy.GIPC.intensional.SIPL.IndexicalLucid;
import gipsy.GIPC.intensional.SimpleNode;
import gipsy.GIPC.util.Node;
import gipsy.GIPC.util.ParseException;
import gipsy.GIPC.util.SimpleCharStream;
import gipsy.GIPC.util.Token;
import gipsy.GIPC.util.TokenMgrError;
import gipsy.interfaces.AbstractSyntaxTree;
import marf.util.Debug;

public class IndexicalLucidParserTokenManager implements IndexicalLucidParserConstants
{
        int iCount = 0;

        void commonTokenAction(Token poToken)
        {
              System.out.println(poToken.image);
        }
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1fe0380fe00L) != 0L)
         {
            jjmatchedKind = 51;
            return 28;
         }
         if ((active0 & 0x1000000000000000L) != 0L)
            return 4;
         if ((active0 & 0x80000000L) != 0L)
            return 50;
         return -1;
      case 1:
         if ((active0 & 0x2000803000L) != 0L)
            return 28;
         if ((active0 & 0x1de0300ce00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 51;
               jjmatchedPos = 1;
            }
            return 28;
         }
         return -1;
      case 2:
         if ((active0 & 0x1603000800L) != 0L)
            return 28;
         if ((active0 & 0x1e80000c600L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 2;
            return 28;
         }
         return -1;
      case 3:
         if ((active0 & 0xc800004400L) != 0L)
            return 28;
         if ((active0 & 0x12000008200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 3;
            return 28;
         }
         return -1;
      case 4:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 4;
            return 28;
         }
         if ((active0 & 0x12000008000L) != 0L)
            return 28;
         return -1;
      case 5:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 5;
            return 28;
         }
         return -1;
      case 6:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 6;
            return 28;
         }
         return -1;
      case 7:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 51;
            jjmatchedPos = 7;
            return 28;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 35:
         return jjStopAtPos(0, 42);
      case 37:
         return jjStopAtPos(0, 32);
      case 38:
         return jjStopAtPos(0, 26);
      case 40:
         return jjStopAtPos(0, 54);
      case 41:
         return jjStopAtPos(0, 55);
      case 42:
         return jjStopAtPos(0, 30);
      case 43:
         return jjStopAtPos(0, 28);
      case 44:
         return jjStopAtPos(0, 59);
      case 45:
         return jjStopAtPos(0, 29);
      case 46:
         return jjStartNfaWithStates_0(0, 60, 4);
      case 47:
         return jjStartNfaWithStates_0(0, 31, 50);
      case 59:
         return jjStopAtPos(0, 58);
      case 60:
         jjmatchedKind = 18;
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 61:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 62:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 64:
         return jjStopAtPos(0, 41);
      case 91:
         return jjStopAtPos(0, 56);
      case 93:
         return jjStopAtPos(0, 57);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x201000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0xc00L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2400001000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10000002000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4002000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x800000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x1000008000L);
      case 124:
         return jjStopAtPos(0, 27);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 102:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 28);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000L);
      case 105:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000200L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000800L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L);
      case 114:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(1, 23, 28);
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x10200000000L);
      case 118:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(2, 33, 28);
         break;
      case 100:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 28);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(2, 24, 28);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1800000c000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 114:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 28);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 116:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 28);
         break;
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 121:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 28);
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 110:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 28);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 28);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 38, 28);
         break;
      case 118:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 40, 28);
         break;
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 28);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 116:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 37, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 28);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec1 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec3 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec4 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec5 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec6 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec7 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 68;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 50:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(63, 64);
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 9);
                  else if (curChar == 47)
                     jjAddStates(10, 12);
                  else if (curChar == 37)
                  {
                     if (kind > 61)
                        kind = 61;
                  }
                  else if (curChar == 36)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAdd(28);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(13, 15);
                  else if (curChar == 39)
                     jjAddStates(16, 17);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAddStates(18, 20);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddStates(21, 23);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if (curChar == 39)
                     jjAddStates(16, 17);
                  break;
               case 10:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if (curChar == 39 && kind > 49)
                     kind = 49;
                  break;
               case 13:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 11);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 18:
                  if (curChar == 34)
                     jjCheckNAddStates(13, 15);
                  break;
               case 19:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 21:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 22:
                  if (curChar == 34 && kind > 50)
                     kind = 50;
                  break;
               case 23:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(24, 27);
                  break;
               case 24:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 25:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 27:
                  if (curChar != 36)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(28);
                  break;
               case 28:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if (curChar == 37 && kind > 61)
                     kind = 61;
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 9);
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(31, 32);
                  break;
               case 32:
                  if (curChar != 46)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddStates(28, 30);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddStates(28, 30);
                  break;
               case 35:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(36);
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddTwoStates(36, 8);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 38);
                  break;
               case 39:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAddTwoStates(40, 8);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(31, 33);
                  break;
               case 43:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(44);
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(44, 8);
                  break;
               case 45:
                  if (curChar != 48)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddStates(18, 20);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddTwoStates(47, 2);
                  break;
               case 48:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddTwoStates(48, 2);
                  break;
               case 49:
                  if (curChar == 47)
                     jjAddStates(10, 12);
                  break;
               case 51:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 52:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 53:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 54:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 56:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 57:
                  if (curChar == 42)
                     jjCheckNAddStates(34, 36);
                  break;
               case 58:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(59, 57);
                  break;
               case 59:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(59, 57);
                  break;
               case 60:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 61:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 62:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 63:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 64:
                  if (curChar == 42)
                     jjCheckNAddStates(37, 39);
                  break;
               case 65:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(66, 64);
                  break;
               case 66:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(66, 64);
                  break;
               case 67:
                  if (curChar == 47 && kind > 8)
                     kind = 8;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAdd(28);
                  }
                  else if ((0x4000000140000000L & l) != 0L)
                  {
                     if (kind > 61)
                        kind = 61;
                  }
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 43)
                     kind = 43;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(40, 41);
                  break;
               case 8:
                  if ((0x5000000050L & l) != 0L && kind > 47)
                     kind = 47;
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 12:
                  if (curChar == 92)
                     jjAddStates(42, 44);
                  break;
               case 13:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 19:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 20:
                  if (curChar == 92)
                     jjAddStates(45, 47);
                  break;
               case 21:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(13, 15);
                  break;
               case 27:
               case 28:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(28);
                  break;
               case 29:
                  if ((0x4000000140000000L & l) != 0L && kind > 61)
                     kind = 61;
                  break;
               case 34:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(48, 49);
                  break;
               case 38:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(50, 51);
                  break;
               case 42:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(52, 53);
                  break;
               case 46:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(47);
                  break;
               case 47:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddTwoStates(47, 2);
                  break;
               case 51:
                  jjAddStates(0, 2);
                  break;
               case 56:
                  jjCheckNAddTwoStates(56, 57);
                  break;
               case 58:
               case 59:
                  jjCheckNAddTwoStates(59, 57);
                  break;
               case 63:
                  jjCheckNAddTwoStates(63, 64);
                  break;
               case 65:
               case 66:
                  jjCheckNAddTwoStates(66, 64);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 28:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(28);
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 19:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(13, 15);
                  break;
               case 51:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(0, 2);
                  break;
               case 56:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(56, 57);
                  break;
               case 58:
               case 59:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(59, 57);
                  break;
               case 63:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(63, 64);
                  break;
               case 65:
               case 66:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjCheckNAddTwoStates(66, 64);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 68 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   51, 52, 54, 31, 32, 37, 38, 41, 42, 8, 50, 61, 62, 19, 20, 22, 
   10, 12, 46, 48, 2, 4, 5, 8, 19, 20, 24, 22, 33, 34, 8, 41, 
   42, 8, 57, 58, 60, 64, 65, 67, 6, 7, 13, 14, 16, 21, 23, 25, 
   35, 36, 39, 40, 43, 44, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec0[i2] & l2) != 0L);
      default : 
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec3[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec7[i2] & l2) != 0L);
      default : 
         if ((jjbitVec1[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, 
"\144\151\155\145\156\163\151\157\156", "\145\154\163\145", "\145\156\144", "\146\151", "\151\146", 
"\164\150\145\156", "\167\150\145\162\145", "\75", "\76", "\74", "\75\75", "\74\75", "\76\75", 
"\41\75", "\157\162", "\141\156\144", "\156\157\164", "\46", "\174", "\53", "\55", 
"\52", "\57", "\45", "\141\163\141", "\146\142\171", "\165\160\157\156", 
"\167\166\162", "\146\151\162\163\164", "\156\145\170\164", "\160\162\145\166", 
"\151\163\145\157\144", "\100", "\43", null, null, null, null, null, null, null, null, null, null, 
null, "\50", "\51", "\133", "\135", "\73", "\54", "\56", null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x3fce8ffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
static final long[] jjtoSpecial = {
   0x1c0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[68];
private final int[] jjstateSet = new int[136];
protected char curChar;
public IndexicalLucidParserTokenManager(SimpleCharStream stream)
{
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public IndexicalLucidParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 68; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
