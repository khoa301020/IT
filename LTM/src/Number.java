class CustomNumber {
    int number;
    public CustomNumber(int number) {
        this.number = Math.abs(number);
    }
    public boolean isPrime() {
        for (int i=2; i<=Math.round(Math.sqrt(number)); i++)
        {
            if (number%i==0) return false;
        }
        return true;
    }
    public boolean isSquared() {
        int sq = (int) Math.round(Math.sqrt(number));
        return Math.pow(sq,2) == number;
    }
    public boolean isPerfect() {
        if (number < 6) return false;
        long sum = 0L;
        for (int i = 2; i<=Math.round(Math.sqrt(number)); i++) {
            if (number % i ==0) {
                sum+= i + number / i;
            }
        }
        return number == sum;
    }
    public boolean isArmstrong() {
        int remainingDigit = number, numberOfDigits = 0, sum = 0, lastDigit;
        while (remainingDigit > 0) {
            numberOfDigits++;
            remainingDigit /= 10;
        }
        remainingDigit = number;
        while (remainingDigit > 0)
        {
            lastDigit = remainingDigit % 10;
            remainingDigit /= 10;
            sum += Math.pow(lastDigit, numberOfDigits);
        }
        if (sum == number)
            return true;
        return false;
    }
    public int sumDigits() {
        int remainingDigit = number, sum = 0, lastDigit;
        while (remainingDigit > 0) {
            lastDigit = remainingDigit % 10;
            sum+=lastDigit;
            remainingDigit /= 10;
        }
        return sum;
    }
    public int multipleDigits() {
        if (number == 0) return 0;
        int remainingDigit = number, multipled = 1, lastDigit;
        while (remainingDigit > 0) {
            lastDigit = remainingDigit % 10;
            multipled*=lastDigit;
            remainingDigit /= 10;
        }
        return multipled;
    }
    public static int gcd(int first_number, int last_number) {
        return (last_number==0)?first_number:gcd(last_number, first_number%last_number);
    }
    public static int lcm(int first_number, int last_number) {
        return Math.abs(first_number*last_number)/gcd(first_number, last_number);
    }

}