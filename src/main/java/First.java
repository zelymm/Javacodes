public class First {

        public static void main(String[] args) {

            // 구현시작

            자동차 a자동차1 = new 자동차();
                a자동차1.최고속력 = 230;

            자동차 a자동차2 = new 자동차();
                a자동차2.최고속력 = 210;

            // 구현끝

            a자동차1.달리다();
            // 출력 => 자동차가 최고속력 230km로 달립니다.

            a자동차2.달리다();
            // 출력 => 자동차가 최고속력 210km로 달립니다.
        }
    }

    class 자동차 {

        int 최고속력;

        // 구현
        void 달리다() {
            int 최고속력;
                System.out.printf("자동차가 최고속력"+this.최고속력+"km로 달립니다.\n");

        }
    }



