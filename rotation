class Solution
{
  public:
        vector <int> rotate (int n, int d)
        {
             d=d%16;
            int mask=(1<<16)-1;
            int x=(n<<d|n>>(16-d))&mask;
            int y=(n>>d|n<<(16-d))&mask;
            return {x,y};
        }
};
