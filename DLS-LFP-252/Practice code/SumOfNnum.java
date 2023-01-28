class SumOfNnum {
    public static void main(String[] args)
    {
        int num = 2;
        int sum = 0;
        for(int i=num;i>=0;i--)
        {
            sum = sum + i;
        }
        System.out.println(sum+" is the sum of "+ num +" Naturals Numbers.");
    }
}