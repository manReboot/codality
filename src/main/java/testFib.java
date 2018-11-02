import java.util.Arrays;

public class testFib {

    public static void main(String[] args) {

        //String helloTest  ="abcdeffghiklmnopqrtsuvwxyz";
        int A[] = {};

       // String temp = SimpleUtility.reverse(helloTest,helloTest.length());
        System.out.println(SimpleUtility.missingNum(A));
        //System.out.println(temp);

    }

    public static class SimpleUtility {
        public static String reverse(String testString, int len) {
            if (len == 1)
                return String.valueOf(testString.charAt(--len));
            else {
                    String temp = reverse(testString, --len);
                    return String.valueOf(testString.charAt(len)) + temp;
            }
        }

        public static int missingNum(int[] A) {

            int temp=1,i =0;

            if( A.length == 1 )
            {
                if(A[0] - 1 == 0) temp = A[i] + 1;

                return temp;
            }

            else if (A.length == 0 ) return temp;

            Arrays.sort(A);

            do
            {
                if( A[i+1] - A[i] > 1 )
                {
                   temp = ((A[i] + 1)< 0) ? 1 :(A[i] + 1) ;
                   break;
                }

                if( (i+1) == A.length-1 ){
                    temp = A[i+1] + 1;
                    break;}
                else i++;

            } while(true);



            return temp;
        }

        public static String reverseArray(int []A )
        {
            int half = A.length / 2;
            int i=0, temp1 =0, k =0;
            do
            {
                k = A.length - i - 1;

                temp1 = A[i];
                A[i] = A[k];
                A[k] = temp1;

            }while(++i<half);

            return Arrays.toString(A);
        }


        public static int pairing(int[] A){

            Arrays.sort(A);
            int length = A.length / 2;

            int i =0,unique=-1;

            while (length > 0){

                if( A[i+1] - A[i] !=0 )
                {

                    if( A[i + 2 ] ==  A[i+1] ) unique = A[i];
                    else unique = A[i+1];
                    break;
                }

            i = i +2;
            length --;
            }


            if( unique < 0 ) unique = A[A.length-1];

            return unique;

        }

        public static int missingNum1(int[] A) {

            long value=0;
            int length=A.length;
            value=((length*(length+1))/2);
            for(int i=0;i<length;i++)
            {
                if(!(A[i]==(length+1)))
                {
                    value-=A[i];
                }
            }
            //value=((length*(length+1))/2);
            //return (int) (value-sum);
            return (int) value;
        }

        public static int dividedArray(int A[])
        {
            int total = 0;

            for(int i : A)
            {
                total +=  i;
            }

            int totaltemp =0, min = Integer.MAX_VALUE , count = 0 ;

            for(int i =1 ; i < A.length ; i++)
            {
                count += A[i-1];
                totaltemp = total - count;

                min = Math.min(min,Math.abs(totaltemp - count));

            }

            return min;
        }

    }
}
